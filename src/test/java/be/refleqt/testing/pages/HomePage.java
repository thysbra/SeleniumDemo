package be.refleqt.testing.pages;

import be.refleqt.testing.steps.CommonSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement submitButton;

    public HomePage() {
        PageFactory.initElements(CommonSteps.getDriver(), this);
    }

    public HomePage fillInUsername(String username){
        usernameField.sendKeys(username);
        return this;
    }

    public HomePage fillInPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }

    public ProductListingPage submitLogin(){
        submitButton.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new ProductListingPage();
    }

}
