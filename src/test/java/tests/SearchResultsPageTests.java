package tests;

import org.testng.annotations.Test;
import pages.SearchResultsPage;

public class SearchResultsPageTests extends BaseTests {

    SearchResultsPage searchResultsPage;

    @Test
    public void xxx() {
        searchResultsPage = new SearchResultsPage(driver);
    }
}
