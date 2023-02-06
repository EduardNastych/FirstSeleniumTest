package Tests;

import Base.BaseTest;
import Pages.BookingHomePage;
import Pages.BookingNewYorkPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookHotelBookingTest extends BaseTest {
    private String URL = "https://www.booking.com/country/ua.ru.html";
    @Test
    public void bookHotelTest() {
        openUrl(URL);
        BookingHomePage bookingHomePage = new BookingHomePage(driver);
        BookingNewYorkPage bookingNewYorkPage = new BookingNewYorkPage(driver);

        bookingHomePage.changeLanguage();
        bookingHomePage.chooseCountry();
        bookingHomePage.chooseDate();
        bookingHomePage.clickSearchButton();

        bookingNewYorkPage.chooseHotel();

        Assert.assertTrue(bookingNewYorkPage.getAvailableButton().isDisplayed());

    }
}
