package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CartTests extends BaseTest {
    @Test
    public void userShouldBeAbleToAddItemToCart() {
        InventoryPage inventoryPage = new LoginPage(driver)
                .loginAs("standard_user", "secret_sauce");

        CartPage cartPage = inventoryPage
                .addBackpackToCart()
                .openCart();

        Assert.assertTrue(cartPage.hasItemsInCart(), "Cart should contain the selected item.");
    }
}
