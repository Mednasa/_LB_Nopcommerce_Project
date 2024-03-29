package Utility;

import org.openqa.selenium.support.PageFactory;

public class Nopcommerce_Elements extends ParentPage {

    public Nopcommerce_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
}
