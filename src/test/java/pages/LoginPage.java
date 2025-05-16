package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends pages.BasePage {

    private static final By USER_NAME_FILED = By.id("user-name");
    private static final By PASSWORD_FILED = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");
    private static final By ERROR_MESSAGE = By.xpath("//h3[@data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get(BASE_URL);
    }

    public void login(String user, String password){
        driver.findElement(USER_NAME_FILED).sendKeys(user);
        driver.findElement(PASSWORD_FILED).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
    }

    public String getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
