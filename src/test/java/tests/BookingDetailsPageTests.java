package tests;

import org.testng.annotations.Test;
import pages.BookingDetailsPage;

public class BookingDetailsPageTests extends BaseTests {

    BookingDetailsPage bookingDetailsPage;

    @Test
    public void userCanReserveRoom() {
        bookingDetailsPage = new BookingDetailsPage(driver);
        bookingDetailsPage.selectBed();
        bookingDetailsPage.selectRoomsAndAmountDropDownLocator(1);
        bookingDetailsPage.confirmReservationButton().click();
    }

}
