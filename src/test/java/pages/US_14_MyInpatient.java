package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_14_MyInpatient {

    public US_14_MyInpatient() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='My Inpatients']")
    public WebElement clickInpatient;

    @FindBy(xpath = "(//span[text()='Edit'])[1]")

    public WebElement EditInpatient;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement clickStatus;

    @FindBy(xpath = "//option[@value=\"STAYING\"]")

    public WebElement StatusStaying;


    @FindBy(xpath = "//*[@id=\"save-entity\"]")
    public WebElement SaveInpatient;

    @FindBy(xpath = "//*[@id=\"in-patient-room\"]/option[11]")

    public WebElement SelectRoom;

    @FindBy(xpath = "//*[@id=\"in-patient-status\"]/option[3]")
    public WebElement Discharge;


}
