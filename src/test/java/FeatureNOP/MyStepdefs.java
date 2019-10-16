package FeatureNOP;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelleryPage jewelleryPage = new JewelleryPage();
    FloweGirlBracelet floweGirlBracelet = new FloweGirlBracelet();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendSuccessfulMessage emailAFriendSuccessfulMessage=new EmailAFriendSuccessfulMessage();
    ShoppingPage shoppingPage=new ShoppingPage();
    CheckOutPage checkOutPage=new CheckOutPage();
    OrderConfirmation orderConfirmation=new OrderConfirmation();
    GuestCheckOut guestCheckOut= new GuestCheckOut();

    @Given("^user is on registration page$")
    public void userIsOnRegistrationPage() {
        homePage.ClickonRegistrationButton();
        registrationPage.VarifyUserOnRegistrationPage();
    }

    @When("^user enter all required details$")
    public void userEnterAllRequiredDetails() {
        registrationPage.UserEnterRegistrationDetails();
    }

    @Then("^user should be able to see successful message$")
    public void userShouldBeAbleToSeeSuccessfulMessage() {
        registrationResultPage.registrationResultPage();
        registrationResultPage.VerifyUserSuccessfulMessage();
    }

    @And("^click on continue button$")
    public void clickOnContinueButton() {
        registrationResultPage.ClickOnContinueMethod();
        homePage.VerifyUserIsOnHomePage();
    }

    @And("^user click on jewellery category$")
    public void userClickOnJewelleryCategory() {
        homePage.ClickOnJewelleryButton();
        jewelleryPage.VerifyUserIsOnJewelleyPage();
    }

    @And("^click on bracelet$")
    public void clickOnBracelet() {
        jewelleryPage.ClickOnBracelet();
        floweGirlBracelet.VerifyUserIsOnflowergirlbraceletPage();
    }

    @And("^click on email a friend button$")
    public void clickOnEmailAFriendButton() {
        floweGirlBracelet.ClickOnEmailAFriend();
        emailAFriend.verifyUserIsOnemailAFriendPage();
    }

    @And("^enter friend details$")
    public void enterFriendDetails() {
        emailAFriend.EnterFreindsDetails();
    }


    @Then("^user should be able to refer to a product to a friend successfully$")
    public void userShouldBeAbleToReferToAProductToAFriendSuccessfully() {
        emailAFriendSuccessfulMessage.VerifyProductHasBeenSend();
        emailAFriendSuccessfulMessage.VerifyProductHasBeenSendSuccessfulMessage();
    }

    @Given("^user is on home page$")
    public void userIsOnHomePage() {
        homePage.VerifyUserIsOnHomePage();
    }

    @And("^enter friend details as a unregister$")
    public void enterFriendDetailsAsAUnregister() {
        emailAFriend.verifyUserIsOnemailAFriendPage();
        emailAFriend.EnterUnregisterFriendDetails();
    }

    @Then("^user should not be able to refer a product to email friend$")
    public void userShouldNotBeAbleToReferAProductToEmailFriend() {
        emailAFriend.VerifyUnsuccessfulMessage();
    }

    @And("^click on shopping cart$")
    public void clickOnShoppingCart() {
        floweGirlBracelet.ClickOnShoppingBasket();
    }

    @And("^enter shopping details$")
    public void enterShoppingDetails() {
        shoppingPage.EnterShoppiingDetils();
    }

    @And("^enter checkout details$")
    public void enterCheckoutDetails() {
        checkOutPage.VerifyCheckOutURL();
        checkOutPage.CheckOutDetails();
    }

    @And("^enter checkout details as a unregister user$")
    public void enterCheckoutDetailsAsAUnregisterUser() {
        guestCheckOut.CheckOutASAGuest();
    }

    @Then("^register user should be able to checkout successfully$")
    public void registerUserShouldBeAbleToCheckoutSuccessfully() {
        orderConfirmation.VerifyOrderConfirmationSuccessfulMessage();
    }

    @Then("^unregister user should be able to checkout successfully$")
    public void unregisterUserShouldBeAbleToCheckoutSuccessfully() {
        orderConfirmation.VerifyOrderConfirmationSuccessfulMessage();
    }

}






