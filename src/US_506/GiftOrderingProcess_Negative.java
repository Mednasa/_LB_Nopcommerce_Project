package US_506;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
    @Test(priority = 3, groups = {"UI Test"})
    public void physicalGiftCardSelection(){

        // Add a random "Physical Gift Card" to the cart
        nop.myClick(nop.giftCardsButton);
        if (nop.addToCartButtons.size()>=3){

            List<WebElement> lastTwoElement=nop.addToCartButtons.subList(1,nop.addToCartButtons.size());
            int range= Tools.randomGenerator(2);
            WebElement randomSelect=lastTwoElement.get(range);

            wait.until(ExpectedConditions.elementToBeClickable(randomSelect));
            nop.myClick(randomSelect);
        }
    }
}
