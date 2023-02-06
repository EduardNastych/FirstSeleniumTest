package Pages;

import Elements.SteamHomePageElements;
import org.openqa.selenium.WebDriver;

public class SteamHomePage extends SteamHomePageElements {
    public SteamHomePage(WebDriver driver) {
        super(driver);
    }

    public SteamHomePage openLoginWindow() {
        getOpenLoginWindow().click();
        return this;
    }
}


