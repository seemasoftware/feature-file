package FeatureNOP;

import org.openqa.selenium.By;

public class GuestCheckOut extends Utils {
    LoadProps loadProps=new LoadProps();

    private By _CheckOut = By.xpath("//input[@value=\"Checkout as Guest\"]");
    private By _FirstName=By.xpath("//input[@name=\"BillingNewAddress.FirstName\"]");
    private By _LastName=By.xpath("//input[@name=\"BillingNewAddress.LastName\"]");
    private By _Email=By.xpath("//input[@name=\"BillingNewAddress.Email\"]");
    private By _Country=By.xpath("//select[@data-trigger=\"country-select\"]");
    private By _City=By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    private By _Address=By.xpath("//input[@name=\"BillingNewAddress.Address1\"]");
    private By _PostCode=By.xpath("//input[@name=\"BillingNewAddress.ZipPostalCode\"]");
    private By _PhoneNumber=By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    private By _Continue=By.xpath("//input[@onclick=\"Billing.save()\"]");
    private By _Continue2=By.xpath("//input[@onclick=\"ShippingMethod.save()\"]");
    private By _CreditCard=By.xpath("//div[2]/label[@for=\"paymentmethod_1\"]");
    private By _Continue3=By.xpath("//input[@onclick=\"PaymentMethod.save()\"]");
    private By _SelectCard=By.xpath("//select[@name=\"CreditCardType\"]");
    private By _CardHolderName=By.xpath("//input[@name=\"CardholderName\"]");
    private By _CardNumber=By.xpath("//input[@name=\"CardNumber\"]");
    private By _ExpiryMonth=By.xpath("//select[@id=\"ExpireMonth\"]");
    private By _ExpiryYear=By.xpath("//select[@name=\"ExpireYear\"]");
    private By _CVVNumber=By.xpath("//input[@name=\"CardCode\"]");
    private By _Continue4=By.xpath("//input[@onclick=\"PaymentInfo.save()\"]");
    private By _Confirmation=By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]");




    public void VerifyGuestURL()
    {
        validateURL(LoadProps.getProperty("CheckGuestURL"));
    }


    public void CheckOutASAGuest()
    {
        ClickElement(_CheckOut);
        EnterText(_FirstName,LoadProps.getProperty("FirstName"));
        EnterText(_LastName,LoadProps.getProperty("LastName"));
        EnterText(_Email,DynamicAddress());
        SelectByValue(_Country,"233");
        EnterText(_City,LoadProps.getProperty("City"));
        EnterText(_Address,LoadProps.getProperty("Address"));
        EnterText(_PostCode,LoadProps.getProperty("Postcode"));
        EnterText(_PhoneNumber,LoadProps.getProperty("PhoneNumber"));
        ClickElement(_Continue);
        waitForElementVisible(_Continue2,5);
        ClickElement(_Continue2);
        ClickElement(_CreditCard);
        ClickElement(_Continue3);
        SelectByValue(_SelectCard,"MasterCard");
        EnterText(_CardHolderName,LoadProps.getProperty("CardHolderName"));
        EnterText(_CardNumber,LoadProps.getProperty("CardNumber"));
        SelectByValue(_ExpiryMonth,LoadProps.getProperty("ExpiryMonth"));
        SelectByValue(_ExpiryYear,LoadProps.getProperty("ExpiryYear"));
        EnterText(_CVVNumber,LoadProps.getProperty("CardCode"));
        ClickElement(_Continue4);
        waitForElementVisible(_Confirmation,5);
        ClickElement(_Confirmation);

    }

}
