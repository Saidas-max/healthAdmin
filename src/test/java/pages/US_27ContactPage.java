package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_27ContactPage {



    public US_27ContactPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id='header-tabs']/li[6]/a")
    public WebElement contactOption;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement nameUser;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement emailUser;

    @FindBy(xpath = "//*[@id='subject']")
    public WebElement subject;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement message;

    @FindBy(xpath = "//body//h4")
    public WebElement locationText;

    @FindBy(xpath = "//body//div[2]/h4")
    public WebElement emailText;

    @FindBy(xpath = "//body//div[3]/h4")
    public WebElement callText;

    @FindBy(xpath = "//body//div[1]/p")
    public WebElement address;

    @FindBy(xpath = "//body//div[2]/p")
    public WebElement email;

    @FindBy(xpath = "//body//div[3]/p")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='register-submit']")
    public WebElement sendButton;





}
