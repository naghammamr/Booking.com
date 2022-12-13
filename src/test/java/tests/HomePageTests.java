package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests extends BaseTests {

    HomePage homePage;

    @Test
    public void xxx() {
        homePage = new HomePage(driver);
    }

}
