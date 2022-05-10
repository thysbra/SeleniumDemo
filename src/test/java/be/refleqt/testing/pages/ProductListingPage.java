package be.refleqt.testing.pages;

import be.refleqt.testing.support.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductListingPage {
    @FindBy(className = "btn_inventory")
    List<WebElement> itemTilesAddToCartButtons;

    private WebDriver driver;
    WebDriverWait wait;

    public ProductListingPage() {
        this.driver = DriverManager.getWebDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    }

    public ProductListingPage addRandomItemToCart(){
        int random_int = (int)Math.floor(Math.random()*(itemTilesAddToCartButtons.size()+1));
        itemTilesAddToCartButtons.get(random_int).click();
        return this;
    }
}
