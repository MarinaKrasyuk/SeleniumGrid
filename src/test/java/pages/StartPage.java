package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.BaseTest;

public class StartPage extends BaseTest {

    private By searchInput = By.xpath("//*[@class='gLFyf gsfi']");
    private By searchBtn = By.xpath("(//*[@class='gNO89b'])[1]");

    public StartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SearchPage clickSearch() {
        driver.findElement(searchInput).sendKeys("weather");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
        driver.findElement(searchBtn).click();

        return new SearchPage(driver,wait);
    }
}
