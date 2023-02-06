package Pages;

import Elements.BookingNewYorkPageElements;
import org.openqa.selenium.WebDriver;

public class BookingNewYorkPage extends BookingNewYorkPageElements {
    public BookingNewYorkPage(WebDriver driver) {
        super(driver);
    }

    public BookingNewYorkPage chooseHotel() {
        getRandomItem(getChooseHotelFromList());
        return this;
    }
}
