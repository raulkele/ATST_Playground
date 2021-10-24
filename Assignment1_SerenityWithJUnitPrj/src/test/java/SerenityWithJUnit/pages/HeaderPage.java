package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.dev.evozon.com/")
public class HeaderPage  extends PageObject {

    @FindBy(className = "skip-account")
    private WebElementFacade account;

    @FindBy(xpath = "//*[@id=\"header-account\"]/div/ul/li[6]/a")
    private WebElementFacade logInButton;

    @FindBy(xpath = "//*[@id=\"header-account\"]/div/ul/li[5]/a")
    private WebElementFacade logOutButton;

    public Boolean is_login_button_visible(){ return logInButton.waitUntilVisible().isVisible(); }
    public Boolean is_logout_button_visible() { return logOutButton.waitUntilVisible().isVisible();}

    public void click_account_button() {
        account.waitUntilVisible().click();
    }

    public void click_login_button() {
        logInButton.waitUntilVisible().click();
    }

    public void click_logout_button() {
        logOutButton.waitUntilVisible().click();
    }

    public void navigate_to_login() {
        if(!logInButton.isVisible())
            account.waitUntilVisible().click();
        logInButton.waitUntilVisible().click();
    }

    public void log_out_of_account() {
        if(!logOutButton.isVisible())
            account.waitUntilVisible().click();
        logOutButton.waitUntilVisible().click();
    }
}
