package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookingDetailsPage {
    private WebDriver driver;

    public BookingDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By bedRadioBtnLocator = By.xpath("//tr//td//div[@class='rt-bed-type-select']//input");
    private By selectRoomsAndAmountDropDownLocator = By.xpath("//tr//td//div[@class='hprt-block']//select");
    private By confirmReservationBtnLocator = By.id("b_tt_holder_2");

    public void selectBed() {
        driver.findElement(bedRadioBtnLocator).click();
    }

    public void selectRoomsAndAmountDropDownLocator(int rooomIndex) {
        Select select = new Select(driver.findElement(selectRoomsAndAmountDropDownLocator));
        select.selectByIndex(rooomIndex);
    }

    public WebElement confirmReservationButton() {
        return driver.findElement(confirmReservationBtnLocator);
    }

}
