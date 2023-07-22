package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_25PatientHomePage {


    public US_25PatientHomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "My Appointments")
    public WebElement myAppointments;

    @FindBy(linkText = "MY PAGES(PATIENT)")
    public WebElement myPages;

    @FindBy(id = "fromDate")
    public WebElement fromDate;

    @FindBy(id = "toDate")
    public WebElement toDate;

    @FindBy(linkText = "Show Tests")
    public WebElement showTestsButton;

    @FindBy(linkText = "View Results")
    public WebElement viewResultsButton;

    @FindBy(id = "c-test-result-heading")
    public WebElement testResultTableName;

    @FindBy(xpath = "//table/thead/tr/th")
    public List<WebElement> testResultsHeads;

    @FindBy(linkText = "Show Invoice")
    public WebElement showInvoce;

    @FindBy(xpath = "//*[(text()='545-78-2471')]")
    public  WebElement  rowSSN;

    @FindBy(xpath = "//table/thead/tr[5]/th[2]")
    public  WebElement  rowName;

    @FindBy(xpath = "//table//thead//tr[7]//th[2]")
    public  WebElement  rowTotalCost;


//table//thead//tr[7]//th[2]
















}
