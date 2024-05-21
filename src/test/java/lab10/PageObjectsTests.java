package lab10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectsTests {

    private WebDriver driver;

    @BeforeEach
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/petrfifka/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void automationTestStoreRegistrationTest() {
        HomePage homePage = new HomePage(this.driver);
        LoginPage loginPage = new LoginPage(this.driver);
        homePage.openStore();
        homePage.clickLoginOrRegister();
        loginPage.clickContinue();
    }
}
