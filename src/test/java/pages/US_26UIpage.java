package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US_26UIpage {

    public US_26UIpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class=\"d-flex align-items-center dropdown-toggle nav-link\"]")
    public WebElement loginDropDown;
    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signinbtn;
    @FindBy(id = "username")
    public WebElement enterUsername;
    @FindBy(id = "password")
    public WebElement enterpassword;
    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement clickSignin;
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a/span")
    public WebElement clickMyPagesPatient;
    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[2]/span")
    public  WebElement clickMakeAnAppointment;
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement clickFirstName;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement clickLastName;
    @FindBy(xpath = "//*[@id=\"ssn\"]")
    public WebElement clickSSN;
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement clickEmail;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    public WebElement clickPhoneNumber;
    @FindBy(id = "appoDate")
    public WebElement clickAppointmentDateTime;
    @FindBy(id = "register-submit")
    public static WebElement appointmentSubmitButton;
}


















