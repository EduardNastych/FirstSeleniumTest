package Tests;

import Base.BaseTest;
import Pages.SteamHomePage;
import Pages.SteamLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SteamLoginTests extends BaseTest {

    @Test(priority = 1, groups = { "positiveTests", "smokeTests" })
    public void positiveLoginTest() {
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        SteamLoginPage steamLoginPage = new SteamLoginPage(driver);

        openUrl("https://store.steampowered.com/");
        steamHomePage.openLoginWindow();
        steamLoginPage.writeValidUsername();
        steamLoginPage.writeValidPassword();
        steamLoginPage.clickOnLoginButton();

        String expectedURL = "https://store.steampowered.com/login/?redir=&redir_ssl=1&snr=1_4_4__global-header";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "The required page don`t open");
    }

    @Parameters({"username", "password", "expectedpopUpNotification"})
    @Test(priority = 2, groups = {"negativeTests", "smokeTests"})
    public void negativeLoginTest(String username, String password, String expectedpopUpNotification) {
        SteamHomePage steamHomePage = new SteamHomePage(driver);
        SteamLoginPage steamLoginPage = new SteamLoginPage(driver);

        openUrl("https://store.steampowered.com/");
        steamHomePage.openLoginWindow();
        steamLoginPage.getClickOnLoginInput().sendKeys(username);
        steamLoginPage.getClickOnPasswordInput().sendKeys(password);
        steamLoginPage.clickOnLoginButton();

        sleep(5);
        Assert.assertTrue(steamLoginPage.getPopupNotification().isDisplayed(), "Pop-up notification isn`t visible");

        String actualPopUpNotification = steamLoginPage.getPopupNotification().getText();
        Assert.assertEquals(actualPopUpNotification, expectedpopUpNotification, "Expected message isn`t displayed");
    }
}

