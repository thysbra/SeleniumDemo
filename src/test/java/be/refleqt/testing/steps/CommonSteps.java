package be.refleqt.testing.steps;

import be.refleqt.testing.support.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {

    @Before
    public void beforeScenario() {
        DriverManager.createWebDriver();
    }

    @After
    public void afterScenario() {
        DriverManager.quitWebDriver();
    }

    @Given("I visit {string}")
    public void iVisit(String webSite) {
        DriverManager.getWebDriver().get(webSite);
    }
}
