package US_504;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TabMenuControl extends BaseDriver {

    // qweewq@hotmail.com
    // Asd123

    @Test(priority = 1)
    public void login(){
        nop.myClick(nop.logIn);
        nop.mySendKeys(nop.emailPlc, "qweewq@hotmail.com");
        nop.mySendKeys(nop.passwordPlc, "Asd123");
        nop.myClick(nop.loginButton);
    }

    @Test(priority = 2)
    public void TabMenuControl(){

        for (int i = 0; i <nop.tabMenu2.size() ; i++) {
            nop.myClick(nop.tabMenu2.get(i));
            Assert.assertTrue(nop.tabMenuVerification.getText().contains(nop.tabMenuText.get(i).getText()));

        }

    }
    @Test(priority = 2)
    public void ComputersSubsMenuControl(){
        nop.myClick(nop.computersBtn);
        for (int i = 0; i <nop.subsMenu.size(); i++) {
            String verification=nop.subsMenuText.get(i).getText();
            System.out.println(verification);
            nop.myClick(nop.subsMenu.get(i));
            Assert.assertTrue(nop.tabMenuVerification.getText().contains(verification));
            driver.navigate().back();

        }
    }
    @Test(priority = 3)
    public void ElectronicsSubsMenuControl(){
        nop.myClick(nop.electronicsBtn);
        for (int i = 0; i <nop.subsMenu.size(); i++) {
            String verification=nop.subsMenuText.get(i).getText();
            System.out.println(verification);
            nop.myClick(nop.subsMenu.get(i));
            Assert.assertTrue(nop.tabMenuVerification.getText().contains(verification));
            driver.navigate().back();

        }
    }
    @Test(priority = 4)
    public void ApparelSubsMenuControl(){
        nop.myClick(nop.apparelBtn);
        for (int i = 0; i <nop.subsMenu.size(); i++) {
            String verification=nop.subsMenuText.get(i).getText();
            System.out.println(verification);
            nop.myClick(nop.subsMenu.get(i));
            Assert.assertTrue(nop.tabMenuVerification.getText().contains(verification));
            driver.navigate().back();

        }
    }






}
