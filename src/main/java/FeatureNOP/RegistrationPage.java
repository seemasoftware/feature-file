package FeatureNOP;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    //Create object for loadprops
    LoadProps loadProps=new LoadProps();

    //Create variable to finding Locator
    private By _Firstname = By.name("FirstName");
    private By _lastname =By.name("LastName");
    private By _Email=By.xpath("//input[@id=\"Email\"]");
    private By _Password = By.xpath("//input[@id=\"Password\"]");
    private By _ConfirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _RegistrationButton = By.xpath("//input[@id=\"register-button\"]");
    private By _RegistrationSuccessfulMessage = By.xpath("//div[@class=\"result\"]");

    public void VarifyUserOnRegistrationPage() {
        validateURL(loadProps.getProperty("RegistrationPageURL"));
    }

    public void UserEnterRegistrationDetails(){
        EnterText(_Firstname,LoadProps.getProperty("FirstName"));
        EnterText(_lastname,LoadProps.getProperty("LastName"));
        waitForElementVisible(_Email,5);
        EnterText(_Email,LoadProps.getProperty("EmailPart1")+rendomDate()+LoadProps.getProperty("EmailPart2"));
        EnterText(_Password,loadProps.getProperty("Password"));
        EnterText(_ConfirmPassword,loadProps.getProperty("ConfirmPassword"));
        ClickElement(_RegistrationButton);

    }

}
