package org.holtz.eve.auth;

import java.io.IOException;
import java.security.Principal;
import java.security.acl.Group;
import java.util.Enumeration;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import org.apache.log4j.Logger;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

/**
 * Wicket Session class that uses JAAS to authenticate and authorize.
 * 
 * Note that I've left the logging in so you can see how it all works in the log.
 */
public class WicketJaasSession extends AuthenticatedWebSession {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 
	 * The name of the (java.security.acl.Group) group that the JBoss LdapLoginModule uses to put the authenticated user's roles in.
	 * I don't know if this is a standard or an implementation detail, so it might be different on another server or JBoss version.
	 */
	public static final String ROLES_GROUP_NAME = "Roles";

	/** This name maps to the name of the application-policy in the JBoss login-config.xml */
	public static final String APPLICATION_POLICY_NAME = "mysecuritydomain";

	private final static Logger log = Logger.getLogger(WicketJaasSession.class);
	
	private Subject subject;
	private Roles roles = new Roles();
	
    public WicketJaasSession(AuthenticatedWebApplication app, Request request) {
        super(request);
    }

    public boolean authenticate(String username, String password) {
    	if (log.isDebugEnabled()) {
			// SECURITY WARNING: The password is logged in the clear here. Handy to get all this to work, but remove ASAP.
    		log.debug("Entering JAASBasedSession.authenticate(" + username + ", " + password + ")");
    	}

    	boolean authenticated = false;
    	LoginCallbackHandler handler = new LoginCallbackHandler(username, password);
    	try {
    		LoginContext ctx = new LoginContext(APPLICATION_POLICY_NAME, handler);
			ctx.login();
			authenticated = true;
			subject = ctx.getSubject();
			
			for (Principal p : subject.getPrincipals()) {
				if (log.isDebugEnabled()) {
					// Watch this debug line if something doesn't work for you: the structure that is returned might
					// differ in naming and structure. The JBoss LdapLoginModule returns two principals. One has the
					// user itself, the other is called "Roles", is a Group and holds the role names that the user
					// is authorized for (i.e. belongs to in the LDAP).
					log.debug("Principal for " + username + ": " + p.toString());
				}
				
				// Group is a subclass of Principal, and the members are the names of the roles
				// as set up in the LDAP. In my example this is the cn attribute of an LDAP Group.
				if ((p instanceof Group) && (ROLES_GROUP_NAME.equalsIgnoreCase(p.getName()))) {
					Group g = (Group) p;
					Enumeration<? extends Principal> members = g.members();
					while (members.hasMoreElements()) {
						Principal member = members.nextElement();
						roles.add(member.getName());
						if (log.isDebugEnabled()) {
							log.debug("Added role " + member.getName() + " for username " + username + ".");
						}
					}
				}
			}
		} catch (LoginException e) {
			// You'll get a LoginException on a failed username/password combo.
			authenticated = false;
		}
        return authenticated;
    }

    public Roles getRoles() {
        return roles;
    }

    private class LoginCallbackHandler implements CallbackHandler {

    	private String username;
    	private String password;
    	
    	public LoginCallbackHandler(String username, String password) {
    		this.username = username;
    		this.password = password;
    	}
    	
		public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
	    	for (int i = 0; i < callbacks.length; i++) {
				Callback callback = callbacks[i];
				if (callback instanceof NameCallback) {
					((NameCallback) callback).setName(username);
				} else if (callback instanceof PasswordCallback) {
					PasswordCallback pwCallback = (PasswordCallback) callback;
					pwCallback.setPassword(password.toCharArray());
				} else {
					throw new UnsupportedCallbackException(callbacks[i], "Callback type not supported");
				}
			}
		}
    	
    }
}
