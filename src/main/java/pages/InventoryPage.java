package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {
    private final By inventoryContainer = By.id("inventory_container");
    private final By addBackpackButton = By.id("add-to-cart-sauce-labs-backpack");
    private final By cartLink = By.className("shopping_cart_link");

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public boolean isInventoryPageDisplayed() {
        return isDisplayed(inventoryContainer);
    }

    public InventoryPage addBackpackToCart() {
        click(addBackpackButton);
        return this;
    }

    public CartPage openCart() {
        click(cartLink);
        return new CartPage(driver);
    }
}
