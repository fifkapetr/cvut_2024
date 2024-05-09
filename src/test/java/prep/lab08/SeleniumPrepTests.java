package prep.lab08;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium_prep.TempPageObject;

import java.time.Duration;

public class SeleniumPrepTests {
    @Test
    @Disabled("Vzorový test Google")
    public void testGoogleSearch() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        System.setProperty("webdriver.chrome.driver", "/Users/petrfifka/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }

    @Test
    public void automationTestStoreRegisterTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/petrfifka/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        String username = "TestUser";
        driver.get("https://automationteststore.com/index.php?rt=account/create");
        driver.findElement(By.cssSelector("#AccountFrm_firstname")).sendKeys(username);
        Select countrySelect = new Select(driver.findElement(By.cssSelector("#AccountFrm_country_id")));
        countrySelect.selectByVisibleText("Czech Republic");

        Thread.sleep(10000);
        driver.quit();
    }

    @Test
    public void pageObjectsPrep() {
        System.setProperty("webdriver.chrome.driver", "/Users/petrfifka/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        TempPageObject pageObject = new TempPageObject(driver);
        pageObject.openPmtool();
        pageObject.typeUsername("Username");
    }
}
