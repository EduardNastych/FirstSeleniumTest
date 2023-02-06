package Pages;

import Elements.AlloPowerBanksPageElement;
import org.openqa.selenium.WebDriver;

public class AlloPowerBanksPage extends AlloPowerBanksPageElement {
    public AlloPowerBanksPage(WebDriver driver) {
        super(driver);
    }
    public AlloPowerBanksPage clickOnButtonBuy() {
        getClickButtonBuy().click();
        return this;
    }
    public AlloPowerBanksPage clickOnCloseButton() {
        getClickCloseButton().click();
        return this;
    }
    public AlloPowerBanksPage openAlloHomePage() {
        getClickOnAlloLogo().click();
        return this;
    }
}
