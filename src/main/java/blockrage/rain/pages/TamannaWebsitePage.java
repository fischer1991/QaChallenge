package blockrage.rain.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TamannaWebsitePage extends GlobalUtilities {

    public TamannaWebsitePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "(//a[@href='/kids/overview'])[1]")
    public WebElement kidsMenuButton;
    @FindBy(how = How.XPATH, using = "(//a[@href='/beauty/overview'])[1]")
    public WebElement beautyMenuButton;
    @FindBy(how = How.XPATH, using = "(//a[@href='/beauty/overview'])[2]")
    public WebElement homePageIcon;
    @FindBy(how = How.XPATH, using = "(//a[@href='/kids-shoes'])[1]")
    public WebElement shoesKidsMenuButton;
    @FindBy(how = How.XPATH, using = "//a[@href='/women-beauty-hair']")
    public WebElement hairBeautyMenuButton;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='ShoppingBag']")
    public WebElement shoppingBagIcon;
    @FindBy(how = How.XPATH, using = "//button[text()='GO TO SHOPPING BAG']")
    public WebElement shoppingBagButton;
    @FindBy(how = How.XPATH, using = "//img[@alt='Nike Air Max Plus - Grade School Shoes']")
    public WebElement nikeAirMaxShoe;
    @FindBy(how = How.XPATH, using = "(//img[@alt='Banner Desktop En'])[2]")
    public WebElement bannerHomePage;
    @FindBy(how = How.XPATH, using = "//img[@alt='Babyliss Pro Rotating Hot Air Styler']")
    public WebElement babylissHairProduct;
    @FindBy(how = How.XPATH, using = "//button[text()='Add to cart']")
    public WebElement addToCartButton;
    @FindBy(how = How.XPATH, using = "//button[@aria-label='Delete']")
    public WebElement deleteButton;
    @FindBy(how = How.XPATH, using = "//*[text()='38.5']")
    public WebElement nikeAirMaxSize;
    @FindBy(how = How.XPATH, using = "//*[text()='Added to your shopping bag!']")
    public WebElement addedToCartConfirmationMessage;
    @FindBy(how = How.XPATH, using = "//*[text()='2 items']")
    public WebElement quantityOfTwoItems;
    @FindBy(how = How.XPATH, using = "(//*[text()='Shopping Bag'])[2]")
    public WebElement shoppingBagLabel;
    @FindBy(how = How.XPATH, using = "//*[text()='1 item']")
    public WebElement quantityOfOneItem;
    @FindBy(how = How.XPATH, using = "//*[text()='0 items']")
    public WebElement quantityOfZeroItems;
    @FindBy(how = How.XPATH, using = "(//*[text()='KWD 91.900'])[2]")
    public WebElement totalAmountOfTwoItems;
    @FindBy(how = How.XPATH, using = "(//*[text()='KWD 0.000'])[2]")
    public WebElement totalAmountOfZeroItems;

    public void clickKidsMenuButton() {
        verifyElementExists(kidsMenuButton);
        click(kidsMenuButton);
    }

    public void clickBeautyMenuButton() {
        click(beautyMenuButton);
    }

    public void clickShoesKidsMenuButton() {
        verifyElementExists(shoesKidsMenuButton);
        click(shoesKidsMenuButton);
    }

    public void clickHairBeautyMenuButton() {
        verifyElementExists(hairBeautyMenuButton);
        click(hairBeautyMenuButton);
    }

    public void clickAddToCartButton() {
        click(addToCartButton);
    }

    public void clickDeleteItemButton() {
        scrollToElement(shoppingBagLabel);
        click(deleteButton);
    }

    public void clickShoppingBackLink() {
        click(shoppingBagIcon);
        verifyElementExists(shoppingBagButton);
        click(shoppingBagButton);
    }

    public boolean verifyAddedToCartMessageIsDisplayed() {
        return elementIsDisplayed(addedToCartConfirmationMessage);
    }

    public boolean verifyQuantityOfItemsDisplayedIsTwo() {
        return elementIsDisplayed(quantityOfTwoItems);
    }

    public boolean verifyQuantityOfItemsDisplayedIsOne() {
        return elementIsDisplayed(quantityOfOneItem);
    }

    public boolean verifyQuantityOfItemsDisplayedIsZero() {
        return elementIsDisplayed(quantityOfZeroItems);
    }

    public boolean verifyTotalAmountOfTwoItemsIsDisplayed() {
        return elementIsDisplayed(totalAmountOfTwoItems);
    }

    public boolean verifyTotalAmountOfZeroItemsIsDisplayed() {
        return elementIsDisplayed(totalAmountOfZeroItems);
    }

    public boolean verifyUserIsOnHomePage() {
        return elementIsDisplayed(bannerHomePage);
    }

    public void clickNikeAirMaxShoes() {
        click(nikeAirMaxShoe);
    }

    public void clickBabylissHairProduct() {
        click(babylissHairProduct);
    }

    public void clickNikeAirMaxSize() {
        click(nikeAirMaxSize);
    }

    public void clickHomePageIcon() {
        click(homePageIcon);
    }
}