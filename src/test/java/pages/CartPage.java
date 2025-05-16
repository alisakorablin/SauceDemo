package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends pages.BasePage{

    public static final String CART_URL = "https://www.saucedemo.com/cart.html";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private static final By CART_TITLE = By.cssSelector("[data-test = title]");
    private static final By CONTINUE_BUTTON = By.xpath("//button[@id='continue-shopping']");
    private static final String OPEN_ITEM_IN_CART_PATTERN = "//div[@class='inventory_item_name'][text()='%s']";
    private static final By CHECKOUT_BUTTON = By.xpath("//button[@id='checkout']");
    private static final By BACK_TO_PRODUCTS_BUTTON = By.xpath("//button[@id='back-to-products']");

    public void openCartPage() {
        driver.get(CART_URL);
    }

    public String getTitle() {
        return driver.findElement(CART_TITLE).getText();
    }

    public void  openHomePageByContinueShoppingButton(){
        driver.findElement(CONTINUE_BUTTON).click();
    }

    public void checkout(){
        driver.findElement(CHECKOUT_BUTTON).click();
    }

    public void itemsInCart(String item) {
        driver.findElement(By.xpath(String.format(OPEN_ITEM_IN_CART_PATTERN, item))).click();
    }

    public void backToProductsButton(){
        driver.findElement(BACK_TO_PRODUCTS_BUTTON).click();
    }
}
