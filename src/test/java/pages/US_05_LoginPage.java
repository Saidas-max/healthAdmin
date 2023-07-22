package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_05_LoginPage {
    public US_05_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "rememberMe")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement failedMessage;

    @FindBy(xpath = "//span[text()='Register a new account']")
    public WebElement registerLink;

    @FindBy(xpath = "//span[text()='Cancel']")
    public WebElement cancelButton;
}
