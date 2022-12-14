package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ReservationPage;

public class ReservationPageTests extends BaseTests {

    ReservationPage reservationPage;
    String hotelName = "Tolip Hotel Alexandria";

    @Test
    public void userCanViewHotelName() {
        reservationPage = new ReservationPage(driver);
        String actualHotelName = reservationPage.getHotelName().getText();
        System.out.println(actualHotelName);
        Assert.assertTrue(actualHotelName.equalsIgnoreCase(hotelName),"Hotel Name Is Invalid or not displayed!");
    }

}
