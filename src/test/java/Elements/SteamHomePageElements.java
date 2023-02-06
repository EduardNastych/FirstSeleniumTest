package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamHomePageElements extends BasePage {
    public SteamHomePageElements(WebDriver driver) {
        super(driver);
    }

    private final static String HEADER_LOGIN_BUTTON = "//a[text()='увійти']";

    public WebElement getOpenLoginWindow() {
        return waitUntilElementIsVisible(HEADER_LOGIN_BUTTON);
    }
}
