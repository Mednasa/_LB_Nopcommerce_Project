package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Nopcommerce_Elements extends ParentPage {

    public Nopcommerce_Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }


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
    @FindBy(xpath = "//p[@class='content']")
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


}
