package Pages;

import Elements.AlloIphone12PageElements;
import org.openqa.selenium.WebDriver;

public class AlloIphone12Page extends AlloIphone12PageElements {
    public AlloIphone12Page(WebDriver driver) {
        super(driver);
    }
    public AlloIphone12Page clickOnCompareButton() {
        getClickCompareButton().click();
        return this;
    }
    public AlloIphone12Page openComparePage() {
        getOpenComparePage().click();
        return this;
    }
}
