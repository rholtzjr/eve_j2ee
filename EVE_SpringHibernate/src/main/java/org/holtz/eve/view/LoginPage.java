package org.holtz.eve.view;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.feedback.ComponentFeedbackMessageFilter;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.markup.html.panel.ComponentFeedbackPanel;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.hibernate.Session;

public class LoginPage extends WebPage {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoginPage() {
	final LoginForm form = new LoginForm("loginForm");
	add(form);

    }

    private static class LoginForm extends StatelessForm {

	private static final long serialVersionUID = -1L;

	private String username;
	private String password;

	public LoginForm(String id) {
	    super(id);
	    setModel(new CompoundPropertyModel(this));
	    add(new Label("usernameLabel", getString("login.username.label", null, "Username")));
	    add(new RequiredTextField("username"));
	    add(new Label("passwordLabel", getString("login.password.label", null, "Username")));
	    add(new PasswordTextField("password"));
	    add(new FeedbackPanel("feedback"));

	}

	@Override
	protected void onSubmit() {
	    AuthenticatedWebSession session = AuthenticatedWebSession.get();
	    if (session.signIn(username, password)) {
	    setDefaultResponsePageIfNecessary();
		
	    } else {
		error(getString("login.failed.badcredentials"));
	    }
	}

	private void setDefaultResponsePageIfNecessary() {
		AuthenticatedWebSession session = AuthenticatedWebSession.get();
		if (! session.isSignedIn()) {
		setResponsePage(getApplication().getHomePage());
		session.invalidate();
	    }
	}
    }

}
