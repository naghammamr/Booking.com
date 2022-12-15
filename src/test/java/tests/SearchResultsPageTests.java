package tests;

import org.testng.annotations.Test;
import pages.SearchResultsPage;

public class SearchResultsPageTests extends BaseTests {

    SearchResultsPage searchResultsPage;
    String hotelName = "Tolip Hotel Alexandria";

    @Test
    public void userCanSeeAvailabilityForSpecificHotel() {
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.availabilityButton(hotelName).click();
    }
}
