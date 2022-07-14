package blockrage.rain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogainRainPage extends  BasePage {

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

    @FindBy(how = How.XPATH, using = "/html/body/header/div/ol[1]/li[3]/a")
    public WebElement buyMenu;

    @FindBy(how = How.XPATH, using = "//*[@id='auth-root']/div/div[2]/div/form/ul/li")
    public WebElement labelInvalidLoginError;

    //Methods
    public void writeEmail(String inputEmailText) throws InterruptedException {
        writeText(inputEmail, inputEmailText);
    }

    public void writePassword(String passwordText) throws InterruptedException {
        writeText(inputPassword, passwordText);
    }

    public void clickLoginButton() throws InterruptedException{
        click(buttonLogin);
    }


    //Method to return true or false to do the asseriont in the test layer
    public boolean validateLogin() throws InterruptedException {

        return elementIsDisplayed(buyMenu);
    }

    //Method to return true or false to do the asseriont in the test layer
    public boolean invalidLoginValidate() throws InterruptedException {

        return elementIsDisplayed(labelInvalidLoginError);
    }

    public void navigateToUrl (String url){

    }

}
