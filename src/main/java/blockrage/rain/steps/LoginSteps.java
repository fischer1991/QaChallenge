package blockrage.rain.steps;

import blockrage.rain.core.DriverFactory;
import blockrage.rain.core.TipoDriver;
import blockrage.rain.pages.LogainRainPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class LoginSteps extends DriverFactory {

    LogainRainPage loginPage;

    @Before(value = "@loginAtRainPlatform", order = 1)
    public void before(Scenario cenario) throws Exception {

    }

    @Given("^the user is on Tamanna website$")
    public void theUserIsOnTamannaWebsite() throws MalformedURLException, InterruptedException {
        DriverFactory.getDriver(TipoDriver.valueOf("CHROME")).navigate().to("https://www.tamanna.com/");

    }

    @Given("^set the email into \"([^\"]*)\" input Field$")
    public void set_the_email_into_input_Field(String email) throws Throwable {
        challengePage().writeEmail(email);
    }

    @Given("^set the password into the \"([^\"]*)\" input field$")
    public void set_the_password_into_the_input_field(String password) throws Throwable {
        challengePage().writePassword(password);
    }


    @When("^click in Login Button$")
    public void click_in_Login_Button() throws Throwable {
        challengePage().clickLoginButton();
    }

    @When("^the user clicks on kids menu$")
    public void clickOnKidsMenu() throws Throwable {
        challengePage().clickKidsMenuButton();
    }

    @When("^the user clicks on beauty menu$")
    public void clickOnBeautyMenu() throws Throwable {
        challengePage().clickBeautyMenuButton();
    }

    @When("^the user clicks on hair menu$")
    public void clickOnHairMenu() throws Throwable {
        challengePage().clickHairBeautyMenuButton();
    }

    @When("^the user chooses Nike Air Max shoes$")
    public void choosesNikeAirMaxShoes() throws Throwable {
        challengePage().clickNikeAirMaxShoes();
        challengePage().clickNikeAirMaxSize();
    }

    @When("^the user chooses Babyliss Pro Rotating Hot Air Styler$")
    public void choosesBabyliss() throws Throwable {
        challengePage().clickBabylissHairProduct();
    }

    @When("^the user clicks on shoes kids menu$")
    public void clickOnSaleKidsMenu() throws Throwable {
        challengePage().clickShoesKidsMenuButton();
    }

    @When("^the user clicks Add to Cart button$")
    public void clickAddToCart() throws Throwable {
        challengePage().clickAddToCartButton();
    }

    @And("^the confirmation message is displayed: Added to your shopping bag!$")
    public void addedToCartConfirmationMessage() throws Throwable {
        challengePage().verifyAddedToCartMessageIsDisplayed();
    }

    private LogainRainPage challengePage() throws Exception {
        return DriverFactory.page.GetInstance(LogainRainPage.class);
    }

    @Then("^a session should be create placing the user in the home page$")
    public void a_session_should_be_create_placing_the_user_in_the_home_page() throws Throwable {
        //Assert.assertFalse(true, loginPage.validateLogin());

        //Assert.assertTrue( challengePage().validateLogin() == true);

    }

    @Given("^set a non registered email into \"([^\"]*)\" input Field$")
    public void set_a_non_registered_email_into_input_Field(String email) throws Throwable {
        challengePage().writeEmail(email);
    }

    @Then("^the login should not be allowed$")
    public void the_login_should_not_be_allowed() throws Throwable {
        Assert.assertTrue(challengePage().invalidLoginValidate() == true);
    }


    @After(value = "@loginAtRainPlatform", order = 1)
    public void after(Scenario cenario) throws Exception {

    }


}
