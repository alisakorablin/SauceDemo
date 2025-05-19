package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends pages.BasePage{


    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private static final By CONTINUE_BUTTON = By.id("continue");
    private static final By FINISH_BUTTON = By.xpath("//button[@id='finish']");
    private static final By CHECKOUT_TITLE = By.cssSelector("[data-test = title]");
    private static final By FIRST_NAME_FIELD = By.id("first-name");
    private static final By LAST_NAME_FIELD = By.id("last-name");
    private static final By POSTAL_CODE_FIELD = By.id("postal-code");

    public void continueCheckout(String firstName, String lastName, String postalCode){
        driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
        driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
        driver.findElement(POSTAL_CODE_FIELD).sendKeys(postalCode);
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public static void finishCheckout(){
        driver.findElement(FINISH_BUTTON).click();
    }

    public static String getTitle() {
        return driver.findElement(CHECKOUT_TITLE).getText();
    }
}
