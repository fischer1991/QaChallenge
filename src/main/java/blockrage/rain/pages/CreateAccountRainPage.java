package blockrage.rain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountRainPage  extends BasePage{

	public CreateAccountRainPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	
	
	@FindBy(xpath = "//*[@id=\"auth-root\"]/div/div[2]/div/form/div[1]/div[1]/div/input")
	public WebElement inputFirstName;

	@FindBy(xpath = "//*[@id=\"auth-root\"]/div/div[2]/div/form/div[1]/div[2]/div/input")
	public WebElement inputMiddleName;

	@FindBy(xpath = "//*[@id=\"auth-root\"]/div/div[2]/div/form/div[2]/div/input")
	public WebElement inputLastName;
	
	@FindBy(xpath = "//*[@id=\"auth-root\"]/div/div[2]/div/form/div[3]/label")
	public WebElement inputEmail;
	
	@FindBy(xpath = "//*[@id=\"auth-root\"]/div/div[3]/div/h1")
	public WebElement h1LabelText;
	
	
	
	
	@FindBy(xpath = "//*[@id=\"Password\"]")
	public WebElement inputPassword;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div/form/button/span[1]")
	public WebElement buttonCreateAccount;
	
	
	public void WriteinputFirstName(String firstNameText) throws InterruptedException {
		writeText(inputFirstName, firstNameText);
	}
	
	public void WriteinputMiddleName(String MiddleNameText) throws InterruptedException {
		writeText(inputMiddleName, MiddleNameText);
	}
	
	
	public void WriteinputEmail(String inputEmailText) throws InterruptedException {
		writeText(inputEmail, inputEmailText);
	}
	
	
	public void WriteinputPassword(String passwordText) throws InterruptedException {
		writeText(inputPassword, passwordText);
	}
		
	
	public void clickOnCreateAccount() throws InterruptedException {
		click(buttonCreateAccount);
		
	}
	
	//Method to return true or false to do the asseriont in the test layer
	public boolean valideRedirectAction() throws InterruptedException {
		
		return elementIsDisplayed(h1LabelText);
	}

}
