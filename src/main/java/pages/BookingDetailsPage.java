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
    private By confirmReservationBtnLocator = By.xpath("//div[@class='hprt-reservation-cta']//button");
    private By checkInDateLocator = By.xpath("//div[@data-placeholder='Check-in']");
    private By checkOutDateLocator = By.xpath("//div[@data-placeholder='Check-out']");

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

    public WebElement getCheckInDate() {
        return driver.findElement(checkInDateLocator);
    }

    public WebElement getCheckOutDate() {
        return driver.findElement(checkOutDateLocator);
    }

}
