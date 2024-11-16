package webdriver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements Browser{

private WebDriver driver;
    @Override
    public WebDriver getDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    @Override
    public void quitDriver() {
        driver.quit();
    }
}
