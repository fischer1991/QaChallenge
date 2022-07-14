package blockrage.rain.steps;

import blockrage.rain.pages.CreateAccountRainPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SignUpSteps {

	public SignUpSteps() {
		// TODO Auto-generated constructor stub
	}

	CreateAccountRainPage createAccount;

	
	@Before(value = "@createAccountRain", order = 1)
	public void before(Scenario cenario) throws Exception {

	}
	
	@Given("^the user is in the page Create Account$")
	public void the_user_is_in_the_page_Create_Account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^fill all the fields with valid  information$")
	public void fill_all_the_fields_with_valid_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		createAccount.WriteinputFirstName("Carlos");
		createAccount.WriteinputMiddleName("Almeida");
		createAccount.WriteinputEmail("");
		
	}

	@When("^click in button Create Account$")
	public void click_in_button_Create_Account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the user should be redirected to the page email-verification$")
	public void the_user_should_be_redirected_to_the_page_email_verification() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@After(value = "@createAccountRain", order = 1)
	public void after(Scenario cenario) throws Exception {

	}
}
