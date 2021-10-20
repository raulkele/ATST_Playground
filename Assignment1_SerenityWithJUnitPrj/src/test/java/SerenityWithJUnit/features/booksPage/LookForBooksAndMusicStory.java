package SerenityWithJUnit.features.booksPage;

import SerenityWithJUnit.steps.serenity.BooksSteps;
import SerenityWithJUnit.steps.serenity.NavigationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LookForBooksAndMusicStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public NavigationSteps navigationSteps;
    @Steps
    public BooksSteps booksSteps;

    @Test
    public void looking_for_alice_in_wonderland_should_be_successful() {
        navigationSteps.goes_to_home_page();
        navigationSteps.goes_to_books_and_music_page();
        booksSteps.waits_for_page_to_load();
        booksSteps.finds_item("Alice in wonder");
    }

    @Test
    public void looking_for_beethoven_should_be_unsuccessful() {
        navigationSteps.goes_to_home_page();
        navigationSteps.goes_to_books_and_music_page();
        booksSteps.waits_for_page_to_load();
        booksSteps.cant_find_item("Symphony 5 in C minor");
    }
}
