package US_506;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
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

    @Test(priority = 1)
    public void login() {

        nop.myClick(nop.logIn);
        nop.mySendKeys(nop.emailPlc, email);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);
    }

    @Test(priority = 2, dataProvider = "inputs", groups = {"UI Test"})
    public void leaveTheMandatoryFieldsEmpty(String recipientName, String senderName, String message) {

        wait.until(ExpectedConditions.elementToBeClickable(nop.giftCardsButton));
        nop.myClick(nop.giftCardsButton);

        wait.until(ExpectedConditions.visibilityOfAllElements(nop.addToCartButtons));
        if (nop.addToCartButtons.size() >= 3) {

            /** Add a random "Physical Gift Card" to the cart */
            List<WebElement> lastTwoElement = nop.addToCartButtons.subList(1, nop.addToCartButtons.size());
            int range = Tools.randomGenerator(2);
            WebElement randomSelect = lastTwoElement.get(range);
            wait.until(ExpectedConditions.visibilityOf(randomSelect));
            nop.scrollToElement(randomSelect);
            wait.until(ExpectedConditions.elementToBeClickable(randomSelect));
            nop.myClick(randomSelect);

        }
        nop.mySendKeys(nop.recipientNamePlc, recipientName);
        nop.mySendKeys(nop.senderNamePlc, senderName);
        nop.mySendKeys(nop.messageBox, message);

        wait.until(ExpectedConditions.visibilityOf(nop.addToCartButton));
        nop.scrollToElement(nop.addToCartButton);
        Tools.JSClick(nop.addToCartButton);

        wait.until(ExpectedConditions.elementToBeClickable(nop.warningCloseBtn));
        nop.myClick(nop.warningCloseBtn);

        wait.until(ExpectedConditions.visibilityOf(nop.warningMsg));
        Assert.assertTrue(nop.warningMsg.isDisplayed(), "No warning message is present!");
        logger.info("warning message: " + nop.warningMsg.getText());

    }
    @DataProvider
    public Object[][] inputs() {
        Object[][] inputList = {

                {" ", " ", "Enjoy your day!"},
                {"User123", " ", "Wishing you all the best with this gift!"}
        };
        return inputList;
    }
}

