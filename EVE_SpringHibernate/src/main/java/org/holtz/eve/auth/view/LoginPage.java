package org.holtz.eve.auth.view;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.panel.SignInPanel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 * This Login page might not be the most elegant way to log into Wicket. It works, but refactoring it is a bit lower on our current to-do list.
 */
public class LoginPage extends WebPage {
    private String username;

    private String password;

    public LoginPage() {
        setDefaultModel(new CompoundPropertyModel(this));

        Form form = new Form("signInForm") {
            @Override
            protected void onSubmit() {
                if (signIn(username, password)) {
                    onSignInSucceeded();
                } else {
                    onSignInFailed();
                }
            }
        };

        form.add(new TextField("username").setRequired(true));
        form.add(new PasswordTextField("password").setRequired(true));

        add(new FeedbackPanel("feedback"));
        add(form);
    }

    /**
     * Sign in user if possible.
     *
     * @param username The username
     * @param password The password
     * @return True if signin was successful
     */
    public boolean signIn(String username, String password) {
        return AuthenticatedWebSession.get().signIn(username, password);
    }

    protected void onSignInFailed() {
        // Try the component based localizer first. If not found try the
        // application localizer. Else use the default
        error(getLocalizer().getString("signInFailed", this, "Sign in failed"));
    }

    protected void onSignInSucceeded() {
        // If login has been called because the user was not yet
        // logged in, than continue to the original destination,
        // otherwise to the Home page
   // 	setResponsePage(getApplication().getSessionSettings().getPageFactory().newPage(getApplication().getHomePage(), (PageParameters) null));
    	continueToOriginalDestination();
    } 
}
