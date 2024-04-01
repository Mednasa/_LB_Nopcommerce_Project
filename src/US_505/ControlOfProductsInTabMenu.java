package US_505;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class ControlOfProductsInTabMenu extends BaseDriver {
    String eMail="femiy35445@nimadir.com";
    String password ="jx@sU58FhqKmMF ";

    @Test(priority = 1)
    public void login(){
        nop.mySendKeys(nop.emailPlc, eMail);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);

    }
}
