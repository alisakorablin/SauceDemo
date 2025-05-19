package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static pages.LoginPage.getErrorMessage;
import static pages.LoginPage.login;
import static pages.ProductsPage.getTitle;

public class LoginTest extends BaseTest {

    @Test
    public void checkSuccessLogin() {
        loginPage.open();
        login("standard_user", "secret_sauce");
        assertEquals(getTitle(),
                "Products",
                "Логин не выполнен");
    }

    @Test
    public void checkLoginWithEmptyPassword() {
        loginPage.open();
        login("standard_user", "");
        assertEquals(getErrorMessage(),
                "Epic sadface: Password is required",
                "SO BAAD");
    }

    @Test
    public void checkWithWrongPassword() {
        loginPage.open();
        login("standard_user", "1231412314123");
        assertEquals(getErrorMessage(),
                "Epic sadface: Username and password do not match any user in this service",
                "SO BAAD");
    }
}
