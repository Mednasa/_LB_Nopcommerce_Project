package US_506;

import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

// CREDENTIALS
// Name       : Bradie
// Lastname   : Joyce
// Email      : tanna_stylesiysz@vacations.hj
// Password   : Not4You2Know
// Website    : https://demo.nopcommerce.com/

public class GiftOrderingProcess_Negative extends BaseDriver {
    String email = "tanna_stylesiysz@vacations.hj";
    String password = "Not4You2Know";

    @Test(priority = 1, groups = {"Smoke Test"})
    public void login() {
        nop.mySendKeys(nop.emailPlc, email);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);
    }
    @Test(priority = 2, groups = {"UI Test"})
    public void verifyTheTabMenuVisibility() {

        // Verify that the TAB menu is visible.
        wait.until(ExpectedConditions.visibilityOfAllElements(nop.tabMenu));
        Assert.assertFalse(nop.tabMenu.isEmpty(), "Tab menu is not visible on the homepage!");

    }
}
