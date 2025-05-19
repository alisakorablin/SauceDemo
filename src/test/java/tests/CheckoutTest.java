package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.CartPage.checkout;
import static pages.CartPage.getTitle;
import static pages.CheckoutPage.finishCheckout;
import static pages.LoginPage.login;
import static pages.ProductsPage.addProduct;
import static pages.ProductsPage.openCart;


public class CheckoutTest extends BaseTest{

    @Test
    public void checkCheckout(){
        loginPage.open();
        login("standard_user", "secret_sauce");
        addProduct("Sauce Labs Backpack");
        openCart();
        checkout();
        checkoutPage.continueCheckout("test", "test", "111");
        finishCheckout();
        Assert.assertEquals(getTitle(), "Checkout: Complete!",
                "Должна отображаться успешная чекаут пейдж");
    }
}
