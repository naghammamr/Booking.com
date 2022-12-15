package tests;

import data.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;
import java.util.Locale;

public class HomePageTests extends BaseTests {

    HomePage homePage;

    @DataProvider(name = "ExcelData")
    public Object[][] reservationData() throws IOException {
        ExcelReader ER = new ExcelReader();
        return ER.getDataFromExcel();
    }

    @Test(dataProvider = "ExcelData")
    public void userCanSearchPerSelectedLocationAndDates(String location, String month) {
        homePage = new HomePage(driver);
        homePage.setLocation(location);
        homePage.getCheckInDayButton().click();
        homePage.selectDay(month, "1");
        homePage.selectDay(month, "14");
        homePage.getSearchButton().click();
    }

}
