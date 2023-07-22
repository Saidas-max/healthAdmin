package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_05_HomePage {
    public US_05_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signInOption;

    @FindBy(xpath = "//h1[text()='Welcome to MEDUNNA']")
    public WebElement welcomeText;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInAgainButton;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement signOutOption;

    @FindBy(xpath = "//h2")
    public WebElement thankYouMessage;

    @FindBy(xpath = "//h1")
    public WebElement RegistrationText;

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAppointmentButton;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement myPagesOption;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatientOption;

    @FindBy(xpath = "//span[text()='Administration']")
    public WebElement administrationDropdown;

    @FindBy(xpath = "//span[text()='User management']")
    public WebElement userManagementOption;



}
