package FeatureNOP;

import org.openqa.selenium.By;

public class ShoppingPage extends Utils {
    LoadProps loadProps= new LoadProps();

    private By _ShoppintCart = By.linkText("shopping cart");
    private By _agreeTerm=By.xpath("//input[@id=\"termsofservice\"]");
    private By _CheckOut=By.xpath("//button[@type=\"submit\"]");


    public void VerifyShoppingURL()
    {
        validateURL(LoadProps.getProperty("CheckOutPage"));
    }

    public void EnterShoppiingDetils()
    {
        ClickElement(_ShoppintCart);
        ClickElement(_agreeTerm);
        ClickElement(_CheckOut);
    }
}
