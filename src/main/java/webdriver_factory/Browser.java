package webdriver_factory;

import org.openqa.selenium.WebDriver;

public interface Browser {
    public WebDriver getDriver();
    public void quitDriver();

}
