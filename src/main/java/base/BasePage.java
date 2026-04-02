package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class BasePage {
    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    protected void click(By locator) {
        waitUtils.waitForElementVisible(locator).click();
    }

    protected void type(By locator, String text) {
        WebElement element = waitUtils.waitForElementVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return waitUtils.waitForElementVisible(locator).getText();
    }

    protected boolean isDisplayed(By locator) {
        return waitUtils.waitForElementVisible(locator).isDisplayed();
    }
}
