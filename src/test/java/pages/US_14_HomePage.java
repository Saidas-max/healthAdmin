package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_14_HomePage {

    public US_14_HomePage() {
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


    @FindBy(xpath = "//*[@id=\"c-test-result-heading\"]")

    public WebElement patientTestResult;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement updateAppointment;
    @FindBy(xpath = "//a[@href=\"/tests/appointment/1258\"]")
    public WebElement TestResults;


    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/table/tbody/tr[1]/td[7]/div/a")
    public WebElement ClickViewTest;
    @FindBy(linkText = "//a[@href=\"/testresult/test/1806/1864\"]")
    public WebElement TestResultsVisible;



@FindBy(xpath = "//span[text()='My Patients']")
    public WebElement getMyAppointments;
@FindBy (xpath = "//table//tr[1]//td[1]")
    public WebElement IDAppointmentPage;


@FindBy(id = "in-patient-room")
    public WebElement patientRoom;


}
