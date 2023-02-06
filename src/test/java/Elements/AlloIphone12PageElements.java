package Elements;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlloIphone12PageElements extends BasePage {
    public AlloIphone12PageElements(WebDriver driver) {
        super(driver);
    }
    private final static String COMPARE_BUTTON = "(//*[text()='Порівняти'])[2]";
    private final static String HEADER_COMPARE_ICON = "//a[@aria-label='Порівняти']";
    public WebElement getClickCompareButton() {
        return waitUntilElementIsClickAble(COMPARE_BUTTON);
    }
    public WebElement getOpenComparePage() {
        return waitUntilElementIsClickAble(HEADER_COMPARE_ICON);
    }
}
