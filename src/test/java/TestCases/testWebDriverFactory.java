package TestCases;

import data_factory.DataSources;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webdriver_factory.Browser;
import webdriver_factory.BrowserTypes;
import webdriver_factory.DriverFactory;

public class testWebDriverFactory {
    public static Browser browser;
    public static WebDriver driver;
    public static DriverFactory driverFactory = new DriverFactory();
    @BeforeClass
    public void setUp() {
        browser = driverFactory.createDriver(BrowserTypes.CHROME);
    }
    @Test
    public void test() {
        browser.getDriver().get("https://www.google.com");
        browser.quitDriver();
    }
}
