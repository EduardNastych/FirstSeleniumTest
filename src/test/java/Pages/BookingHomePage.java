package Pages;

import Elements.BookingHomePageElements;
import org.openqa.selenium.WebDriver;

public class BookingHomePage extends BookingHomePageElements {
    public BookingHomePage(WebDriver driver) {
        super(driver);
    }

    public void changeLanguage() {
        getClickLanguageButton().click();
        getChangeLanguage().click();
    }

    public BookingHomePage chooseCountry() {
        getSearchField().clear();
        getSearchField().sendKeys("New York");
        getChooseCountry().get(0).click();
        return this;
    }

    public BookingHomePage chooseDate() {
        getClickDataField().click();
        getSelectDataIn().click();
        getSelectDataOut().click();
        return this;
    }
    public BookingHomePage clickSearchButton(){
        getClickSearchButton().click();
        return this;
    }
}
