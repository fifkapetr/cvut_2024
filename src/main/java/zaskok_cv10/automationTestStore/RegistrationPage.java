package zaskok_cv10.automationTestStore;

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

    @FindBy(css = "[type=\"submit\"]")
    private WebElement continueButton;

    @FindBy(css ="#AccountFrm_firstname")
    private WebElement firstNameInput;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }

    public RegistrationPage typeFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        firstNameInput.sendKeys(firstName);
        return this;
    }
}
