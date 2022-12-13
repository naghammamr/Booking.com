package tests;

import org.testng.annotations.Test;
import pages.BookingDetailsPage;

public class BookingDetailsPageTests extends BaseTests {

    BookingDetailsPage bookingDetailsPage;

    @Test
    public void xx() {
        bookingDetailsPage = new BookingDetailsPage(driver);
    }

}
