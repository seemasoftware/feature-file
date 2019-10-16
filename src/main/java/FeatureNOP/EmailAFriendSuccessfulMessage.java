package FeatureNOP;

import org.openqa.selenium.By;

public class EmailAFriendSuccessfulMessage extends Utils {
    LoadProps loadProps= new LoadProps();
    private By _EmailAFriendSuccessfulMessgae= By.xpath("//div[@class=\"result\"]");

    public void VerifyProductHasBeenSend()
    {
        validateURL(LoadProps.getProperty("EmailAFriendURL"));
    }

    public void VerifyProductHasBeenSendSuccessfulMessage()
    {
        assertMessage(_EmailAFriendSuccessfulMessgae,LoadProps.getProperty("SuccessfulMessage"));
    }
}
