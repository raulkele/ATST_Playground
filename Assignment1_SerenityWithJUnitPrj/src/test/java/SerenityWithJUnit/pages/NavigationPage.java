package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("http://qa1.dev.evozon.com/")
public class NavigationPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"nav\"]/ol/li[5]")
    private WebElementFacade saleTab;

    @FindBy(xpath = "//*[@id=\"nav\"]/ol/li[4]")
    private WebElementFacade homeAndDecorTab;

    public void go_to_sale_page() {
        saleTab.click();
    }

    public void go_to_books_and_music_page() {
        withAction().moveToElement(homeAndDecorTab).perform();
        waitForElement().until(ExpectedConditions.
                elementToBeClickable(By.xpath("//*[@id=\"nav\"]/ol/li[4]/ul/li[2]/a"))).click();
    }
}
