package FeatureNOP;

import org.openqa.selenium.By;

public class CheckOutPage extends Utils {
    LoadProps loadProps=new LoadProps();

    private By _Country = By.xpath("//select[@data-stateprovince=\"#BillingNewAddress_StateProvinceId\"]");
    private By _City = By.xpath("//input[@id=\"BillingNewAddress_City\"]");
    private By _Address=By.xpath("//input[@id=\"BillingNewAddress_Address1\"]");
    private By _Postcode=By.xpath("//input[@name=\"BillingNewAddress.ZipPostalCode\"]");
    private By _PhoneNumber=By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]");
    private By _Continue = By.xpath("//input[@onclick=\"Billing.save()\"]");
    private By _Continue2=By.xpath("//input[@onclick=\"ShippingMethod.save()\"]");
    private By _CreditNote=By.xpath("//div[2]/label[@for=\"paymentmethod_1\"]");
    private By _Continue3=By.xpath("//input[@onclick=\"PaymentMethod.save()\"]");
    private By _CreditCardType=By.xpath("//select[@class=\"dropdownlists\"]");
    private By _CardHolderName=By.xpath("//input[@data-val-required=\"Enter cardholder name\"]");
    private By _CardNumber=By.xpath("//input[@name=\"CardNumber\"]");
    private By _ExpiryMonth=By.xpath("//select[@name=\"ExpireMonth\"]");
    private By _ExpiryYear=By.xpath("//select[@id=\"ExpireYear\"]");
    private By _CardCode=By.xpath("//input[@name=\"CardCode\"]");
    private By _Continue4=By.xpath("//input[@onclick=\"PaymentInfo.save()\"]");
    private By _Confirmation=By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]");



    public void VerifyCheckOutURL()
    {
        validateURL(LoadProps.getProperty("CheckOutPage"));
    }

    public void CheckOutDetails()
    {
        SelectByValue(_Country,"233");
        EnterText(_City,LoadProps.getProperty("City"));
        EnterText(_Address,LoadProps.getProperty("Address"));
        EnterText(_Postcode,LoadProps.getProperty("Postcode"));
        EnterText(_PhoneNumber,LoadProps.getProperty("PhoneNumber"));
        ClickElement(_Continue);
        waitForElementVisible(_Continue2,5);
        ClickElement(_Continue2);
        waitForElementVisible(_CreditNote,5);
        ClickElement(_CreditNote);
        ClickElement(_Continue3);
        SelectByValue(_CreditCardType,"MasterCard");
        EnterText(_CardHolderName,LoadProps.getProperty("CardHolderName"));
        EnterText(_CardNumber,LoadProps.getProperty("CardNumber"));
        SelectByValue(_ExpiryMonth,LoadProps.getProperty("ExpiryMonth"));
        SelectByValue(_ExpiryYear,LoadProps.getProperty("ExpiryYear"));
        EnterText(_CardCode,LoadProps.getProperty("CardCode"));
        ClickElement(_Continue4);
        waitForElementVisible(_Confirmation,5);
        ClickElement(_Confirmation);
    }
}

