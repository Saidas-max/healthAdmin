package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08_AppointmentPage {
    public US_08_AppointmentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIconha;

    @FindBy(id = "login-item")
    public WebElement signInOptionha;


    @FindBy(id = "username")
    public WebElement usernameInputha;

    @FindBy(id = "password")
    public WebElement passwordInputha;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButtonha;

    @FindBy(xpath = "//span[.='MY PAGES(PATIENT)']")
    public WebElement myPagesha;

    @FindBy(xpath = "//span[.='Make an Appointment']")
    public WebElement makeAnAppointmentha;


    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneNumberha;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement appointmentDateha;

    @FindBy(xpath = "//span[.='Send an Appointment Request']")
    public WebElement requestButtonha;


    @FindBy(xpath = "//*[text()='Appointment registration saved!']")
    public WebElement requestButtonMessageha;


    @FindBy(xpath = "//input[@value='2023-03-26']")
    public WebElement aValidDateha;


    @FindBy(xpath = "//span[.='Appointment date can not be past date!']")
    public WebElement invalidDateMessage;

    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement appointmentDateButtonha;

    @FindBy(xpath = "//span[.='Sign out']")
    public WebElement signOutha;

    @FindBy(xpath = "//span[.='Bilge Bella Pery']")
    public WebElement registeredNameIconha;

    @FindBy(xpath = " //span[.='My Appointments']")
    public WebElement myAppointmentsDropDown;

    @FindBy(xpath = " //input[@name='fromDate']")
    public WebElement fromDateBox;

    @FindBy(xpath = " //input[@name='toDate']")
    public WebElement toDateBox;

    @FindBy(xpath = "//table//tr//td[1]")
    public WebElement verifyAppointmentId;


    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPagesMenuha;


}

