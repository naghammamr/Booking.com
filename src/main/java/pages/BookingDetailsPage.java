package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class BookingDetailsPage {
    private WebDriver driver;

    public BookingDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By bedRadioBtnLocator = By.xpath("//tr[1]//td//div[@class='rt-bed-type-select']//input");
    private By selectRoomsAmountDropDownLocator = By.id("hprt_nos_select_78883120_91939502_0_33_0");
    private By confirmReservationBtnLocator = By.id("b_tt_holder_2");

}
