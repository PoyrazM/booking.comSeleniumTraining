package TestPages;

import DriverSetUp.DriverPage;
import Pages.FilteredResultPage;
import Pages.HomePage;
import Pages.HotelPage;
import Pages.ResultsPage;
import org.testng.annotations.Test;

public class BaseTest extends DriverPage {
    HomePage home;
    ResultsPage results;
    FilteredResultPage filteredResults;
    HotelPage hotel;

    @Test(priority=1)
    void destinationSelect() {
        home = new HomePage();
        home.destinationSelect("London");
        home.checkInSelect();
        home.checkOutSelect();
        home.guestsSelect();
        home.setSearchBtn();
    }

    @Test(priority = 2)
    void filterDetails(){
        results = new ResultsPage();
        results.setSwitchPrice();
        results.dragAndDropPrice();
    }

    @Test(priority = 3)
    void selectOneResult() {
        filteredResults = new FilteredResultPage();
        filteredResults.selectHotel();
    }

    @Test(priority = 4)
    void selectHotel(){
        hotel = new HotelPage();
        hotel.checkReservation();
    }
}


