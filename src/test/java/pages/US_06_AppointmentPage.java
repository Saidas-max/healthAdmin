package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_06_AppointmentPage {
    public US_06_AppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//strong[text()='Appointment registration saved!']")
    public WebElement appointmentSavedText;

    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "ssn")
    public WebElement ssnInput;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "phone")
    public WebElement phoneInput;

    @FindBy(id = "register-submit")
    public WebElement appointmentSubmitButton;

    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement firstNameBlankMessage;

    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement lastNameBlankMessage;

    @FindBy(xpath = "//div[text()='Email is already in use!']")
    public WebElement differentSSNWarningMessage;

    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement ssnBlankMessage;

    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement emailBlankMessage;

    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement invalidEmailMessage;

    @FindBy(xpath = "//div[text()='Phone number is invalid']")
    public WebElement invalidPhoneMessage;

    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement phoneBlankMessage;


}
