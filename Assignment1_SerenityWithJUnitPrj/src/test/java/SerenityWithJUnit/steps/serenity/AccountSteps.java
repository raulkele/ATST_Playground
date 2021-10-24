package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.AccountPage;
import org.junit.Assert;

public class AccountSteps {
    AccountPage accountPage;

    public void should_see_dashboard() {
        Assert.assertEquals(true, accountPage.is_dashboard_visible());
    }
}
