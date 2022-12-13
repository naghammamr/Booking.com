package tests;

import org.testng.annotations.Test;
import pages.ConfirmationPage;

public class ConfirmationPageTests extends BaseTests {

    ConfirmationPage confirmationPage;

    @Test
    public void xx() {
        confirmationPage = new ConfirmationPage(driver);
    }
}
