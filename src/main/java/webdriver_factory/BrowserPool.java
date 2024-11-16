package webdriver_factory;

import org.openqa.selenium.WebDriver;
import webdriver_factory.Browser;
import webdriver_factory.BrowserTypes;
import webdriver_factory.DriverFactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public class BrowserPool {
    private Map<String,Queue<WebDriver>> driverObjects;
    private Queue<WebDriver> driverQueue;
    public BrowserPool() {
        driverObjects = new ConcurrentHashMap<>();
        driverQueue = new LinkedList<>();
    }
    public Browser createDriver(BrowserTypes types){
            return DriverFactory.createDriver(types);
    }

    public WebDriver getDriver(BrowserTypes types) {
        if(driverObjects.containsKey(types.toString())) {
            System.out.println(hashCode());
            return driverObjects.get(types.toString()).poll();
        }
        return createDriver(types).getDriver();
    }
    public void releaseDriver(WebDriver driver, BrowserTypes types) {
        driverQueue.offer(driver);
        driverObjects.put(types.toString(),driverQueue);
    }

    public void quitDriver(BrowserTypes types){
        driverQueue = driverObjects.get(types.toString());
            while(!driverQueue.isEmpty()){
                driverQueue.poll().quit();
            }
        }
}
