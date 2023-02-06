package Pages;

import Elements.AlloIphone11PageElements;
import org.openqa.selenium.WebDriver;

public class AlloIphone11Page extends AlloIphone11PageElements {
    public AlloIphone11Page(WebDriver driver) {
        super(driver);
    }
    public AlloIphone11Page clickOnIphone11() {
        getClickOnIphone11().click();
        return this;
    }
    public AlloIphone11Page clickOnCompareButton() {
        getClickCompareButton().click();
        return this;
    }
    public AlloIphone11Page findIphone12() {
        getOpenAlloSearch().sendKeys("iphone 12");
        getClickSearchPin().click();
        return this;
    }
    public AlloIphone11Page clickOnIphone12() {
        getClickOnIphone12().click();
        return this;
    }
}
