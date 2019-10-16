package FeatureNOP;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@register,@RegisterReferAFriend,@UnregisterReferAFriend,@CheckoutAsRegister,@CheckoutAsUnregister")

public class RunTest {
}
