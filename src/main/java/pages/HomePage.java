package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By locationFieldLocator = By.name("ss"); //input[@name='ss']
    private By openCheckDatesLocator = By.xpath("//button[@class='d47738b911 e246f833f7 fe211c0731']");
    private By checkInFieldLocator = By.xpath("//div[@data-calendar2-type='checkin']//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
    private By checkOutFieldLocator = By.xpath("//div[@data-calendar2-type='checkout']//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']");
    private By searchBtnLocator = By.xpath("//button[@class='fc63351294 a822bdf511 d4b6b7a9e7 cfb238afa1 af18dbd5a4 f4605622ad aa11d0d5cd']");

    public void setLocation(String location) {
        driver.findElement(locationFieldLocator).sendKeys(location);
    }

    public void setCheckIn(String checkInDate) {
        driver.findElement(checkInFieldLocator).sendKeys(checkInDate);
    }

    public void setCheckOut(String checkOutDate) {
        driver.findElement(checkOutFieldLocator).sendKeys(checkOutDate);
    }

    public void selectDay(String month, String day) {
        driver.findElement(By.xpath("//div[@class='f261b68fe6'][contains(.,'" + month + "')]//span[text()='" + day + "']")).click();
    }

    public WebElement getCheckInDayButton() {
        return driver.findElement(openCheckDatesLocator);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchBtnLocator);
    }


}
