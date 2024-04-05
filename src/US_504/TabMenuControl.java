package US_504;

import Utility.BaseDriver;
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



}
