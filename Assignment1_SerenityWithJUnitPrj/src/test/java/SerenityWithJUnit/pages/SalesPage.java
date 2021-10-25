package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

@DefaultUrl("http://qa1.dev.evozon.com/sale.html")
public class SalesPage extends PageObject {

    @FindBy(className = "products-grid")
    private WebElementFacade products;


    @FindBy(className = "page-title")
    private WebElementFacade pageTitle;

    public Boolean is_sales_page_loaded(){
        return products.waitUntilVisible().isVisible() && Objects.equals(pageTitle.getText(), "SALE");
    }

    public List<Float> getOldPrices() {
        return products.findElements(By.cssSelector("p.old-price span.price")).stream()
                .map(WebElement::getText)
                .map(el -> el.replaceAll("[^0-9.]", ""))
                .map(Float::parseFloat)
                .collect(Collectors.toList());
    }

    public List<Float> getSpecialPrices() {
        return products.findElements(By.cssSelector("p.special-price span.price")).stream()
                .map(WebElement::getText)
                .map(el -> el.replaceAll("[^0-9.]", ""))
                .map(Float::parseFloat)
                .collect(Collectors.toList());
    }
}
