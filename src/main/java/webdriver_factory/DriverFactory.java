package webdriver_factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    public Browser browser;
    public static Browser createDriver(BrowserTypes type){
        Browser browser = null;
        switch(type){
            case CHROME:
                browser = new ChromeBrowser();
                break;
            case FIREFOX:
                browser = new FirefoxBrowser();
                break;
            default:
                throw new IllegalArgumentException("Browser Type is not available");

        }
        return browser;
    }
}
