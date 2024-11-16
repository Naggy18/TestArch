package TestCases;

import org.openqa.selenium.WebDriver;
import webdriver_factory.BrowserPool;
import webdriver_factory.BrowserTypes;

public class testBrowserPool {
    static BrowserPool pool;
    public static void main(String[] args) {
        pool = new BrowserPool();
        test1();
        test2();
        pool.quitDriver(BrowserTypes.CHROME);
        pool.quitDriver(BrowserTypes.FIREFOX);
    }

    public static void test1(){
        WebDriver driver = pool.getDriver(BrowserTypes.CHROME);
        driver.get("https://www.google.com");
        pool.releaseDriver(driver,BrowserTypes.CHROME);
    }

    public static void test2(){
        WebDriver driver = pool.getDriver(BrowserTypes.FIREFOX);
        driver.get("https://github.com/");
        pool.releaseDriver(driver,BrowserTypes.FIREFOX);
    }

}
