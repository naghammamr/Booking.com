package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement availabilityButton(String hotelName) {
        return driver.findElement(By.xpath("//div[@class='a1b3f50dcd f7c6687c3d a1f3ecff04 f996d8c258'][contains(.,'" + hotelName + "')]//span[@class='e57ffa4eb5']"));
    }
}
