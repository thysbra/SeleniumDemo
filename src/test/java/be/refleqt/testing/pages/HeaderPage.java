package be.refleqt.testing.pages;

import be.refleqt.testing.support.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderPage {
    @FindBy(id = "shopping_cart_container")
    WebElement shoppingCartBtn;

    private WebDriver driver;
    WebDriverWait wait;

    public HeaderPage() {
        this.driver = DriverManager.getWebDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    }

    public ShoppingCartPage goToShoppingCart(){
        shoppingCartBtn.click();
        return new ShoppingCartPage();

    }
}
