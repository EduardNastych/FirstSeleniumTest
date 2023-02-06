package Tests;

import Base.BaseTest;
import Pages.AlloHomePage;
import Pages.AlloIphone11Page;
import Pages.AlloIphone12Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlloCompareProductsTest extends BaseTest {
    private String URL ="https://allo.ua/";
    @Test
    public void compareTwoProducts() {
        AlloHomePage alloHomePage = new AlloHomePage(driver);
        AlloIphone11Page alloIphone11Page = new AlloIphone11Page(driver);
        AlloIphone12Page alloIphone12Page = new AlloIphone12Page(driver);

        openUrl(URL);
        alloHomePage.findIphone11();
        alloIphone11Page.clickOnIphone11();
        alloIphone11Page.clickOnCompareButton();
        alloIphone11Page.findIphone12();
        alloIphone11Page.clickOnIphone12();
        alloIphone12Page.clickOnCompareButton();
        alloIphone12Page.openComparePage();

        String expectedURL = "https://allo.ua/ua/catalog/product_compare/index/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "Actual page URL is not the same as expected.");
    }
}
