package SerenityWithJUnit.features.login;

import SerenityWithJUnit.helpers.Constants;
import SerenityWithJUnit.steps.serenity.AccountSteps;
import SerenityWithJUnit.steps.serenity.HeaderSteps;
import SerenityWithJUnit.steps.serenity.LoginSteps;
import SerenityWithJUnit.steps.serenity.NavigationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.core.annotation.Order;

@RunWith(SerenityRunner.class)
public class LoggingInAndOutStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    NavigationSteps navigationSteps;
    @Steps
    HeaderSteps headerSteps;
    @Steps
    LoginSteps loginSteps;
    @Steps
    AccountSteps accountSteps;

    @Test
    @Order(1)
    public void logging_in_the_application() {
        navigationSteps.goes_to_home_page();
        headerSteps.goes_to_login_page();
        loginSteps.types_in_email(Constants.testEmail);
        loginSteps.types_in_password(Constants.testPassword);
        loginSteps.clicks_login_button();
        accountSteps.should_see_dashboard();
        headerSteps.should_see_logout_button();
    }

    @Test
    @Order(2)
    public void logging_out_of_application() {
        navigationSteps.goes_to_home_page();
        headerSteps.logs_out_of_account();
        headerSteps.should_see_login_button();
    }
}
