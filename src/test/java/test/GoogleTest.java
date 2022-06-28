package test;

import constant.ConstantURL;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.SearchPage;
import pages.StartPage;

public class GoogleTest extends BaseTest{
    @Test
    public void searchTest(){
        driver.get(ConstantURL.GOOGLE_URL);
        StartPage startPage=new StartPage(driver,wait);
        SearchPage searchPage=startPage.clickSearch();
        Assertions.assertTrue(searchPage.isPresent());

    }
}
