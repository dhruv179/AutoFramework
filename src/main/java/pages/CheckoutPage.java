package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    private final By firstNameInput = By.id("first-name");
    private final By lastNameInput = By.id("last-name");
    private final By postalCodeInput = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By overviewContainer = By.id("checkout_summary_container");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage fillCheckoutInformation(String firstName, String lastName, String postalCode) {
        type(firstNameInput, firstName);
        type(lastNameInput, lastName);
        type(postalCodeInput, postalCode);
        return this;
    }

    public CheckoutPage continueCheckout() {
        click(continueButton);
        return this;
    }

    public boolean isCheckoutOverviewDisplayed() {
        return isDisplayed(overviewContainer);
    }
}
