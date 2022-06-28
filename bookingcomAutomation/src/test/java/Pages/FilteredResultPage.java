package Pages;

import DriverSetUp.DriverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FilteredResultPage extends DriverPage {

    By selectHotelBtn =  By.xpath("(//*[@class='e57ffa4eb5'])[4]");

    public void selectHotel(){
        jse.executeScript("window.scrollBy(0,350)","");
        WebElement btn = driver.findElement(selectHotelBtn);
        driver.findElement(selectHotelBtn).click();
        Assert.assertTrue(btn.isEnabled());
    }
}
