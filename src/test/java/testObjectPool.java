import org.openqa.selenium.WebDriver;

public class testObjectPool {
    public testObjectPool() {
    }
    static objectPool pool;
    public static void main(String[] args) {
     pool = new objectPool();
     test1();
     test2();
    }

    public static void test1(){
        WebDriver driver = pool.getDriver();
        driver.get("https://www.google.com");
        pool.releaseDriver(driver);
    }

    public static void test2(){
        WebDriver driver = pool.getDriver();
        driver.get("https://github.com/");
        pool.releaseDriver(driver);
        pool.quitDriver();
    }

}
