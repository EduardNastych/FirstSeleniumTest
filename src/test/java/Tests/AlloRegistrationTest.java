package Tests;

import Base.BaseTest;
import DataProvider.DataProviderAlloRegistration;
import Pages.AlloHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlloRegistrationTest extends BaseTest {
    private String URL ="https://allo.ua/";
    @Test(dataProvider = "randomUserDataRegistration", dataProviderClass = DataProviderAlloRegistration.class)
    public void alloRegistrationTest(String name, String phone, String mail, String password) {
        AlloHomePage alloHomePage = new AlloHomePage(driver);

        openUrl(URL);
        alloHomePage.openRegistrationField();
        alloHomePage.makeRegistration(name, phone, mail, password);

        sleep(5);
        Assert.assertTrue(alloHomePage.getPopupNotification().isDisplayed());
    }
}
