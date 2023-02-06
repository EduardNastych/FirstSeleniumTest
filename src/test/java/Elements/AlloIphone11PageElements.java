package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloIphone11PageElements extends BasePage {
    public AlloIphone11PageElements(WebDriver driver) {
        super(driver);
    }
    private final static String IPHONE11 = "//a[text()='Apple iPhone 11 128GB White (MHDJ3) Slim Box']";
    private final static String COMPARE_BUTTON = "(//*[text()='Порівняти'])[2]";
    private final static String SEARCH_FIELD = "//input[@placeholder='Пошук товарів']";
    private final static String SEARCH_PIN = "//button[@class='search-form__submit-button']";
    private final static String IPHONE12 = "//a[text()='Apple iPhone 12 128GB Purple (MJNP3)']";
    public WebElement getClickOnIphone11() {
        return waitUntilElementIsClickAble(IPHONE11);
    }
    public WebElement getClickCompareButton() {
        return waitUntilElementIsClickAble(COMPARE_BUTTON);
    }
    public WebElement getOpenAlloSearch() {
        return waitUntilElementIsClickAble(SEARCH_FIELD);
    }
    public WebElement getClickSearchPin() {
        return waitUntilElementIsClickAble(SEARCH_PIN);
    }
    public WebElement getClickOnIphone12() {
        return waitUntilElementIsClickAble(IPHONE12);
    }
}
