package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
    LoginPage loginPage;

    @Step
    public void types_in_email(String email) {
        loginPage.type_email(email);
    }

    @Step
    public void types_in_password(String pass) {
        loginPage.type_pass(pass);
    }

    @Step
    public void clicks_login_button() {
        loginPage.click_login_button();
    }
}
