package Base;

import Elements.AlloHomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    WebElement webElement;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement waitUntilElementIsClickAble(String locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public WebElement waitUntilElementIsVisible(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public List<WebElement> waitUntilElementsIsClickable(String locator) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    public List<WebElement> waitUntilElementsIsVisible(String locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    private static Random random = new Random();

    public void getRandomItem(List<WebElement> elements) {
        int index = random.nextInt(elements.size());
        elements.get(index).click();
    }

    public void moveCursor(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
    public static void scrollForElement(WebElement element, WebDriver drv) {
        ((JavascriptExecutor) drv).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}