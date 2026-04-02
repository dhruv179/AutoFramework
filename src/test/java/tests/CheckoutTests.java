package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;

public class CheckoutTests extends BaseTest {
    @Test
    public void userShouldBeAbleToProceedToCheckoutOverview() {
        CartPage cartPage = new LoginPage(driver)
                .loginAs("standard_user", "secret_sauce")
                .addBackpackToCart()
                .openCart();

        CheckoutPage checkoutPage = cartPage.proceedToCheckout()
                .fillCheckoutInformation("Dhruv", "Tester", "10001")
                .continueCheckout();

        Assert.assertTrue(checkoutPage.isCheckoutOverviewDisplayed(),
                "Checkout overview page should be displayed.");
    }
}
