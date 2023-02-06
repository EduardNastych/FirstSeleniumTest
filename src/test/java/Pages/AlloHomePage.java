package Pages;

import Elements.AlloHomePageElements;
import org.openqa.selenium.WebDriver;

public class AlloHomePage extends AlloHomePageElements {
    public AlloHomePage(WebDriver driver) {
        super(driver);
    }

    public AlloHomePage findIphone11() {
        getOpenAlloSearch().sendKeys("iphone 11");
        getClickSearchPin().click();
        return this;
    }

    public AlloHomePage openLoginField() {
        getOpenLoginWindow().click();
        return this;
    }

    public AlloHomePage makeLogin(String login, String password) {
        getClickOnLoginInput().sendKeys(login);
        getClickOnPasswordLoginInput().sendKeys(password);
        getClickOnLoginButton().click();
        return this;
    }

    public AlloHomePage makeRegistration(String name, String phone, String mail, String password) {
        getClickOnNameInput().sendKeys(name);
        getClickOnPhoneInput().sendKeys(phone);
        getClickOnMailInput().sendKeys(mail);
        getClickOnPasswordRegistrationInput().sendKeys(password);
        getClickOnRegistrationButton().click();
        return this;
    }

    public AlloHomePage openRegistrationField() {
        getOpenLoginWindow().click();
        getOpenRegistrationWindow().click();
        return this;
    }

    public AlloHomePage moveOnCategoryPowerBank() {
        moveCursor(getCategoryPowerBanks());
        return this;
    }

    public AlloHomePage clickOnPowerBank10000mah() {
        moveCursor(getPowerbanks10000mah());
        getPowerbanks10000mah().click();
        return this;
    }



}



