package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_10UIpage {



  public US_10UIpage() {
    PageFactory.initElements(Driver.getDriver(), this);
  }
  @FindBy(xpath = "//span[text()='MY PAGES']")
  public WebElement MyPage;

  @FindBy(xpath = "(//*[contains(text(),'Search Patient')])[1]")
  public WebElement SearchPatient;

  @FindBy(xpath = "//input[@name='ssn']")
  public WebElement patientSSNBox;

  @FindBy(xpath = "//span[text()='Edit']")
  public WebElement editButton;

  @FindBy(id = "patient-firstName")
  public WebElement firstNameBox;

  @FindBy(xpath = "//*[@id='patient-lastName']")
  public WebElement lastNameBox;

  @FindBy(xpath = "//*[@id='patient-birthDate']")
  public WebElement birthDateBox;

  @FindBy(xpath = "//*[@id='email']")
  public WebElement eMailBox;

  @FindBy(xpath = "//*[@id='patient-phone']")
  public WebElement phoneNumberBox;

  @FindBy(xpath = "//*[@id='patient-gender']")
  public WebElement genderDropDown;

  @FindBy(xpath = "//*[@id='patient-bloodGroup']")
  public WebElement bloodGroupDropDown;

  @FindBy(xpath = "//*[@id='patient-adress']")
  public WebElement addressBox;

  @FindBy(xpath = "//*[@id='patient-description']")
  public WebElement descriptionBox;

  @FindBy(xpath = "//*[@id='patient-user']")
  public WebElement userPatientDropDown;

  @FindBy(xpath = "//*[@id='patient-country']")
  public WebElement countryDropDown;

  @FindBy(id = "patient-cstate")
  public WebElement stateDropDown;

  @FindBy(xpath = "//*[@id='save-entity']")
  public WebElement saveButton;

}

