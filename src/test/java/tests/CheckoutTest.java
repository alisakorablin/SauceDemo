package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void checkCheckout(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addProduct("Sauce Labs Backpack");
        productsPage.openCart();
        cartPage.checkout();
        checkoutPage.continueCheckout();
        checkoutPage.finishCheckout();
        Assert.assertEquals(checkoutPage.getTitle(), "Checkout: Complete!",
                "Должна отображаться успешная чекаут пейдж");
    }
}
