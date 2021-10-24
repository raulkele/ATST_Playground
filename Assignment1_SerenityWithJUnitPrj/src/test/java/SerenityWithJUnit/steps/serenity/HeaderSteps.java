package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.HeaderPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HeaderSteps {
    HeaderPage headerPage;

    @Step
    public void goes_to_login_page() {
        headerPage.navigate_to_login();
    }

    @Step
    public void logs_out_of_account() {
        headerPage.log_out_of_account();
    }

    @Step
    public void should_see_login_button() {
        headerPage.click_account_button();
        Assert.assertEquals(true, headerPage.is_login_button_visible());
    }

    @Step
    public void should_see_logout_button() {
        headerPage.click_account_button();
        Assert.assertEquals(true, headerPage.is_logout_button_visible());
    }
}
