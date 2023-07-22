package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_23StaffSearchPatient {


    public US_23StaffSearchPatient() {

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath= "//a[@class='dropdown-item']")
    public WebElement searchOption;

    @FindBy(xpath= "//*[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath= "//input[@name='ssn']")
    public WebElement patientSsnSearch;

    @FindBy(linkText= "Show Appointments")
    public WebElement showAppointmentsButton;

    @FindBy(xpath= "//*[contains(text(),'Show Tests')]")
    public WebElement showTestsButton;


    @FindBy(xpath= "//*[contains(text(),'View Results')]")
    public WebElement viewResultsmb;


    @FindBy(xpath= "//*[contains(text(),'Edit')]")
    public WebElement editButtonmb;

    @FindBy(id= "c-test-result-result")
    public WebElement testResultField;

    @FindBy(id= "c-test-result-description")
    public WebElement testDescriptionField;


    @FindBy(xpath= "//*[@id='save-entity']")
    public WebElement saveTestResultButton;
















}
