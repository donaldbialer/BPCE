package BPCE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {

    private static WebDriver driver = null;
    private static String url = "https:www.facebook.com";//*/https:www.facebook.com/";//"https://www.expedia.com/",https://darksky.net/;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/donaldbialer/BrowserDrivers/chromedriver0");
        driver = new ChromeDriver();
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown() {
        //quit the selenium driver
        driver.quit();
    }
}

