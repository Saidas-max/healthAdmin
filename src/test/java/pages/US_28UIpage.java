package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_28UIpage {
    public US_28UIpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"account-menu\"]/a")
    public WebElement logIndropdown;

    @FindBy(xpath = "//*[@id=\"login-item\"]/span")
    public WebElement signInbutton;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public WebElement userName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement SignInbutton;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/a")
    public WebElement ItemsTitles;

   @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[9]")
    public WebElement Messages;

    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public  WebElement CreateanewMessage;

    @FindBy(xpath = "//*[@id=\"c-message-name\"]")
    public WebElement Name;

    @FindBy(xpath = "//*[@id=\"c-message-email\"]")
    public WebElement Email;

    @FindBy(xpath = "//*[@id=\"c-message-subject\"]")
    public WebElement Subject;

    @FindBy(xpath = "//*[@id=\"c-message-message\"]")
    public WebElement Message;

    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement save;

    @FindBy(xpath = "//span[text()='View']")
    public WebElement View;

    @FindBy(xpath = "//span[text()='Edit']")
    public WebElement edit;


    @FindBy(xpath = "//*[@id=\"save-entity\"]/span")
    public WebElement saveiu;



}
