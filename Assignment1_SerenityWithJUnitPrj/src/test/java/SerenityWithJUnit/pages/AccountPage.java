package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa1.dev.evozon.com/customer/account/")
public class AccountPage  extends PageObject {
    @FindBy(className = "dashboard")
    private WebElementFacade dashboard;

    public Boolean is_dashboard_visible() { return dashboard.waitUntilVisible().isVisible(); }
}
