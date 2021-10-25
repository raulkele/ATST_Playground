package SerenityWithJUnit.steps.serenity;

import SerenityWithJUnit.pages.SalesPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SalesSteps {
    SalesPage salesPage;

    @Step
    public void waits_for_page_to_load() {
        assertEquals(true, salesPage.is_sales_page_loaded());
    }

    @Step
    public void checks_prices() {
        List<Float> oldPrices = salesPage.getOldPrices();
        List<Float> reducedPrices = salesPage.getSpecialPrices();
        assertEquals(oldPrices.size(), reducedPrices.size());
        for (int i = 0; i < oldPrices.size(); i++) {
            assertTrue(oldPrices.get(i) > reducedPrices.get(i));
        }
    }
}
