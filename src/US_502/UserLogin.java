package US_502;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class UserLogin extends BaseDriver {
    String email="lelohat616@agromgt.com";
    String password="Test123.";


    @Test
    public void Login(){
        nop.myClick(nop.logIn);
        nop.mySendKeys(nop.emailPlc,email);
        nop.mySendKeys(nop.passwordPlc,password);
        nop.myClick(nop.loginButton);

    }

}
