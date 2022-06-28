package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.net.MalformedURLException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeAll
    public  static void init() throws MalformedURLException {
        driver= Driver.getDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @AfterAll
    public static void  cleanUp(){
        Driver.driverClose();
    }
}
