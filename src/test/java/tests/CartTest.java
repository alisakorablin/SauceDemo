package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CartTest extends BaseTest{

    @Test
    public void checkAddingItemInShoppingCart(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProduct("Sauce Labs Backpack");
        productsPage.openCart();
        Assert.assertEquals(cartPage.getTitle(), "Your Cart",
                "Должна отображаться страница корзины");
    }

    @Test
    public void checkReturnToHomePageByContinueShoppingButton(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        cartPage.openCartPage();
        cartPage.openHomePageByContinueShoppingButton();
        Assert.assertEquals(productsPage.getTitle(), "Products",
                "Должна отображаться хоум пейдж с айтемами");
    }

    @Test
    public void checkCheckout(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProduct("Sauce Labs Backpack");
        productsPage.openCart();
        cartPage.checkout();
        Assert.assertEquals(productsPage.getTitle(), "Checkout: Your Information",
                "Должна отображаться чекаут пейдж");
    }

    @Test
    public void checkReturnToHomePageByClickingToItem(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProduct("Sauce Labs Bike Light");
        productsPage.openCart();
        cartPage.itemsInCart("Sauce Labs Bike Light");
        cartPage.backToProductsButton();
        Assert.assertEquals(productsPage.getTitle(), "Products",
                "Должна отображаться хоум пейдж с айтемами");
    }
}
