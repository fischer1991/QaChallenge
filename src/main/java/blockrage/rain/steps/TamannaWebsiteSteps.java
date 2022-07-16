package blockrage.rain.steps;

import blockrage.rain.core.DriverFactory;
import blockrage.rain.core.TipoDriver;
import blockrage.rain.pages.TamannaWebsitePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class TamannaWebsiteSteps extends DriverFactory {

    @Given("^the user is on Tamanna website$")
    public void theUserIsOnTamannaWebsite() {
        DriverFactory.getDriver(TipoDriver.valueOf("CHROME")).navigate().to("https://www.tamanna.com/");

    }
    @When("^the user clicks on kids menu$")
    public void clickOnKidsMenu() {
        challengePage().clickKidsMenuButton();
    }

    @When("^the user clicks on beauty menu$")
    public void clickOnBeautyMenu() {
        challengePage().clickBeautyMenuButton();
    }

    @When("^the user clicks on hair menu$")
    public void clickOnHairMenu() {
        challengePage().clickHairBeautyMenuButton();
    }

    @When("^the user chooses Nike Air Max shoes$")
    public void choosesNikeAirMaxShoes() {
        challengePage().clickNikeAirMaxShoes();
        challengePage().clickNikeAirMaxSize();
    }

    @When("^the user chooses Babyliss Pro Rotating Hot Air Styler$")
    public void choosesBabyliss() {
        challengePage().clickBabylissHairProduct();
    }

    @When("^the user clicks on shoes kids menu$")
    public void clickOnSaleKidsMenu() {
        challengePage().clickShoesKidsMenuButton();
    }

    @When("^the user clicks Add to Cart button$")
    public void clickAddToCart() {
        challengePage().clickAddToCartButton();
    }

    @And("^the confirmation message is displayed$")
    public void addedToCartConfirmationMessage() {
        challengePage().verifyAddedToCartMessageIsDisplayed();
        Assert.assertTrue( challengePage().verifyAddedToCartMessageIsDisplayed() == true);
    }

    private TamannaWebsitePage challengePage() {
        return DriverFactory.page.GetInstance(TamannaWebsitePage.class);
    }

    @And("^the user goes to the shopping bag$")
    public void theUserGoesToTheShoppingBag() {
        challengePage().clickShoppingBackLink();
    }

    @And("^the quantity of items displayed is: 2$")
    public void theQuantityOfItemsDisplayedIs() {
        challengePage().verifyQuantityOfItemsDisplayedIsTwo();
        Assert.assertTrue( challengePage().verifyQuantityOfItemsDisplayedIsTwo() == true);
    }

    @And("^the total amount displayed is: KWD 91.900$")
    public void theTotalAmountDisplayed()  {
        challengePage().verifyTotalAmountOfTwoItemsIsDisplayed();
        Assert.assertTrue( challengePage().verifyTotalAmountOfTwoItemsIsDisplayed() == true);
    }

    @And("^the user deletes the 2 items on the shopping bag$")
    public void theUserDeletesTheItemsOnTheCart() {
        challengePage().clickDeleteItemButton();
        challengePage().verifyQuantityOfItemsDisplayedIsOne();
        Assert.assertTrue( challengePage().verifyQuantityOfItemsDisplayedIsOne() == true);
        challengePage().clickDeleteItemButton();
        challengePage().verifyQuantityOfItemsDisplayedIsZero();
        Assert.assertTrue( challengePage().verifyQuantityOfItemsDisplayedIsZero() == true);
    }

    @And("^the user validate the total price is zero$")
    public void theUserValidateTheTotalPriceIsZero() {
        challengePage().verifyTotalAmountOfZeroItemsIsDisplayed();
        Assert.assertTrue( challengePage().verifyTotalAmountOfZeroItemsIsDisplayed() == true);
    }

    @And("^the user clicks on the home page icon$")
    public void theUserClicksOnTheHomepageIcon() {
        challengePage().clickHomePageIcon();
        challengePage().verifyUserIsOnHomePage();
        Assert.assertTrue( challengePage().verifyUserIsOnHomePage() == true);
    }
}