package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReservationPage {
    private WebDriver driver;

    public ReservationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By hotelNameTextLocator = By.xpath("//h1[@class='fcab3ed991']");

    public WebElement getHotelName() {
        return driver.findElement(hotelNameTextLocator);
    }

}
