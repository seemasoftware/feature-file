package FeatureNOP;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void SetUpBrowser(){
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com");
    }

    @After
    public void CloseBrowser()
    {
        driver.close();
    }
}
