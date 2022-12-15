package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTests {

    public static WebDriver driver;

    @BeforeSuite
    public void startDriverAndOpenBrowser() {
        String chromePath = System.getProperty("user.dir") + "\\resources\\chromedriver.exe";
        ChromeOptions option = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.navigate().to("https://www.booking.com/");
    }


    @AfterSuite(enabled = true)
    public void stopDriver() {
        driver.quit();
    }
}