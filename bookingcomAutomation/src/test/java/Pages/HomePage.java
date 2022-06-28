package Pages;

import DriverSetUp.DriverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends DriverPage {

    By destinationTxt = By.id("ss");
    By destinationClick = By.className("search_hl_name");
    By checkInDate = By.xpath("//*[@data-date='2022-07-13']");
    By checkOutDate = By.xpath("//*[@data-date='2022-07-21']");
    By guestsCount = By.className("xp__guests__count");
    By guestsType = By.xpath("//*[@aria-label='Yetişkin sayısını azaltın']");
    By searchBtn = By.className("sb-searchbox__button");

    public void destinationSelect(String city){
        driver.findElement(destinationTxt).sendKeys(city);
        driver.findElement(destinationClick).click();
    }

    //Handling hidden elements in Selenium
    public void checkInSelect(){

        List<WebElement> allItems= driver.findElements(checkInDate);
        for (WebElement oneItem: allItems) {
            if(oneItem.isDisplayed()) {
                oneItem.click();
                break;
            }
        }
    }

    //Handling hidden elements in Selenium
    public void checkOutSelect() {
        List<WebElement> allItems= driver.findElements(checkOutDate);
        for (WebElement oneItem: allItems) {
            if(oneItem.isDisplayed()) {
                oneItem.click();
                break;
            }
        }
    }
    public void guestsSelect(){
         driver.findElement(guestsCount).click();
         driver.findElement(guestsType).click();
    }
    public void setSearchBtn(){
        driver.findElement(searchBtn).click();
    }
}
