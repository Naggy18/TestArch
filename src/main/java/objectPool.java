import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedList;
import java.util.Queue;

public class objectPool {

    private Queue<WebDriver> driverObjects;
    public objectPool() {
        driverObjects = new LinkedList<>();
    }

    public WebDriver createDriver(){
        return new ChromeDriver();
    }

    public WebDriver getDriver() {
        if(!driverObjects.isEmpty()) {
            System.out.println(hashCode());
            return driverObjects.poll();
        }
        return createDriver();
    }

    public void releaseDriver(WebDriver driver) {
        driverObjects.offer(driver);
    }

    public void quitDriver(){
        while(!driverObjects.isEmpty()){
            driverObjects.poll().quit();
        }
    }
}
