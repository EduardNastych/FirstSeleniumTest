package Tests;

import Base.BaseTest;
import Pages.AlloHomePage;
import Pages.AlloPowerBanksPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlloCartTest extends BaseTest {
    private String URL ="https://allo.ua/";
    @Test
    public void addProductToCart() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        AlloPowerBanksPage alloPowerBanksPage = new AlloPowerBanksPage(driver);

        openUrl(URL);
        alloHomePage.moveOnCategoryPowerBank();
        alloHomePage.clickOnPowerBank10000mah();
        alloPowerBanksPage.clickOnButtonBuy();
        doubleClick(alloPowerBanksPage.getClickButtonAdd());

        Assert.assertTrue(alloPowerBanksPage.getCheckPrice().isDisplayed());
    }

}
