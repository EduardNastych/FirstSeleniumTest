package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookingHomePageElements extends BasePage {
    public BookingHomePageElements(WebDriver driver) {
        super(driver);
    }

    private final static String HEADER_LANGUAGE_BUTTON = "//button[@data-tooltip-text = 'Выберите язык']";
    private final static String CHOOSE_LANGUAGE_BUTTON = "//div[@class = 'bui-inline-container__main'][contains(text(), 'English (UK)')]";
    private final static String SEARCH_FIELD = "//input[@id = 'ss']";
    private final static String CHOOSE_COUNTRY_BUTTON = "//ul[@class = 'c-autocomplete__list sb-autocomplete__list sb-autocomplete__list-with_photos -visible']//li";
    private final static String DATA_FIELD = "//span[@class = 'sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb']";
    private final static String DATA_IN_FIELD = "//td[@data-date = '2023-02-08']";
    private final static String DATA_OUT_FIELD = "//td[@data-date = '2023-02-13']";
    private final static String SEARCH_HOTELS_BUTTON = "//span[contains(text(),'Search')]";

    public WebElement getClickLanguageButton() {
        return waitUntilElementIsClickAble(HEADER_LANGUAGE_BUTTON);
    }

    public WebElement getChangeLanguage() {
        return waitUntilElementIsClickAble(CHOOSE_LANGUAGE_BUTTON);
    }

    public WebElement getSearchField() {
        return waitUntilElementIsClickAble(SEARCH_FIELD);
    }

    public List<WebElement> getChooseCountry() {
        return waitUntilElementsIsClickable(CHOOSE_COUNTRY_BUTTON);
    }

    public WebElement getClickDataField() {
        return waitUntilElementIsClickAble(DATA_FIELD);
    }

    public WebElement getSelectDataIn() {
        return waitUntilElementIsClickAble(DATA_IN_FIELD);
    }

    public WebElement getSelectDataOut() {
        return waitUntilElementIsClickAble(DATA_OUT_FIELD);
    }

    public WebElement getClickSearchButton() {
        return waitUntilElementIsClickAble(SEARCH_HOTELS_BUTTON);
    }
}
