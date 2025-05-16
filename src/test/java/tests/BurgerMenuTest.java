package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BurgerMenuTest extends BaseTest{

    @Test
    public void checkAllItemsFromBurgerMenu(){
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        productsPage.openCart();
        productsPage.openBurgerMenu();
        productsPage.openAllItemsFromBurgerMenu();
        Assert.assertEquals(productsPage.getTitle(), "Products",
                "Должна отображаться хоум пейдж с айтемами");
    }
}
