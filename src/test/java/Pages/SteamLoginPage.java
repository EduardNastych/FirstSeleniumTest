package Pages;

import Elements.SteamLoginPageElements;
import org.openqa.selenium.WebDriver;

public class SteamLoginPage extends SteamLoginPageElements {
    public SteamLoginPage(WebDriver driver) {
        super(driver);
    }

    public SteamLoginPage writeValidUsername() {
        getClickOnLoginInput().sendKeys("anyashyta");
        return this;
    }

    public SteamLoginPage writeValidPassword() {
        getClickOnPasswordInput().sendKeys("eduard27072002");
        return this;
    }

    public SteamLoginPage clickOnLoginButton() {
        getClickOnLoginButton().click();
        return this;
    }

}
