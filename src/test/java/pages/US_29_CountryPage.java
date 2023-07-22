package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_29_CountryPage {

    public US_29_CountryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsTitlesDropdown;

    @FindBy(xpath = "//span[text()='Country']")
    public WebElement countryOption;

    @FindBy(xpath = "//span[text()='Create a new Country']")
    public WebElement createNewCountryButton;

    @FindBy(id = "country-name")
    public WebElement countryNameInput;

    @FindBy(xpath = "//div[contains(text(),'A new Country is created with')]")
    public WebElement countryCreatedMessage;

    @FindBy(xpath = "//div[contains(text(),'A Country is deleted with')]")
    public WebElement countryDeletedMessage;

    @FindBy(xpath = "(//span[text()='Delete'])[12]")
    public WebElement deleteButton;


}
