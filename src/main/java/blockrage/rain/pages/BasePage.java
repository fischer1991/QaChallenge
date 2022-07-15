package blockrage.rain.pages;

import java.util.List;
import java.util.Properties;
import java.util.function.Function;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static java.util.concurrent.TimeUnit.SECONDS;
import static junit.framework.TestCase.fail;
import static org.awaitility.Awaitility.await;


public class BasePage extends PageGenerator {
	static Logger logger = LoggerFactory.getLogger(BasePage.class);

	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	
	}
	Properties prop = new Properties();

	// If we need we can use custom wait in BasePage and all page classes

	WebDriverWait wait = new WebDriverWait(this.driver, 40);
	
	public <T> void click(T elementAttr) throws InterruptedException {
		waitForElement(elementAttr);
		((WebElement) elementAttr).click();
	}

	public <T> String getText(T elementAttr) throws InterruptedException {
		String text;
		waitForElement(elementAttr);
		text = ((WebElement) elementAttr).getText();
		return text;
	}

	public <T> void waitForElement(T elementAttr) throws InterruptedException {
		goToElement(elementAttr);
		wait.until(ExpectedConditions. visibilityOf((WebElement) elementAttr));
		((WebElement) elementAttr).isDisplayed();
	}
	public <T> Boolean elementIsDisplayed(T elementAttr) throws InterruptedException {
		scrollToElement(elementAttr);
		Boolean  isDisplayed=false;
		if(((WebElement) elementAttr).isDisplayed()) {
			 isDisplayed=true;
		}
		return isDisplayed;
	}
	public void verifyElementExists(WebElement el) {
		try {
			await().atMost(8, SECONDS).ignoreExceptions().until(() -> el.isDisplayed() || el.isEnabled());
		} catch (Exception e) {
			fail("WebElement " + el.toString() + " was not found on page");
		}
	}
	public <T> void scrollToElement(T elementAttr) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ((WebElement) elementAttr));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)", "");
	}
		public <T> void writeText(T elementAttr, String text) {
			wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));
			((WebElement) elementAttr).sendKeys(text);
		}

		public <T> void clearText(T elementAttr) {
			wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));
			((WebElement) elementAttr).clear();
			((WebElement) elementAttr).sendKeys("");
		}

		public <T> void selectElement(T elementAttr, int index) {
			List<WebElement> elements = (List<WebElement>) elementAttr;
			elements.get(index).click();
		}
		
		public <T> void goToElement(T elementAttr){
			Actions builder = new Actions(driver);
			builder.moveToElement((WebElement) elementAttr).perform();
		}
}
