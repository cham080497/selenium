

package models.components;

public class ExternalLoginPage extends LoginPage {
    @Override
    protected String username() {
        return null;
    }

    @Override
    protected String password() {
        return null;
    }

    @Override
    protected String loginBtn() {
        return null;
    }
}
