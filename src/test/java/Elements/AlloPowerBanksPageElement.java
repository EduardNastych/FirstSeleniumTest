package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloPowerBanksPageElement extends BasePage {
    public AlloPowerBanksPageElement(WebDriver driver) {
        super(driver);
    }
    private final static String BUY_BUTTON = "//button[@title='Купити']";
    private final static String ADD_BUTTON = "//*[@*='/_nuxt/172935c1228d249e5a6bbd160cc6558a.svg#i-plus']";
    private final static String CLOSE_BUTTON = "//div[@class='v-modal__close-btn']//*[@xmlns='http://www.w3.org/2000/svg']";
    private final static String ALLO_LOGO = "(//a[@class='v-logo'])[1]";
    private final static String PRICE = "//span[@class='total-box__price']";
    public WebElement getClickButtonBuy() {
        return waitUntilElementIsVisible(BUY_BUTTON);
    }
    public WebElement getClickButtonAdd() {
        return waitUntilElementIsClickAble(ADD_BUTTON);
    }
    public WebElement getClickCloseButton() {
        return waitUntilElementIsClickAble(CLOSE_BUTTON);
    }

    public WebElement getClickOnAlloLogo() {
        return waitUntilElementIsVisible(ALLO_LOGO);
    }
    public WebElement getCheckPrice(){
        return waitUntilElementIsVisible(PRICE);
    }
}
