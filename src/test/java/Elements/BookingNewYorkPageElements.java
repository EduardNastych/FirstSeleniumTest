package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookingNewYorkPageElements extends BasePage {
    public BookingNewYorkPageElements(WebDriver driver) {
        super(driver);
    }

    private final static String RANDOM_HOTEL_FROM_LIST = "//div[@data-testid='property-card']";
    private final static String FOOTER_BUTTON_SEARCH = "//button[@id='newsletter_button_footer']";
    private final static String AVAILABLE_BUTTON = "(//span[@class='e57ffa4eb5'])[1]";

    public List<WebElement> getChooseHotelFromList() {
        return waitUntilElementsIsVisible(RANDOM_HOTEL_FROM_LIST);
    }

    public WebElement getCheckScroll() {
        return waitUntilElementIsClickAble(FOOTER_BUTTON_SEARCH);
    }
    public WebElement getAvailableButton(){
        return waitUntilElementIsVisible(AVAILABLE_BUTTON);
    }

}
