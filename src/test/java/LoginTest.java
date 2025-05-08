import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest{

    @Test
    public void checkShoppingCartItem() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.get("https://www.saucedemo.com/cart.html");
        SoftAssert softAssert = new SoftAssert();
        boolean isDisplayedItem = driver.findElement(By.cssSelector(".inventory_item_name")).isDisplayed();
        softAssert.assertEquals(isDisplayedItem, true, "Позиция Sauce Labs Backpack " +
                "должна отображаться");
        boolean isDisplayedPrice = driver.findElement(By.cssSelector(".inventory_item_price")).isDisplayed();
        softAssert.assertEquals(isDisplayedPrice, true, "Цена на позицию Sauce Labs Backpack " +
                "должна составлять $29.9");
        softAssert.assertAll();
    }
}
