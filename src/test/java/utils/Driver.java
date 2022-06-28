package utils;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Driver {
    private  static WebDriver driver;
    private Driver() {

    }

    public static WebDriver getDriver() throws MalformedURLException {

        if (driver == null) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            // driver=new ChromeDriver();
            FirefoxOptions browserOptions = new FirefoxOptions();
           // browserOptions.setCapability("browserVersion", "100");
            browserOptions.setCapability("platformName", "Windows");
// Showing a test name instead of the session id in the Grid UI
            browserOptions.setCapability("se:name", "My simple test");
// Other type of metadata can be seen in the Grid UI by clicking on the
// session info or via GraphQL
            browserOptions.setCapability("se:sampleMetadata", "Sample metadata value");
            URL url = new URL("http://192.168.37.1:4444");
            driver = new RemoteWebDriver(url, browserOptions);
        }
        return driver;
    }

    public static void driverClose() {
        System.out.print("close(): ");
        if (driver != null) {
           // driver.quit();
            driver = null;
        }
    }
}
