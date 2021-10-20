package SerenityWithJUnit.features.salesPage;

import SerenityWithJUnit.steps.serenity.NavigationSteps;
import SerenityWithJUnit.steps.serenity.SalesSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckingSalesStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public NavigationSteps navigationSteps;
    @Steps
    public SalesSteps salesSteps;

    @Test
    public void checking_if_sales_are_real() {
        navigationSteps.goes_to_home_page();
        navigationSteps.goes_to_sales_page();
        salesSteps.waits_for_page_to_load();
        salesSteps.checks_prices();
    }
}
