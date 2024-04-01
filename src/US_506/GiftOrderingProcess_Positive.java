package US_506;

import Utility.BaseDriver;
import Utility.Tools;
import org.apache.commons.lang3.RandomStringUtils;
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

public class GiftOrderingProcess_Positive extends BaseDriver {
    String email = "tanna_stylesiysz@vacations.hj";
    String password = "Not4You2Know";

    @Test(priority = 1, groups = {"Smoke Test"})
    public void login() {

        nop.myClick(nop.logIn);
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
    public void fillTheMandatoryFields() {

        // Add a random "Physical Gift Card" to the cart
        nop.myClick(nop.giftCardsButton);

        Tools.wait(3);
        if (nop.addToCartButtons.size() >= 3) {

            List<WebElement> lastTwoElement = nop.addToCartButtons.subList(1, nop.addToCartButtons.size());
            int range = Tools.randomGenerator(2);
            WebElement randomSelect = lastTwoElement.get(range);
            Tools.wait(3);
            wait.until(ExpectedConditions.elementToBeClickable(randomSelect));
            nop.myClick(randomSelect);

        }
        String recipientNameRndm = RandomStringUtils.randomAlphanumeric(5) + " "
                                 + RandomStringUtils.randomAlphanumeric(5);
        String senderNameRndm    = RandomStringUtils.randomAlphanumeric(5) + " "
                                 + RandomStringUtils.randomAlphanumeric(5);
        String messageRndm       = RandomStringUtils.randomAlphanumeric(8) + " "
                                 + RandomStringUtils.randomAlphanumeric(8);

        nop.mySendKeys(nop.recipientNamePlc,recipientNameRndm);
        nop.mySendKeys(nop.senderNamePlc,senderNameRndm);
        nop.mySendKeys(nop.messageBox,messageRndm);
        nop.myClick(nop.addToCartButton);

        String actualMsg=nop.successMsg.getText();
        String expectedMsg="The product has been added to your shopping cart";
        Assert.assertEquals(actualMsg,expectedMsg, "The addition of the product to the shopping cart was unsuccessful.");
        logger.info("Result: " + nop.successMsg.getText());
    }
}
