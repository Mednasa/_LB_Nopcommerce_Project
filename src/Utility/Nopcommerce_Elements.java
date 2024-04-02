package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Nopcommerce_Elements extends ParentPage {

    public Nopcommerce_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(css = "[class='ico-register'] ")
    public WebElement register;
    @FindBy(css = "[class='female']")
    public WebElement female;
    @FindBy(css = "[id='FirstName']")
    public WebElement firstName;
    @FindBy(id = "LastName")
    public WebElement lastName;
    @FindBy(id = "Email")
    public WebElement Email;
    @FindBy(css = "select[name='DateOfBirthDay']")
    public WebElement birthDay;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    public WebElement birthMonth;
    @FindBy(css = "select[name='DateOfBirthYear']")
    public WebElement birthYear;
    @FindBy(id = "Newsletter")
    public WebElement newsletter;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;
    @FindBy(css = "[id='register-button']")
    public WebElement registerbtn;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement logIn;
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
    @FindBy(css = "[class='recipient-name']")
    public WebElement recipientNamePlc;
    @FindBy(css = "[class='sender-name']")
    public WebElement senderNamePlc;
    @FindBy(css = "[class='message']")
    public WebElement messageBox;
    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    public WebElement addToCartButton;
    @FindBy(xpath = "//p[text()='Enter valid sender name']")
    public WebElement senderNameWarningMsg;
    @FindBy(xpath = "//p[text()='Enter valid recipient name']")
    public WebElement recipientNameWarningMsg;
    @FindBy(xpath = "//p[contains(text(),'The product has been added')]")
    public WebElement successMsg;
    @FindBy(css = "class='bar-notification error'] p")
    public List<WebElement> warningMsg;
    @FindBy(linkText = "Computers")
    public WebElement computersBtn;
    @FindBy(css = "[class='sub-category-item'] h2")
    public List<WebElement> computersList;
    @FindBy(css = "[class='product-title']")
    public List<WebElement> notebookList;
    @FindBy(css = "[id='small-searchterms']")
    public WebElement searchBox;
    @FindBy(xpath = "(//*[text()='Search'])[1]")
    public WebElement searchBtn;
    @FindBy(xpath = "h2[class=\"product-title\"] a")
    public WebElement adobeCS4;
    @FindBy(linkText = "Desktops")
    public WebElement desktopsBtn;
    @FindBy(linkText = "Build your own computer")
    public WebElement buildComputer;
    @FindBy(css="[id='product_attribute_2']")
    public WebElement ramSelect;
    @FindBy(name = "product_attribute_3")
    public List<WebElement> hddSelection;
    @FindBy(xpath = "//*[text()='Add to cart']")
    public WebElement buildComputerAddToCart;
    @FindBy(xpath = "//*[contains(text(),'has been added')]")
    public WebElement addedYourSc;


}
