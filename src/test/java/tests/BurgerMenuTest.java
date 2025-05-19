package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.LoginPage.login;
import static pages.ProductsPage.*;

public class BurgerMenuTest extends BaseTest{

    @Test
    public void checkAllItemsFromBurgerMenu(){
        loginPage.open();
        login("standard_user", "secret_sauce");
        openCart();
        openBurgerMenu();
        openAllItemsFromBurgerMenu();
        Assert.assertEquals(getTitle(), "Products",
                "Должна отображаться хоум пейдж с айтемами");
    }
}
