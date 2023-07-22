package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_11_DoctorApptPage {
    public US_11_DoctorApptPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "appointment-heading")
    public WebElement ApptList;

    @FindBy(id = "entity-menu")
    public WebElement myPagesDropDown;

    @FindBy(id = "fromDate")
    public WebElement fromDate;

    @FindBy(id = "toDate")
    public WebElement toDate;
    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointmentButton;


    @FindBy(xpath = "//h2[@id ='appointment-heading']")
    public WebElement myAppointmentsPage;

    @FindBy(xpath = "//span[text()='Status']")
    public WebElement status;
    @FindBy(xpath = "//*[text()='ID']")
    public WebElement idButton;

    @FindBy(xpath = "//*[text()='Start DateTime']")
    public WebElement startDateTimeButton;

    @FindBy(xpath = "//*[text()='End DateTime']")
    public WebElement endDateTimeButton;




}
