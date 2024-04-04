package US_507;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerOrderProcess extends BaseDriver {

    String eMail = "femiy35445@nimadir.com";
    String password = "jx@sU58FhqKmMF ";

    @Test(priority = 1,groups = {"Smoke Test"})
    public void login(){
        nop.myClick(nop.logIn);
        nop.mySendKeys(nop.emailPlc, eMail);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);
    }

    @Test(priority = 2,groups = {"UI Test"})
    public void computerprocess(){
        nop.myClick(nop.computersBtn);
        nop.myClick(nop.desktopsBtn);
        nop.myClick(nop.buildComputer);
        Select ramMenu=new Select(nop.ramSelect);
        ramMenu.selectByIndex((int) ((Math.random() * 3)+1));
        Tools.wait(3);
        nop.myClick(nop.hddSelection.get(Tools.randomGenerator(2)));
        Tools.wait(3);
        nop.myClick(nop.buildComputerAddToCart);
        nop.verifyContainsText(nop.addedYourSc, "has been added");

    }
}
