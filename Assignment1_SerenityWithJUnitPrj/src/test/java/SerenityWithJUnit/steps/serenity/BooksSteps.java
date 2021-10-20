package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.BooksAndMusicPage;
import SerenityWithJUnit.pages.NavigationPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.Locale;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BooksSteps {
    BooksAndMusicPage booksAndMusicPage;


    @Step
    public void waits_for_page_to_load() {
        Assert.assertEquals(true, booksAndMusicPage.is_books_and_music_page_loaded());
    }

    @Step
    public void finds_item(String itemName) {
        assertThat(booksAndMusicPage.getProductNames(), hasItem(containsString(itemName.toLowerCase(Locale.ROOT))));
    }

    @Step
    public void cant_find_item(String itemName) {
        assertThat(booksAndMusicPage.getProductNames(), not(hasItem(itemName.toLowerCase(Locale.ROOT))));
    }
}
