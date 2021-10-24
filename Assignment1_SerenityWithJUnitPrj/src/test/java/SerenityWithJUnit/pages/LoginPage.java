package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.dev.evozon.com/customer/account/login/")
public class LoginPage extends PageObject {
    @FindBy(id = "email")
    private WebElementFacade emailInput;

    @FindBy(id="pass")
    private WebElementFacade passInput;

    @FindBy(id="send2")
    private WebElementFacade loginButton;

    public void type_email(String email) {
        emailInput.waitUntilVisible().type(email);
    }

    public void type_pass(String pass) {
        passInput.waitUntilVisible().type(pass);
    }

    public void click_login_button() {
        loginButton.waitUntilClickable().click();
    }
}
