package blockrage.rain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PageGenerator {

    public WebDriver driver;

    public PageGenerator(WebDriver driver) {
        this.driver = driver;
    }

    public <TPage extends GlobalUtilities> TPage GetInstance(Class<TPage> Pageclass) {
        try {
            return PageFactory.initElements(driver, Pageclass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}