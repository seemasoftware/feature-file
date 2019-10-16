package FeatureNOP;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //To Create Variable for finding locator

    LoadProps loadProps=new LoadProps();

    private By _registerbutton = By.xpath("//a[@class=\"ico-register\"]");
    private By _login = By.xpath("");
    private By _wishlist = By.xpath("//span[@class='wishlist-label']");
    private By _shoppingcart = By.xpath("//span[@class='cart-label']");
    private By _computer = By.linkText("Computer");
    private By _search = By.xpath("//input[@type=\"text\"]");
    private By _jewelleryButton = By.linkText("Jewelry");
    private By _HTCProduct =By.linkText("HTC One M8 Android L 5.0 Lollipop");

    //Making Method
    public void ClickonRegistrationButton(){ClickElement(_registerbutton);}
    public void ClickOnLogButton(){ClickElement(_login);}
    public void ClickOnWishListButton(){ClickElement(_wishlist);}
    public void ClickOnShoppingCartButton(){ClickElement(_shoppingcart);}
    public void ClickOnComputerButton(){ClickElement(_computer);}
    public void VerifyUserIsOnHomePage(){validateURL(loadProps.getProperty("HomePageURL"));}
    public void ClickOnJewelleryButton(){ClickElement(_jewelleryButton);}
    public void ClickOnHTCProduct(){ClickElement(_HTCProduct);}
}

