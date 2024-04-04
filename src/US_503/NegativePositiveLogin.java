package US_503;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NegativePositiveLogin extends BaseDriver {
    @Test(dataProvider = "information")
    public void checkLogin(String email, String password) {

        nop.myClick(nop.logIn);
        nop.mySendKeys(nop.emailPlc, email);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);
        SoftAssert _softassert = new SoftAssert();


        if (email.equals("lelohat616@agromgt.com") && password.equals("Test123.")) {
            _softassert.assertTrue(nop.logout.isDisplayed(), "Login failed");
        } else {
            _softassert.assertTrue(nop.errorMessage.isDisplayed(), "Failed login warning couldn't displayed!");
        }
        _softassert.assertAll();
    }

    @DataProvider
    Object[][] information() {
        Object[][] emailPassword =
                {{"admin1@tyu.nı", "admin1."},
                        {"admin2@tyu.nı", "admin2."},
                        {"admin3@tyu.nı", "admin3."},
                        {"admin4@tyu.nı", "admin4."},
                        {"admin5@tyu.nı", "admin5."},
                        {"admin6@tyu.nı", "admin6."},
                        {"lelohat616@agromgt.com", "Test123."}
                };
        return emailPassword;
    }
}
