package FeatureNOP;

import org.openqa.selenium.By;

public class OrderConfirmation extends Utils {
    LoadProps loadProps=new LoadProps();

    private By _OrderSuccessfulMessage=By.xpath("//div/strong[text()='Your order has been successfully processed!']");


    public void VerifyOrderConfirmationSuccessfulMessage()
    {
        assertMessage(_OrderSuccessfulMessage,LoadProps.getProperty("OrderConfirmationMessage"));
    }
}
