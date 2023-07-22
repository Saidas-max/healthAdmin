package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_04ActivationPage {

    public US_04ActivationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInOption;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement signInSubmitButton;

    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administration;

    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagement;

    @FindBy(xpath = "(//span[text()='Edit'])[2]")
    public WebElement editPatient;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement editStaff;

    @FindBy(xpath = "(//span[text()='Edit'])[4]")
    public WebElement editDoctor;

    @FindBy(xpath = "(//span[text()='Edit'])[3]")
    public WebElement editUser;

    @FindBy(xpath = "//span[text()='Activated']")
    public WebElement activatedCheckbox;

    @FindBy(id = "authorities")
    public WebElement rolesDropdown;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'A user is updated with')]")
    public WebElement alert;

    @FindBy(xpath = "//span[text()='Admin Team03']")
    public WebElement adminTeam03;

    @FindBy(xpath = "//span[text()='Sign out']")
    public WebElement signOut;
}
