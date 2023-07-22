package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_07_LoginPage {

    public US_07_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "username")
    public WebElement usernameInputha;

    @FindBy(id = "password")
    public WebElement passwordInputha;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButtonha;


    @FindBy(xpath = "//*[@id=\"account-menu\"]/a/span")
    public WebElement registeredUserNameha;

    @FindBy(xpath = "//span[.='Settings']")
    public WebElement userSettingha;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement editedFirstNameha;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement editedLastNameha;

    @FindBy(xpath = "//span[.='Save']")
    public WebElement saveButtonha;

    @FindBy(xpath = "//h2[@id='settings-title']")
    public WebElement settingSavedAlertha;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement editedEmailha;

}