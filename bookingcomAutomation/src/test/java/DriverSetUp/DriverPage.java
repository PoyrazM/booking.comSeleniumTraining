package DriverSetUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;



public class DriverPage {

    public static WebDriver driver;
    public static JavascriptExecutor jse;
    WebDriverManager manager;
    String baseUrl = "https://www.booking.com/" ;

    @BeforeSuite
    public void setDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        manager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("*****BROWSER IS STARTING*****");
        String expectedTitle = "Booking.com | Resmi site | Oteller, uçak biletleri, araç kiralama ve konaklamalar";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle," Titles are not matching! ");
    }

    @BeforeTest
    public void setJsExecutor(){
            jse = (JavascriptExecutor) driver ;
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("*****TEST FINISHED***** ");
        if (driver != null) {
            driver.quit();
        }
    }
}




