package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_0102HomePage {


    public US_0102HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="account-menu")
    public WebElement userIcon;

    @FindBy(linkText="Register")
    public WebElement registerOption;

    @FindBy( id="ssn")
    public WebElement ssnNumber;

//    @FindBy( xpath="//*[@class='invalid-feedback']")
//    public WebElement invalidSSNText;

    @FindBy( xpath="//div[contains(text(),'Your SSN is invalid')]")
    public WebElement invalidSSNText;

    @FindBy( id="firstName")
    public WebElement firstName;

    @FindBy( xpath="//div[contains(text(),' Your FirstName is required.')]")
    public WebElement invalidFirstNameText;



    @FindBy( id="lastName")
    public WebElement lastName;

    @FindBy( id="username")
    public WebElement userName;

    @FindBy( id="email")
    public WebElement email;

    @FindBy( id="firstPassword")
    public WebElement newPassword;

    @FindBy( id="secondPassword")
    public WebElement newConfirmPassword;

    @FindBy( id="register-submit")
    public WebElement registerButton;


//    @FindBy(id = "account-menu")
//    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInOption;


    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//*[@id='admin-menu']/a")
    public WebElement administirationSection;

    @FindBy(css= "#admin-menu > div > a > span")
    public WebElement userManagementOption;

//*[@id="admin-menu"]/div/a/svg



}
