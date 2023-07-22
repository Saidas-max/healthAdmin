package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_16PatientPage {

    public US_16PatientPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement items_titles;

    @FindBy(xpath = "//span[text()='Patient']")
    public WebElement patient;

    @FindBy(xpath = "//span[text()='Create a new Patient']")
    public WebElement newPatient;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastname;

    @FindBy(id = "patient-birthDate")
    public WebElement birthDate;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(id = "patient-gender")
    public WebElement gender;

    @FindBy(id = "patient-bloodGroup")
    public WebElement bloodGroup;

    @FindBy(id = "patient-adress")
    public WebElement address;

    @FindBy(id = "patient-description")
    public WebElement description;

    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement user;

    @FindBy(id = "patient-country")
    public WebElement patientCountry;

    @FindBy(id = "patient-cstate")
    public WebElement patientCstate;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement savePatient;

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    public WebElement firstId;

    @FindBy(xpath = "//span[text()='First Name']")
    public WebElement patientFirstName;

    @FindBy(xpath = "//span[text()='Last Name']")
    public WebElement patientLastName;

    @FindBy(xpath = "//span[text()='Birth Date']")
    public WebElement patientBirthDate;

    @FindBy(xpath = "//span[text()='Phone']")
    public WebElement patientPhone;

    @FindBy(xpath = "//span[text()='Gender']")
    public WebElement patientGender;

    @FindBy(xpath = "//span[text()='Blood Group']")
    public WebElement patientBloodGroup;

    @FindBy(xpath = "//span[text()='Address']")
    public WebElement patientAddress;

    @FindBy(xpath = "(//span[text()='Country'])[1]")
    public WebElement patient1Country;

    @FindBy(xpath = "//span[text()=' State/City']")
    public WebElement patientStateCity;

    @FindBy(xpath = "//div[contains(text(),'A new Patient is created with')]")
    public WebElement alert;


















}
