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
    public Object[][] userRegisterData() throws IOException {
        ExcelReader ER = new ExcelReader();
        return ER.getDataFromExcel();
    }

    @Test
    public void userCanSearchPerSelectedLocationAndDates() {
        homePage = new HomePage(driver);
        homePage.setLocation("Alexandria");
        homePage.getCheckInDayButton().click();
        homePage.selectDay("January", "1");
        homePage.selectDay("January", "14");
        homePage.getSearchButton().click();
    }

}
