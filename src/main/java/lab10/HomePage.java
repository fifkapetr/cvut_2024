package lab10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private WebDriver driver;

    private String url = "https://automationteststore.com";

    @FindBy(css = "#customer_menu_top a")
    private WebElement loginOrRegisterAnchor;

    public void openStore() {
        this.driver.get(url);
    }

    public void clickLoginOrRegister() {
        loginOrRegisterAnchor.click();
    }
}
