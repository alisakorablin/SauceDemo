import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorTest extends BaseTest{

    @Test
    public void checkLocator(){
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name"));
        driver.findElement(By.name("user-name"));
        driver.findElement(By.className("error-message-container"));
        driver.findElement(By.tagName("div"));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.partialLinkText("Sauce"));
        driver.findElement(By.linkText("Sauce Labs Backpack"));
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
        driver.findElement(By.xpath("//div[contains(@class,'inventory_item')]"));
        driver.findElement(By.xpath("//div[contains(text(), 'Labs Bike Light')]"));
        driver.findElement(By.xpath("//*[text()='Sauce Labs Fleece Jacket']//ancestor::div"));
        driver.findElement(By.xpath("//*[@id='item_0_title_link']//descendant::div"));
        driver.findElement(By.xpath("//*[@id='item_0_title_link']//following::a"));
        driver.findElement(By.xpath("//*[contains(text(),'Labs Bike Light')]//parent::div"));
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt' " +
                "and @name='add-to-cart-sauce-labs-bolt-t-shirt']"));
        driver.findElement(By.cssSelector(".inventory_item_price"));
        driver.findElement(By.cssSelector(".shopping_cart_container .shopping_cart_link"));
        driver.findElement(By.cssSelector("#item_4_title_link"));
        driver.findElement(By.cssSelector("div"));
        driver.findElement(By.cssSelector("div.inventory_item_label"));
        driver.findElement(By.cssSelector("[id=menu_button_container]"));
        driver.findElement(By.cssSelector("[class~=app_logo]"));
        driver.findElement(By.cssSelector("[data-test|='item-0']"));
        driver.findElement(By.cssSelector("[data-test^='item-0']"));
        driver.findElement(By.cssSelector("[data-test$='price']"));
        driver.findElement(By.cssSelector("[data-test*='item']"));
    }
}
