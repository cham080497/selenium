package models.components;

public class InternalLoginPage extends LoginPage{
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
