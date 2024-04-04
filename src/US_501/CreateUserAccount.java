package US_501;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserAccount extends BaseDriver {
    String firstname="Test1";
    String lastname="Test1";
    String company="None";
    String email="lelohat616@agromgt.com";
    String password="Test123.";
    String confirmPassword="Test123.";

    @Test
    public void Register(){
        nop.myClick(nop.register);
        nop.myClick(nop.female);
        nop.mySendKeys(nop.firstName,firstname);
        nop.mySendKeys(nop.lastName,lastname);
        nop.myClick(nop.birthDay);
        nop.myClick(nop.birthDay1);
        nop.myClick(nop.birthMonth);
        nop.myClick(nop.birthMonth1);
        nop.myClick(nop.birthYear);
        nop.myClick(nop.birthYear1);
        nop.mySendKeys(nop.Email,email);
        nop.myClick(nop.newsletter);
        nop.mySendKeys(nop.password,password);
        nop.mySendKeys(nop.confirmPassword,confirmPassword);
        nop.myClick(nop.registerbtn);
        Assert.assertTrue(nop.succesMessage.isDisplayed(),"Your registration completed");


    }


}
