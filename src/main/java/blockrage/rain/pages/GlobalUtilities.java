package blockrage.rain.pages;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import static java.util.concurrent.TimeUnit.SECONDS;
import static junit.framework.TestCase.fail;
import static org.awaitility.Awaitility.await;


public class GlobalUtilities extends PageGenerator {
    static Logger logger = LoggerFactory.getLogger(GlobalUtilities.class);

    public GlobalUtilities(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(this.driver, 34);

    public <T> void click(T elementAttr) {
        try {
            waitForElement((WebElement) elementAttr);
            ((WebElement) elementAttr).click();
        } catch (TimeoutException | StaleElementReferenceException | ElementNotInteractableException ex) {
            logger.warn("Exception: " + ex + "Element '" + elementAttr
                    + "' could not be clicked, it will be attempted a second time");
            waitForElement(elementAttr);
            ((WebElement) elementAttr).click();
        }
    }
    public <T> boolean isElementEnabled(T elementAttr, int timeout) {
        boolean isElementEnabled;
        try {
            await().atMost(timeout, SECONDS).ignoreExceptions().until(() -> driver.findElement((By) elementAttr).isEnabled());
            isElementEnabled = true;
        } catch (NoSuchElementException | ConditionTimeoutException e) {
            isElementEnabled = false;
        }
        return isElementEnabled;
    }

    public <T> void waitForElement(T elementAttr) {
        wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));
        ((WebElement) elementAttr).isDisplayed();
    }

    public <T> Boolean elementIsDisplayed(T elementAttr) {
        Boolean isDisplayed = false;
        if (((WebElement) elementAttr).isDisplayed()) {
            isDisplayed = true;
        }
        return isDisplayed;
    }

    public <T> void verifyElementExists(T elementAttr) {
        isElementEnabled(elementAttr, 4);
        try {
            await().atMost(6, SECONDS).ignoreExceptions().until(() -> ((WebElement) elementAttr).isDisplayed()
                    || ((WebElement) elementAttr).isEnabled());
        } catch (Exception e) {
            fail("WebElement " + ((WebElement) elementAttr).toString() + " was not found on page");
        }
    }

    public <T> void scrollToElement(T elementAttr) {
        wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", elementAttr);
    }

    public <T> void writeText(T elementAttr, String text) {
        wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));
        ((WebElement) elementAttr).sendKeys(text);
    }
}