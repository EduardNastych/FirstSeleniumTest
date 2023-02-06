package Tests;

import Base.BaseTest;
import DataProvider.DataProviderAlloNegativeLogin;
import DataProvider.DataProviderAlloNegativePassword;
import DataProvider.DataProviderAlloPositiveLogin;
import Pages.AlloHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AlloLoginTests extends BaseTest {
    private String URL = "https://allo.ua/";

    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderAlloPositiveLogin.class)
    public void positiveLoginTest(String login, String password) {
        openUrl(URL);
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        alloHomePage.openLoginField();
        alloHomePage.makeLogin(login, password);

        String expectedURL = "https://allo.ua/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Actual page URL is not the same as expected.");
    }

    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderAlloNegativeLogin.class)
    public void negativeLoginTestWithInvalidPassword(String login, String password) {
        openUrl(URL);
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        alloHomePage.openLoginField();
        alloHomePage.makeLogin(login, password);

        sleep(5);
        Assert.assertTrue(alloHomePage.getErrorMessage().isDisplayed(), "Error message is not appeared");
    }

    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderAlloNegativePassword.class)
    public void negativeLoginTestWithInvalidLogin(String login, String password) {
        openUrl(URL);
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        alloHomePage.openLoginField();
        alloHomePage.makeLogin(login, password);

        sleep(5);
        Assert.assertTrue(alloHomePage.getHelpMessage().isDisplayed(), "Error message is not appeared");
    }
}
