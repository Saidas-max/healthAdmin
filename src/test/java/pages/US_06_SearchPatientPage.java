package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_06_SearchPatientPage {
    public US_06_SearchPatientPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//tbody//td[2]")
    public WebElement patientSsn;

    @FindBy(xpath = "//tbody//td[3]")
    public WebElement patientFirstName;

    @FindBy(xpath = "//tbody//td[4]")
    public WebElement patientLastName;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement ssnSearchBox;




}
