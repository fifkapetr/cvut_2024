package zaskok_cv10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import zaskok_cv10.automationTestStore.HomePage;
import zaskok_cv10.automationTestStore.LoginPage;
import zaskok_cv10.automationTestStore.RegistrationPage;

public class AutomationTestStoreTests {

    private WebDriver driver;

    @BeforeEach
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "/Users/petrfifka/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void registrationTest() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        homePage.openStore();
        homePage.clickLogin();
        loginPage.clickContinue();
        registrationPage.typeFirstName("TestName");
        registrationPage.clickContinue();
        //Naplnit objekt RegistrationPage a následně vytvořit kroky v testu:
        // 1. Vyplnění First Name, selektor: #AccountFrm_firstname
        // 2. Kliknutí: Continue, selektor: [type="submit"]
        // do 17:35
    }

    @Test
    public void fluentRegistration() {
        new HomePage(driver)
                .openStore()
                .clickLogin()
                .clickContinue()
                .typeFirstName("TestName")
                .clickContinue();
    }
}


