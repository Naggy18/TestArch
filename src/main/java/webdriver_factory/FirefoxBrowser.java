package webdriver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements Browser{

    private WebDriver driver;
    @Override
    public WebDriver getDriver() {
        driver = new FirefoxDriver();
        return driver;
    }

    @Override
    public void quitDriver() {
        driver.quit();
    }
}
