



package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_12_13_page {

    public US_12_13_page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

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

    @FindBy(id = "entity-menu")
    public WebElement mypagesbutton;

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement myappointments;


    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement editbutton;

    @FindBy(id = "appointment-id")
    public WebElement hastaid;


    @FindBy(xpath = "//input[@type='datetime-local']")
    public WebElement hastastartdatetime;

    @FindBy(id = "appointment-endDate")
    public WebElement hastaenddatetime;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement emptyfieldmessage;

    @FindBy(id = "appointment-anamnesis")
    public WebElement anamnesisfield;

    @FindBy(id = "appointment-treatment")
    public WebElement treatmentfield;

    @FindBy(id = "appointment-diagnosis")
    public WebElement diagnosisfield;

    @FindBy(id = "save-entity")
    public  WebElement saveappoinmentbutton;

    @FindBy(id = "appointment-heading")
    public  WebElement appointmentstextondoctorsappoinmentspage;



    @FindBy (id="appointment-id")
    public WebElement  appointmentidfield;
    ;

    @FindBy(id = "appointment-startDate")
    public  WebElement appointmentstartdatefield;

    @FindBy(id = "appointment-endDate")
    public  WebElement appointmentenddatefield;

    @FindBy(id = "appointment-status")
    public  WebElement appointmentstatusfield;

    @FindBy(id = "appointment-prescription")
    public WebElement appointmentprescriptionfield;

    @FindBy(id = "appointment-description")
    public WebElement appointmentdescriptionfield;


    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement signOutOption;

    @FindBy(xpath = "//select[@id='appointment-status']//option")
    public List<WebElement> appointmentstatusdropdownlist;

    @FindBy (xpath = "//*[text()='Request A Test']")
    public WebElement requestatestButton;

    @FindBy(xpath = "//*[@class='is-untouched is-pristine av-valid form-check-input']")
    public WebElement insulinCheckBox;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement testCreatedSuccessMessage;

    @FindBy(xpath = "//table//tr//td[9]")
    public List<WebElement> checkBoxes;




////div[@class='btn-group flex-btn-group-container'


//table//tr//td[9]
}

