package blockrage.rain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogainRainPage extends BasePage {

    public LogainRainPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.XPATH, using = "//*[@id='auth-root']/div/div[2]/div/form/div[1]/div/input")
    public WebElement inputEmail;
    //*[@id="auth-root"]/div/div[2]/div/form/div[2]/div/input

    @FindBy(how = How.XPATH, using = "//*[@id='auth-root']/div/div[2]/div/form/div[2]/div/input")
    public WebElement inputPassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement buttonLogin;

    @FindBy(how = How.XPATH, using = "(//a[@href='/kids/overview'])[1]")
    public WebElement kidsMenuButton;

    @FindBy(how = How.XPATH, using = "(//a[@href='/beauty/overview'])[1]")
    public WebElement beautyMenuButton;

    @FindBy(how = How.XPATH, using = "(//a[@href='/kids-shoes'])[1]")
    public WebElement shoesKidsMenuButton;

    @FindBy(how = How.XPATH, using = "//a[@href='/women-beauty-hair']")
    public WebElement hairBeautyMenuButton;

    @FindBy(how = How.XPATH, using = "//img[@alt='Nike Air Max Plus - Grade School Shoes']")
    public WebElement nikeAirMaxShoe;

    @FindBy(how = How.XPATH, using = "//img[@alt='Babyliss Pro Rotating Hot Air Styler']")
    public WebElement babylissHairProduct;

    @FindBy(how = How.XPATH, using = "//button[text()='Add to cart']")
    public WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//*[text()='38.5']")
    public WebElement nikeAirMaxSize;

    @FindBy(how = How.XPATH, using = "//p[text()='Added to your shopping bag!']")
    public WebElement addedToCartConfirmationMessage;

    @FindBy(how = How.XPATH, using = "//*[@id='auth-root']/div/div[2]/div/form/ul/li")
    public WebElement labelInvalidLoginError;

    //Methods
    public void writeEmail(String inputEmailText) throws InterruptedException {
        writeText(inputEmail, inputEmailText);
    }

    public void writePassword(String passwordText) throws InterruptedException {
        writeText(inputPassword, passwordText);
    }

    public void clickLoginButton() throws InterruptedException {
        click(buttonLogin);
    }

    public void clickKidsMenuButton() throws InterruptedException {
        click(kidsMenuButton);
    }

    public void clickBeautyMenuButton() throws InterruptedException {
        click(beautyMenuButton);
    }

    public void clickShoesKidsMenuButton() throws InterruptedException {
        click(shoesKidsMenuButton);
    }

    public void clickHairBeautyMenuButton() throws InterruptedException {
        click(hairBeautyMenuButton);
    }

    public void clickAddToCartButton() throws InterruptedException {
        click(addToCartButton);
    }

    public boolean verifyAddedToCartMessageIsDisplayed() throws InterruptedException {
        return elementIsDisplayed(addedToCartConfirmationMessage);
    }

    public void clickNikeAirMaxShoes() throws InterruptedException {
        click(nikeAirMaxShoe);
    }

    public void clickBabylissHairProduct() throws InterruptedException {
        click(babylissHairProduct);
    }

    public void clickNikeAirMaxSize() throws InterruptedException {
        click(nikeAirMaxSize);
    }
    public boolean invalidLoginValidate() throws InterruptedException {

        return elementIsDisplayed(labelInvalidLoginError);
    }
}