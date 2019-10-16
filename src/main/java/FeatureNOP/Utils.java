package FeatureNOP;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static FeatureNOP.BasePage.driver;

public class Utils extends BasePage{
    public String generateEmail(String startValue) {
        String email = startValue.concat(new Date().toString());
        return email;
    }

    public static String rendomDate() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHMMss");
        return format.format(new Date());
    }

    //1.Method to LunchBrowser
    public static void LunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\BrowserDriver\\chromedriver.exe");
        //Open The Browser
        driver = new ChromeDriver();
        //Maximise the browser Window
        driver.manage().window().fullscreen();
        //set implicitly for driver object.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Open the website
        driver.get("https://demo.nopcommerce.com");
    }

    //2.Close Browser Method
    public static void CloseBrowser() {
        //Drive will close browser.
        driver.quit();
    }

    //3.Select by Value Drag and drop Method
    public void SelectByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //4. Select by Index Number Drag and drop Method
    public void SelectByIndex(By by, int value) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
    }

    //5.Select by Visibility Text Method
    public void SelectByVisibilityText(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }

    //6.Clickable Explicitly Wait Method
    protected static void waitForClickable(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //7.Explicitly wait until ElementVisible
    public static void waitForElementVisible(By by, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //8.Check for Explicitly AlertPresent
    public static void waitForAlertPresent(long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //9. Checking for Explicitly Wait for Invisible Element
    public void waitForInvisiblePresent(By locator, long time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    //10.Checking for Explicitly Wait for Invisible Text
    public void InvisibilityByText(By by, long value, String text) {
        WebDriverWait wait = new WebDriverWait(driver, value);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(by, text));
    }

    //11.Checking for Explicitly Wait for scrollToElement
    public void ScrollToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) by).perform();
    }

    //12.Explicitly Wait for scrollToElement and Click
    public void ScrollToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement((WebElement) by).click();
    }

    //13.Enter Text Method
    public void EnterText(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    //14.Get Text method
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //15.Click on element method
    public void ClickElement(By by) {
        driver.findElement(by).click();
    }

    //16.Clear Text form inout box/area
    public void ClearText(By by) {
        driver.findElement(by).clear();
    }

    //17.Clear and enter text in input field
    public void ClearAndText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    //18.Checking WebElement present in DOM
    public void WebElementPresentInDOM(By by) {
        if (driver.findElement(by) != null) {
            System.out.println("Element is Present");

        } else {
            System.out.println("Element is Absent");
        }
    }

    //19.Checking WebElement is displayed or not
    public void WebElementDisplayed(By by) {
        if (driver.findElement(by).isDisplayed()) {
            System.out.println("Element is Present");

        } else {
            System.out.println("Element is Absent");
        }
    }

    //20.Wait for fixed time given in seconds
    public void WaitForFixedTime(long time) throws InterruptedException {
        driver.wait(time);
    }

    //21.Method for get Attribute
    public String getAttribute(By by, String text) {
        return driver.findElement(by).getAttribute(text);
    }

    //22.Method for Navigate
    public void Navigate(String text) {
        driver.navigate().to(text);
    }

    //23.Explicity wait
    public void ExplicityWait(long value, TimeUnit time) {
        driver.manage().timeouts().implicitlyWait(value, time);
    }

    //24.Implicity wait until pageload.
    public void ImplicityWaitUntilPageLoad(long value, TimeUnit time) {
        driver.manage().timeouts().pageLoadTimeout(value, time);
    }


    //25.Dynamic Email Address
    public String DynamicAddress() {
        String text = LoadProps.getProperty("EmailPart1") + rendomDate() + LoadProps.getProperty("EmailPart2");
        return text;
    }

    //26.Assert method to verify URL
    public void validateURL(String expectedURL) {
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    //27.Assert method to verify Message
    public void assertMessage(By by, String expectedMessage) {
        String actualMessage = getTextFromElement(by);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    //28.ScreenShot Method
    public void takeScreenShot(String filename) {

        //Convert Web Driver object to Take ScreenShot
        TakesScreenshot scrShot = ((TakesScreenshot)driver);

        //Call getScreenshot as method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move Image File to new destination
        File DestFile = new File("src\\test\\Resources\\Testdata\\ScreenShot" +filename +rendomDate() + ".png");

        //Copy file at destination

        try {
            FileUtils.copyFile(SrcFile, DestFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


