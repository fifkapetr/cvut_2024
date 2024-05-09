package selenium_prep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TempPageObject {

    public TempPageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private WebDriver driver;

    private String url = "https://tredgate.com/pmtool";
    @FindBy(css = "#username")
    public WebElement usernameInput;

    public void openPmtool() {
        this.driver.get(url);
    }

    public void typeUsername(String username) {
        usernameInput.sendKeys(username);
    }
}
