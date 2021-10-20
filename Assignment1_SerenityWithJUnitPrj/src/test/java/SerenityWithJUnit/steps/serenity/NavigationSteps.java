package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.NavigationPage;
import net.thucydides.core.annotations.Step;

public class NavigationSteps {
    NavigationPage navigationPage;

    @Step
    public void goes_to_home_page() {
        navigationPage.open();
    }

    @Step
    public void goes_to_sales_page() {
        navigationPage.go_to_sale_page();
    }

    @Step
    public void goes_to_books_and_music_page() {
        navigationPage.go_to_books_and_music_page();
    }
}
