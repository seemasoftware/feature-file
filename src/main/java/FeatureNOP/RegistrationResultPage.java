package FeatureNOP;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {
    LoadProps loadProps = new LoadProps();

    private By _RegistrationSuccessfulMessage = By.xpath("//div[@class=\"result\"]");
    private By _ContinueMessage = By.xpath("//input[@name=\"register-continue\"]");


    public void registrationResultPage()
    {
        waitForElementVisible(_RegistrationSuccessfulMessage,10);
        validateURL(LoadProps.getProperty("RegistrationSuccessfulMsgURL"));
    }

    public void VerifyUserSuccessfulMessage()
    {

        assertMessage(_RegistrationSuccessfulMessage,LoadProps.getProperty("RegisterSuccessfulMessage"));
    }

    public void ClickOnContinueMethod()
    {
        ClickElement(_ContinueMessage);
    }
}
