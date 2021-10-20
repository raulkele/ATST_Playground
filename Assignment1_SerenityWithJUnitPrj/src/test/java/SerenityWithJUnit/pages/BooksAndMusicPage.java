package SerenityWithJUnit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

@DefaultUrl("http://qa1.dev.evozon.com/home-decor/books-music.html")
public class BooksAndMusicPage extends PageObject {

    @FindBy(className = "products-grid")
    private WebElementFacade products;

    @FindBy(className = "page-title")
    private WebElementFacade pageTitle;

    public Boolean is_books_and_music_page_loaded(){
        return products.waitUntilVisible().isVisible() && Objects.equals(pageTitle.getText(), "BOOKS & MUSIC");
    }

    public List<String> getProductNames() {
        return products.findElements(By.cssSelector(".product-name")).stream()
                .map(el -> el.getText().toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());
    }
}
