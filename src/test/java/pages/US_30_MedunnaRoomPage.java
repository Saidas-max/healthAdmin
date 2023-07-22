package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_30_MedunnaRoomPage {
    public US_30_MedunnaRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement userIconha;

    @FindBy(xpath = "//a[@id = 'login-item']")
    public WebElement signInOptionha;

    @FindBy(id = "username")
    public WebElement adminNameInputha;

    @FindBy(id = "password")
    public WebElement adminPasswordInputha;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInSubmitButtonha;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemTitleDropDownha;

 @FindBy(xpath = "//span[text()='Room']")
    public WebElement roomDropDownha;


    @FindBy(id = "//span[text()='Create a new Room']")
    public WebElement creatNewUserButtonha;

    @FindBy(id = "jh-create-entity")
    public WebElement createANewRoomButtonha;


    @FindBy(id = "room-roomNumber")
    public WebElement roomNumberInputha;

    @FindBy(id = "room-roomType")
    public WebElement roomTypeDropdownha;

    @FindBy(id = "room-status")
    public WebElement statusCheckboxha;

    @FindBy(id = "room-price")
    public WebElement priceInputha;

    @FindBy(id = "room-description")
    public WebElement descriptionInputha;

    @FindBy(id = "save-entity")
    public WebElement saveButtonha;

    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDateha;


    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement roomCreatedMessage;

    @FindBy(id = "//tbody/tr[2]/td[2]")
    public WebElement viewButtonha;

    @FindBy(xpath = "//div[@class='container-fluid view-container']")
    public WebElement roomInfoPageha;


    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement firstRoomNumberha;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/div/div[2]/div[1]")
    public WebElement showRoomha;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement roomUpdatedMessage;

    @FindBy(xpath = "//span[text()='View']")
    public WebElement viewResulButtonha;


    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement deleteButtonha;


    @FindBy(xpath = "//dl[@class='jh-entity-details']")
    public WebElement createdRoomInfoha;


    @FindBy(xpath = "//button[@id='jhi-confirm-delete-room']")
    public WebElement deletePopUpha;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement roomDeletedAlertMessage;

    @FindBy(xpath = "//span[text()='Delete']")
    public WebElement viewButtonHA;

}
