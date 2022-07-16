package blockrage.rain.core;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import blockrage.rain.pages.PageGenerator;


public class DriverFactory {
    private static DriverFactory instance = new DriverFactory();
    private static WebDriver driver;
    public static PageGenerator page;

    public static WebDriver getDriver(TipoDriver type) {
        switch (type) {
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "./src/main/drivers/geckodriver.exe");
                if (driver == null) {
                    FirefoxOptions option = new FirefoxOptions();
                    option.addArguments("--headless");
                    driver = new FirefoxDriver(option);
                    page = new PageGenerator(driver);
                }
                break;
            case CHROME:
                System.setProperty("webdriver.chrome.driver",
                        System.getProperty("user.dir") + "./src/main/drivers/chromedriver.exe");
                if (driver == null) {
                    ChromeOptions option = new ChromeOptions();
                    driver = new ChromeDriver(option);
                    page = new PageGenerator(driver);
                }
                break;
            default:
                break;
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public void openPage(String url) {
        driver.navigate().to(url);
    }

    public static WebDriver closeDriver() {
        if (driver != null) {
            driver.close();
        }
        return driver;
    }
}