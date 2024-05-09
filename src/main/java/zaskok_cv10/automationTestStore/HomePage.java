package zaskok_cv10.automationTestStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private String url = "https://automationteststore.com";

    @FindBy(css = "#customer_menu_top a")
    private WebElement loginAnchor;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage openStore() {
        this.driver.get(url);
        return this;
    }

    public LoginPage clickLogin() {
        loginAnchor.click();
        return new LoginPage(driver);
    }
}
