package tests;

import data.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;

public class HomePageTests extends BaseTests {

    HomePage homePage;

    @DataProvider(name="ExcelData")
    public Object[][] userRegisterData() throws IOException
    {
        ExcelReader ER = new ExcelReader();
        return ER.getDataFromExcel();
    }

    @Test(dataProvider="ExcelData")
    public void xxx(String location, String checkin, String checkout) {
        homePage = new HomePage(driver);

    }

}
