package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Nopcommerce_Elements extends ParentPage {

    public Nopcommerce_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailPlc;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordPlc;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement loginButton;
    @FindBy(css = ".top-menu.notmobile>li")
    public List<WebElement> tabMenu;
    @FindBy(css = "ul.top-menu.notmobile>:nth-of-type(7)")
    public WebElement giftCardsButton;
    @FindBy(css = "[class='button-2 product-box-add-to-cart-button']")
    public List<WebElement> addToCartButtons;


}
