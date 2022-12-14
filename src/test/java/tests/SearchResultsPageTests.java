package tests;

import org.testng.annotations.Test;
import pages.SearchResultsPage;

public class SearchResultsPageTests extends BaseTests {

    SearchResultsPage searchResultsPage;

    @Test
    public void userCanSeeAvailabilityForSpecificHotel() {
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.availabilityButton("Tolip Hotel Alexandria").click();
    }
}
