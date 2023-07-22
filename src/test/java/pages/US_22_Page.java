package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_22_Page {

    public US_22_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement staffAccountMenuha;

    @FindBy(id = "login-item")
    public WebElement staffSignInha;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement registeredStaffUserNameha;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement registeredStaffPasswordha;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButtonha;

    @FindBy(xpath = "//span[.='MY PAGES']")
    public WebElement staffMyPagesMenuha;

    @FindBy(xpath = "//span[.='Search Patient']")
    public WebElement searchPatientDropDownha;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnNumberBoxha;

    @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement showAppointmentsButtonha;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editButtonha;


    @FindBy(xpath = "//input[@id='appointment-startDate']")
    public WebElement startDateBoxha;

    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement endDateBoxha;

    @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement physicianButtonha;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButtonha;

    @FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div/div[1]")
    public WebElement updatedMessageha;

    @FindBy(xpath = "//a[@href='/tests/appointment/10586']")
    public WebElement showTestResultha;

    @FindBy(xpath = "//span[text()='View Results']")
    public WebElement viewResult;


    @FindBy(xpath = "//select[@id='appointment-status']//option")
    public WebElement appointmentStatusha;


   @FindBy(xpath = "//select[@id='appointment-status']//option[1]")
    public WebElement unaprovvedDropDownha;

   @FindBy(xpath = "//select[@id='appointment-status']//option[2]")
    public WebElement pendingDropDownha;

   @FindBy(xpath = "//select[@id='appointment-status']//option[4]")
    public WebElement cancelDropDownha;

   @FindBy(xpath = "//select[@id='appointment-status']//option[3]")
    public WebElement completedDropDownha;

   @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesisButton;

   @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatmentButton;


   @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosisButton;


   @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement physicianButton;

   @FindBy(xpath = "//div[@class='container-fluid view-container']")
    public WebElement testResultPage;



////*[@id="root"]/div/div/div[1]/div/div/div[1]

/////*[@id="appointment-status"]
////*[@id="appointment-status"]/option[1]
    //*[@id="appointment-status"]/option[2]
////*[@id="appointment-status"]/option[3] ---bunu sec
    //*[@id="appointment-status"]/option[4]


}