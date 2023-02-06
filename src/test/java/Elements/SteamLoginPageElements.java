package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamLoginPageElements extends BasePage {
    public SteamLoginPageElements(WebDriver driver) {
        super(driver);
    }

    private final static String LOGIN_INPUT = "(//input[@class='newlogindialog_TextInput_2eKVn'])[1]";
    private final static String PASSWORD_INPUT = "//input[@type='password']";
    private final static String LOGIN_BUTTON = "//button[text()='Увійти']";
    public final static String POPUP_NOTIFICATION = "//div[text()='Будь ласка, перевірте логін і пароль свого акаунта, а потім спробуйте знову.']";

    public WebElement getClickOnLoginInput() {
        return waitUntilElementIsClickAble(LOGIN_INPUT);
    }

    public WebElement getClickOnPasswordInput() {
        return waitUntilElementIsClickAble(PASSWORD_INPUT);
    }

    public WebElement getClickOnLoginButton() {
        return waitUntilElementIsClickAble(LOGIN_BUTTON);
    }
    public WebElement getPopupNotification(){
        return waitUntilElementIsVisible(POPUP_NOTIFICATION);
    }

}
