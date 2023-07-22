package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_11_LoginPage {
    public US_11_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement signIn;

    @FindBy(id = "login-item")
    public WebElement signInOption;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;
    
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    }

