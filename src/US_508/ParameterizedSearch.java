package US_508;

import Utility.BaseDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedSearch extends BaseDriver {
    String email = "takolew581@centerf.com";
    String password = "xml12345";

    @Test
    @Parameters("searchText")
    public void parameterizedSearch(String txt) {

        //Login Process
        nop.myClick(nop.logIn);
        nop.mySendKeys(nop.emailPlc, email);
        nop.mySendKeys(nop.passwordPlc, password);
        nop.myClick(nop.loginButton);



    }


}
