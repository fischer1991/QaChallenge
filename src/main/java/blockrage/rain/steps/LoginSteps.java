package blockrage.rain.steps;

import blockrage.rain.core.DriverFactory;
import blockrage.rain.core.TipoDriver;
import blockrage.rain.pages.LogainRainPage;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class LoginSteps extends DriverFactory {

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
        challengePage().waitForKidsMenuBeDisplayed();
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

    @And("^the confirmation message is displayed$")
    public void addedToCartConfirmationMessage() throws Throwable {
        challengePage().verifyAddedToCartMessageIsDisplayed();
        Assert.assertTrue( challengePage().verifyAddedToCartMessageIsDisplayed() == true);
    }

    private LogainRainPage challengePage() throws Exception {
        return DriverFactory.page.GetInstance(LogainRainPage.class);
    }

    @Given("^set a non registered email into \"([^\"]*)\" input Field$")
    public void set_a_non_registered_email_into_input_Field(String email) throws Throwable {
        challengePage().writeEmail(email);
    }

    @And("^the user goes to the shopping bag$")
    public void theUserGoesToTheShoppingBag() throws Throwable {
        challengePage().clickShoppingBackLink();
    }

    @And("^the quantity of items displayed is: 2$")
    public void theQuantityOfItemsDisplayedIs() throws Throwable {
        challengePage().verifyQuantityOfItemsDisplayedIsTwo();
        Assert.assertTrue( challengePage().verifyQuantityOfItemsDisplayedIsTwo() == true);
    }

    @And("^the total amount displayed is: KWD 91.900$")
    public void theTotalAmountDisplayed() throws Throwable {
        challengePage().verifyTotalAmountOfTwoItemsIsDisplayed();
        Assert.assertTrue( challengePage().verifyTotalAmountOfTwoItemsIsDisplayed() == true);
    }

    @And("^the user deletes the 2 items on the shopping bag$")
    public void theUserDeletesTheItemsOnTheCart() throws Exception {
        challengePage().clickDeleteItemButton();
        challengePage().verifyQuantityOfItemsDisplayedIsOne();
        Assert.assertTrue( challengePage().verifyQuantityOfItemsDisplayedIsOne() == true);
        challengePage().clickDeleteItemButton();
        challengePage().verifyQuantityOfItemsDisplayedIsZero();
        Assert.assertTrue( challengePage().verifyQuantityOfItemsDisplayedIsZero() == true);
    }

    @And("^the user validate the total price is zero$")
    public void theUserValidateTheTotalPriceIsZero() throws Throwable {
        challengePage().verifyTotalAmountOfZeroItemsIsDisplayed();
        Assert.assertTrue( challengePage().verifyTotalAmountOfZeroItemsIsDisplayed() == true);
    }
}