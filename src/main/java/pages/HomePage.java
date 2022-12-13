package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By locationFieldLocator = By.id("ss");
    private By checkInFieldLocator = By.xpath("//div[@data-calendar2-type='checkin']//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
    private By checkOutFieldLocator = By.xpath("//div[@data-calendar2-type='checkout']//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
    private By searchBtnLocator = By.xpath("//button[@class='sb-searchbox__button ']");

}
