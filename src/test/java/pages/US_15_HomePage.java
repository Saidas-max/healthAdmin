package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_15_HomePage {

    public US_15_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "account-menu")
    public WebElement userIcon;

    @FindBy(id= "login-item")
    public WebElement signInOption;

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement MyPage;
    @FindBy(xpath = "//span[text()='My Appointments']")

    public WebElement MyAppointments;

    @FindBy(xpath = "//*[.='ID']")
     public WebElement patientId;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/thead/tr/th[2]/span")
    public WebElement startDate;

    @FindBy(xpath = "//*[.='End DateTime']")
    public WebElement endDate;

    @FindBy(xpath = "//*[.='Description']")
    public WebElement description;

    @FindBy(xpath = "//*[.='Created Date']")
    public WebElement createdDate;

    @FindBy(xpath = "//span[text()='My Inpatients']")
    public WebElement clickInpatient;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")

    public WebElement EditInpatient;


    @FindBy(id = "in-patient-status")
    public WebElement Discharging;

    @FindBy(xpath = "//*[@id=\"save-entity\"]")
    public WebElement saveButton;


}
