package be.refleqt.testing.pages;

import be.refleqt.testing.support.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ShoppingCartPage {
    @FindBy(className = "cart_item")
    List<WebElement> cartItems;

    private WebDriver driver;
    WebDriverWait wait;

    public ShoppingCartPage() {
        this.driver = DriverManager.getWebDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    }

    public ShoppingCartPage validateItem(int amountOfItems){
        Assert.assertEquals(cartItems.size(), amountOfItems);
        return this;
    }
}
