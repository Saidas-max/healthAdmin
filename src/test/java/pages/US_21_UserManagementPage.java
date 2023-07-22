package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_21_UserManagementPage {

    public US_21_UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement loginOption;

    @FindBy(xpath = "(//span[text()='View'])[1]")
    public WebElement viewOption;

    @FindBy(xpath = "//dd")
    public List<WebElement> userInfoList;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")
    public WebElement editOption;

    @FindBy(id = "activated")
    public WebElement activatedCheckBox;

    @FindBy(id = "authorities")
    public WebElement rolesDropdown;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[text()='Activated'])[1]")
    public WebElement activatedText;

    @FindBy(xpath = "//tbody//tr[1]//div/span")
    public List<WebElement> rolesTextList;

    @FindBy(xpath = "//span[text()='Create a new user']")
    public WebElement createNewUserButton;

    @FindBy(id = "login")
    public WebElement loginInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "ssn")
    public WebElement ssnInput;

    @FindBy(xpath = "//div[contains(text(),'A user is deleted with')]")
    public WebElement userDeletedMessage;

    @FindBy(xpath = "//table//th[1]")
    public WebElement idOption;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//div//button//span[text()='Delete']")
    public WebElement confirmDeleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveSubmitButton;










}
