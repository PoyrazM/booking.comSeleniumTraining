package Pages;

import DriverSetUp.DriverPage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ResultsPage extends DriverPage {
    By switchPrice = By.className("f89122bbdb");

    public void setSwitchPrice(){
        jse.executeScript("window.scrollBy(0,400)","");
        WebElement switchCheck = driver.findElement(switchPrice);
        switchCheck.click();
    }

    public void dragAndDropPrice(){
        Actions actions = new Actions(driver);
        WebElement slidePrice = driver.findElement(By.cssSelector("input[type='range']"));
        actions.dragAndDropBy(slidePrice, 50, 0).perform();
    }
}
