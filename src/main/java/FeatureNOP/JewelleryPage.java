package FeatureNOP;

import org.openqa.selenium.By;

public class JewelleryPage extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _Flower_Girl_Bracelet = By.linkText("Flower Girl Bracelet");

    public void VerifyUserIsOnJewelleyPage()
    {
        validateURL(LoadProps.getProperty("JewelleryPageURL"));
    }

    public void ClickOnBracelet()
    {
        ClickElement(_Flower_Girl_Bracelet);
    }

}
