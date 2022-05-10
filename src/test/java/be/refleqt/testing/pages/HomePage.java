package be.refleqt.testing.pages;

import be.refleqt.testing.support.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    @FindBy(id = "user-name")
    WebElement usernameFld;

    @FindBy(id = "password")
    WebElement passwordFld;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    private WebDriver driver;
    WebDriverWait wait;

    public HomePage() {
        this.driver = DriverManager.getWebDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(45));
    }

    public HomePage fillInUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameFld));
        usernameFld.sendKeys(username);
        return this;
    }

    public HomePage fillInPassword(String password) {
        passwordFld.sendKeys(password);
        return this;
    }

    public ProductListingPage login() {
        loginBtn.click();
        return new ProductListingPage();
    }

}
