package Pages;

import DriverSetUp.DriverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HotelPage extends DriverPage {

    By reservationBtn = By.id("hp_book_now_button");


    public void checkReservation(){
        List<String> myTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(myTabs.get(1));
        driver.findElement(reservationBtn).click();
    }
}



