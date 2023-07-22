package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_18_20Page {

    public US_18_20Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement items_titles;

    @FindBy(xpath = "//span[text()='Test Item']")
    public WebElement testitemfromdropdown;

    @FindBy(id = "jh-create-entity")
    public WebElement createAnewTestItem;

    @FindBy(id = "c-test-item-name")
    public WebElement testItemName;

    @FindBy(id = "c-test-item-price")
    public WebElement testItemPrice;

    @FindBy(id = "save-entity")
    public WebElement testItemSaveButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement createdTestItemSuccessMessage;

    @FindBy(id = "nameLabel")
    public WebElement ItemName;



    @FindBy(id = "descriptionLabel")
    public WebElement ItemsDescription;

    @FindBy(id = "priceLabel")
    public WebElement ItemPrice;

    @FindBy(id = "defaultValMinLabel")
    public WebElement ItemDefaultMinValue;

    @FindBy(id = "defaultValMaxLabel")
    public WebElement ItemDefaultMaxValue;

    @FindBy(id = "createdDateLabel")
    public WebElement ItemCreatedDate;



    @FindBy(xpath = "//span[text()='ID']")
    public WebElement sortID;

    @FindBy(xpath = "(//span[text()='Delete'])[1]")
    public WebElement testItemDeleteButton;

    @FindBy(id = "jhi-confirm-delete-cTestItem")
    public WebElement popupDeleteButton;

    @FindBy(xpath="//div[@class='Toastify__toast-body']")
    public WebElement deleteSuccessMessage;

    @FindBy(xpath = "//span[text()='Staff']")
    public WebElement staffFromDropdown;

    @FindBy(xpath = "//span[text()='Create a new Staff']")
    public WebElement createNewStaffButton;

    @FindBy(id = "useSSNSearch")
    public WebElement useSearchBox;

    @FindBy(id = "searchSSN")
    public WebElement ssnSearchField;

    @FindBy(xpath = "//button[text()='Search User']")
    public WebElement searchStaffUserButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement searchStaffSuccessBox;



    @FindBy(xpath = "//span[text()='Test Items']")
    public WebElement testItemsWord;

    @FindBy(id = "staff-firstName")
    public WebElement populateStaffName;

    @FindBy(id = "staff-lastName")
    public WebElement populateStaffLastName;


    @FindBy(id = "staff-birthDate")
    public WebElement populateStaffBirthday;


    @FindBy(id = "staff-phone")
    public WebElement populateStaffPhone;

    @FindBy(id = "staff-gender")
    public WebElement populateStaffGender;

    @FindBy(id = "staff-bloodGroup")
    public WebElement populateStaffBlood;

    @FindBy(id = "staff-adress")
    public WebElement populateStaffAddress;

    @FindBy(id = "staff-description")
    public WebElement populateStaffDescription;

    @FindBy(id = "staff-user")
    public WebElement populateStaffUser;

    @FindBy(id = "staff-createdDate")
    public WebElement populateStaffCreatedDate;

    @FindBy(id = "staff-country")
    public WebElement populateStaffCountry;

    @FindBy(id = "staff-cstate")
    public WebElement populateStaffCState;


    @FindBy(xpath = "(//a[@class='btn btn-link btn-sm'])[3]")
    public WebElement staffID4362;

    @FindBy(xpath = "//b[text()='4362']")
    public WebElement confirmStaffId4362;

    @FindBy(xpath = "(//span[text()='Edit'])[3]")
    public WebElement staffEditButton;

    @FindBy(xpath = "(//span[text()='Delete'])[3]")
    public WebElement staffDeleteButton;









}
