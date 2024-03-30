package US_406;

import Utility.BaseDriver;
import org.testng.annotations.Test;

// CREDENTIALS
// Name       : Bradie
// Lastname   : Joyce
// Email      : tanna_stylesiysz@vacations.hj
// Password   : Not4You2Know
// Website    : https://demo.nopcommerce.com/

public class GiftOrderingProcess extends BaseDriver {
    String email = "tanna_stylesiysz@vacations.hj";
    String password = "Not4You2Know";

    @Test(priority = 1)
    public void login() {
        nop.mySendKeys(nop.emailPlc, email);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);
    }
}
