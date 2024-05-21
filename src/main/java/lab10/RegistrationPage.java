package lab10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = ".maintext i")
    private WebElement pageHeader;

    @FindBy(css = "AccountFrm_firstname")
    private WebElement firstNameInput;

    @FindBy(css = "AccountFrm_city")
    private WebElement cityInput;

    public RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    public void typeFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void typeCity(String city) {
        cityInput.sendKeys(city);
    }

}
