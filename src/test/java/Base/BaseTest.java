package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    public WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void sleep(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public void doubleClick(WebElement element) {
        new Actions(driver).doubleClick(element).build().perform();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

/*    @AfterMethod
    public void teardown() {
        driver.quit();
    }*/
}

