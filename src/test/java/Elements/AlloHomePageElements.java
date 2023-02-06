package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloHomePageElements extends BasePage {
    public AlloHomePageElements(WebDriver driver) {
        super(driver);
    }

    private final static String SEARCH_FIELD = "//input[@placeholder='Пошук товарів']";
    private final static String HEADER_LOGIN_ICON = "//button[@aria-label='Профіль']";
    private final static String LOGIN_FIELD = "//input[@placeholder='Введіть телефон або e-mail *']";
    private final static String PASSWORD_FIELD = "//input[@placeholder='Введіть пароль *']";
    private final static String LOGIN_BUTTON = "//button[contains(text(),'Вхід')]";
    private final static String REGISTRATION_LINK_BUTTON = "//li[@class='login-tab']";
    private final static String NAME_INPUT = "//input[@id='v-register-name']";
    private final static String PHONE_INPUT = "//input[@id='v-register_telephone_number']";
    private final static String MAIL_INPUT = "//input[@id='v-register-email']";
    private final static String PASSWORD_INPUT = "//input[@id='vregister-password']";
    private final static String REGISTRATION_BUTTON = "//input[@id='vregister-password']";
    private final static String POWERBANKS_CATEGORY_BUTTON = "(//a[@href='https://allo.ua/ua/al-ternativnye-istochniki-jenergii/'])[1]";
    private final static String POWERBANKS_10000mah_CATEGORY_BUTTON = "(//a[@class='mm__a3'])[1]";
    private final static String SEARCH_PIN = "//button[@class='search-form__submit-button']";
    private final static String ERROR_MESSAGE = "//span[text()='Невірний номер телефону або пароль.']";
    private final static String HELP_MESSAGE = "//a[text()='Забули пароль? Надіслати код на телефон.']";
    private final static String POPUP_NOTIFICATION = "//span[text()='Користувач з ел.адресою natalianastych@icloud.com вже зареєстрований. Будь ласка авторизуйтесь.']";





    public WebElement getOpenAlloSearch() {
        return waitUntilElementIsClickAble(SEARCH_FIELD);
    }

    public WebElement getOpenLoginWindow() {
        return waitUntilElementIsClickAble(HEADER_LOGIN_ICON);
    }

    public WebElement getClickOnLoginInput() {
        return waitUntilElementIsClickAble(LOGIN_FIELD);
    }

    public WebElement getClickOnPasswordLoginInput() {
        return waitUntilElementIsClickAble(PASSWORD_FIELD);
    }

    public WebElement getClickOnLoginButton() {
        return waitUntilElementIsClickAble(LOGIN_BUTTON);
    }

    public WebElement getOpenRegistrationWindow() {
        return waitUntilElementIsClickAble(REGISTRATION_LINK_BUTTON);
    }

    public WebElement getClickOnNameInput() {
        return waitUntilElementIsClickAble(NAME_INPUT);
    }

    public WebElement getClickOnPhoneInput() {
        return waitUntilElementIsClickAble(PHONE_INPUT);
    }

    public WebElement getClickOnMailInput() {
        return waitUntilElementIsClickAble(MAIL_INPUT);
    }

    public WebElement getClickOnPasswordRegistrationInput() {
        return waitUntilElementIsClickAble(PASSWORD_INPUT);
    }

    public WebElement getClickOnRegistrationButton() {
        return waitUntilElementIsClickAble(REGISTRATION_BUTTON);
    }

    public WebElement getCategoryPowerBanks() {
        return waitUntilElementIsClickAble(POWERBANKS_CATEGORY_BUTTON);
    }

    public WebElement getPowerbanks10000mah() {
        return waitUntilElementIsClickAble(POWERBANKS_10000mah_CATEGORY_BUTTON);
    }
    public WebElement getClickSearchPin() {
        return waitUntilElementIsClickAble(SEARCH_PIN);
    }
    public WebElement getErrorMessage(){
        return waitUntilElementIsVisible(ERROR_MESSAGE);
    }
    public WebElement getHelpMessage(){
        return waitUntilElementIsVisible(HELP_MESSAGE);
    }
    public WebElement getPopupNotification(){
        return waitUntilElementIsVisible(POPUP_NOTIFICATION);
    }

}
