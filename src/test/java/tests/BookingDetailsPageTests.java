package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookingDetailsPage;

import java.util.ArrayList;

public class BookingDetailsPageTests extends BaseTests {

    BookingDetailsPage bookingDetailsPage;

    @Test
    public void userSearchIsCorrect() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        bookingDetailsPage = new BookingDetailsPage(driver);
        String checkInDate = bookingDetailsPage.getCheckInDate().getText();
        String checkOutDate = bookingDetailsPage.getCheckOutDate().getText();
        Assert.assertEquals(checkInDate, "Sun, Jan 1");
        Assert.assertEquals(checkOutDate, "Sat, Jan 14");
    }

    @Test
    public void userCanReserveRoom() {
        bookingDetailsPage = new BookingDetailsPage(driver);

        bookingDetailsPage.selectBed();
        bookingDetailsPage.selectRoomsAndAmountDropDownLocator(1);
        bookingDetailsPage.confirmReservationButton().click();
    }

}
