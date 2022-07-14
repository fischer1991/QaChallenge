package blockrage.rain.steps;

import blockrage.rain.core.DriverFactory;
import blockrage.rain.core.TipoDriver;
import blockrage.rain.pages.LogainRainPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class LoginSteps extends DriverFactory {

    LogainRainPage loginPage;

    @Before(value = "@loginAtRainPlatform", order = 1)
    public void before(Scenario cenario) throws Exception {

    }

    @Given("^the user is on Tamanna website$")
    public void theUserIsOnTamannaWebsite() throws MalformedURLException {
      DriverFactory.getDriver(TipoDriver.valueOf("CHROME")).navigate().to("https://www.tamanna.com/");
    }

    @Given("^set the email into \"([^\"]*)\" input Field$")
    public void set_the_email_into_input_Field(String email) throws Throwable {
        DriverFactory.page.GetInstance(LogainRainPage.class).writeEmail(email);
    }

    @Given("^set the password into the \"([^\"]*)\" input field$")
    public void set_the_password_into_the_input_field(String password) throws Throwable {
        DriverFactory.page.GetInstance(LogainRainPage.class).writePassword(password);
    }


    @When("^click in Login Button$")
    public void click_in_Login_Button() throws Throwable {
        DriverFactory.page.GetInstance(LogainRainPage.class).clickLoginButton();
    }

    @Then("^a session should be create placing the user in the home page$")
    public void a_session_should_be_create_placing_the_user_in_the_home_page() throws Throwable {
        //Assert.assertFalse(true, loginPage.validateLogin());

        Assert.assertTrue( DriverFactory.page.GetInstance(LogainRainPage.class).validateLogin() == true);

    }

    @Given("^set a non registered email into \"([^\"]*)\" input Field$")
    public void set_a_non_registered_email_into_input_Field(String email) throws Throwable {
        DriverFactory.page.GetInstance(LogainRainPage.class).writeEmail(email);
    }

    @Then("^the login should not be allowed$")
    public void the_login_should_not_be_allowed() throws Throwable {
        Assert.assertTrue( DriverFactory.page.GetInstance(LogainRainPage.class).invalidLoginValidate() == true);
    }


    @After(value = "@loginAtRainPlatform", order = 1)
    public void after(Scenario cenario) throws Exception {

    }


}
