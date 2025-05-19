package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.CartPage.*;
import static pages.LoginPage.login;
import static pages.ProductsPage.addProduct;
import static pages.ProductsPage.openCart;


public class CartTest extends BaseTest{

    @Test
    public void checkAddingItemInShoppingCart(){
        loginPage.open();
        login("standard_user", "secret_sauce");
        addProduct("Sauce Labs Backpack");
        openCart();
        Assert.assertEquals(getTitle(), "Your Cart",
                "Должна отображаться страница корзины");
    }

    @Test
    public void checkReturnToHomePageByContinueShoppingButton(){
        loginPage.open();
        login("standard_user", "secret_sauce");
        openCartPage();
        cartPage.openHomePageByContinueShoppingButton();
        Assert.assertEquals(getTitle(), "Products",
                "Должна отображаться хоум пейдж с айтемами");
    }

    @Test
    public void checkCheckout(){
        loginPage.open();
        login("standard_user", "secret_sauce");
        addProduct("Sauce Labs Backpack");
        openCart();
        checkout();
        Assert.assertEquals(getTitle(), "Checkout: Your Information",
                "Должна отображаться чекаут пейдж");
    }

    @Test
    public void checkReturnToHomePageByClickingToItem(){
        loginPage.open();
        login("standard_user", "secret_sauce");
        addProduct("Sauce Labs Bike Light");
        openCart();
        itemsInCart("Sauce Labs Bike Light");
        backToProductsButton();
        Assert.assertEquals(getTitle(), "Products",
                "Должна отображаться хоум пейдж с айтемами");
    }
}
