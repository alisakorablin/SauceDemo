package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductsPage extends pages.BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private static final By TITLE = By.cssSelector("[data-test = title]");
    private static final By CART_BUTTON = By.cssSelector(".shopping_cart_link");
    private static final String ADD_TO_CART_PATTERN = "//*[text() = '%s']/ancestor" +
           "::div[@class = 'inventory_item']//button";
    private static final By BURGER_MENU_BUTTON = By.xpath("//button[@id='react-burger-menu-btn']");
    private static final By ALL_ITEMS_BUTTON = By.id("inventory_sidebar_link");

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

    public void addProduct(String product) {
        driver.findElement(By.xpath(String.format(ADD_TO_CART_PATTERN, product))).click();
    }

    public void openCart() {
        driver.findElement(CART_BUTTON).click();
    }

    public void openBurgerMenu() {
        driver.findElement(BURGER_MENU_BUTTON).click();
    }

    public void openAllItemsFromBurgerMenu() {
        driver.findElement(ALL_ITEMS_BUTTON).click();
    }
}
