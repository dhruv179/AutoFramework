package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    @Test
    public void validLoginShouldOpenInventoryPage() {
        InventoryPage inventoryPage = new LoginPage(driver)
                .loginAs("standard_user", "secret_sauce");

        Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(), "Inventory page should be visible after login.");
    }

    @Test
    public void invalidLoginShouldShowErrorMessage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("locked_out_user", "wrong_password");

        Assert.assertTrue(loginPage.getErrorMessage().contains("Username and password do not match"),
                "Expected login error message was not shown.");
    }
}
