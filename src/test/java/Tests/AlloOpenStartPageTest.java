package Tests;

import Base.BaseTest;
import Pages.AlloHomePage;
import Pages.AlloPowerBanksPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlloOpenStartPageTest extends BaseTest {
    private String URL ="https://allo.ua/";
    @Test
    public void openStartPageTest() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        AlloPowerBanksPage alloPowerBanksPage = new AlloPowerBanksPage(driver);

        openUrl(URL);
        alloHomePage.moveOnCategoryPowerBank();
        alloHomePage.clickOnPowerBank10000mah();
        alloPowerBanksPage.clickOnButtonBuy();
        alloPowerBanksPage.clickOnCloseButton();
        alloPowerBanksPage.openAlloHomePage();

        String expectedURL = "https://allo.ua/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Actual page URL is not the same as expected.");
    }
}
