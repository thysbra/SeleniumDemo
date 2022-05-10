package be.refleqt.testing.support;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver = null;

    public static void createWebDriver() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    public static void quitWebDriver() {
        driver.quit();
        driver = null;
    }

    public static WebDriver getWebDriver() {
        return driver;
    }
}
