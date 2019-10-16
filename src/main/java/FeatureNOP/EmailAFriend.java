package FeatureNOP;

import org.openqa.selenium.By;

public class EmailAFriend extends Utils{
    LoadProps loadProps=new LoadProps();
    private By _friendEmail_=By.xpath("//input[@class=\"friend-email\"]");
    private By _YourEmail =By.xpath("//input[@id=\"YourEmailAddress\"]");
    private By _PersonalMessage=By.xpath("//textarea[@class=\"your-email\"]");
    private By _SendAEmail = By.xpath("//input[@name=\"send-email\"]");
    private By _UnsuccessfulMessage = By.xpath("//div[@class=\"message-error validation-summary-errors\"]");

    public void verifyUserIsOnemailAFriendPage()
    {
        validateURL(LoadProps.getProperty("EmailAFriendURL"));
    }

    public void EnterFreindsDetails()
    {
        EnterText(_friendEmail_,LoadProps.getProperty("friend-email"));
        EnterText(_PersonalMessage,LoadProps.getProperty("PersonalMessage"));
        ClickElement(_SendAEmail);
    }

    public void EnterUnregisterFriendDetails()
    {
        EnterText(_friendEmail_,LoadProps.getProperty("friend-email"));
        EnterText(_YourEmail,LoadProps.getProperty("YourEmail"));
        EnterText(_PersonalMessage,LoadProps.getProperty("PersonalMessage"));
        ClickElement(_SendAEmail);
    }

    public void VerifyUnsuccessfulMessage()
    {
        assertMessage(_UnsuccessfulMessage,LoadProps.getProperty("UnsuccessfulMessage"));
    }
}
