package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_15_LoginPage {

    public US_15_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(id = "rememberMe")
    public WebElement rememberMeCheckbox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButton;
}
