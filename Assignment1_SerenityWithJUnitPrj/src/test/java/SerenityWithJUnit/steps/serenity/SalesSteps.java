package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.BooksAndMusicPage;
import SerenityWithJUnit.pages.SalesPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SalesSteps {
    SalesPage salesPage;

    @Step
    public void waits_for_page_to_load() {
        Assert.assertEquals(true, salesPage.is_books_and_music_page_loaded());
    }

    @Step
    public void checks_prices() {
        List<Float> oldPrices = salesPage.getOldPrices();
        List<Float> reducedPrices = salesPage.getSpecialPrices();
        Assert.assertEquals(oldPrices.size(), reducedPrices.size());
        for (int i = 0; i < oldPrices.size(); i++) {
            assertTrue(oldPrices.get(i) > reducedPrices.get(i));
        }
    }
}
