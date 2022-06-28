package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class SearchPage extends BaseTest {
    private By result= By.cssSelector("#result-stats:first-of-type");
    public SearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public boolean isPresent(){
        return driver.findElement(result).isDisplayed();
    }
}
