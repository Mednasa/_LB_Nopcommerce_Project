package US_505;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControlOfProductsInTabMenu extends BaseDriver {
    String eMail = "femiy35445@nimadir.com";
    String password = "jx@sU58FhqKmMF ";

    @Test(priority = 1)
    public void login() {
        nop.myClick(nop.logIn);
        nop.mySendKeys(nop.emailPlc, eMail);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);

    }

    @Test(priority = 2)
    public void productsInTabMenu() {
        nop.myClick(nop.computersBtn);
        nop.myClick(nop.computersList.get(1));
        nop.mySendKeys(nop.searchBox, "Notebook");
        nop.myClick(nop.searchBtn);
        nop.notebookList.get(Tools.randomGenerator(6)).getText();
        Assert.assertTrue(Tools.ListContainsString(nop.notebookList,
                        nop.notebookList.get(Tools.randomGenerator(6)).getText()),
                "Product not found in the list");

//        for (WebElement e:nop.notebookList){
//            System.out.println(e.getText());
//        }
//        System.out.println(nop.notebookList.get(Tools.randomGenerator(6)).getText());

    }
}
