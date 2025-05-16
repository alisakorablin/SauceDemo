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

    public void continueCheckout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("first-name"))).sendKeys("test");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("last-name"))).sendKeys("test");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("postal-code"))).sendKeys("111");
        wait.until(ExpectedConditions.elementToBeClickable(CONTINUE_BUTTON)).click();
    }

    public void finishCheckout(){
        driver.findElement(FINISH_BUTTON).click();
    }

    public String getTitle() {
        return driver.findElement(CHECKOUT_TITLE).getText();
    }
}
