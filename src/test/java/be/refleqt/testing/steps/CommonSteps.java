package be.refleqt.testing.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {

    static WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }


    @Given("I visit {string}")
    public void i_visit(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
