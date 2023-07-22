package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_03MedunnaHomePage {

    public US_03MedunnaHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement accountIcon;

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement registerLink;

    @FindBy(id = "firstPassword")
    public WebElement firstPassword;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement secondPassword;

    @FindBy(xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public List<WebElement> bar4;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public List<WebElement> bar5;

    @FindBy(xpath = "(//div//div//form//div)[6]")    // -->(//div[@class='invalid-feedback'])[1]
    public WebElement invalidFeedback;

    @FindBy(xpath = "//span[text()='Password strength:']")
    public WebElement validPassword;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement weakPassword;

    @FindBy(xpath = "//*[text()='Password strength:']")
    public WebElement passwordStrengthText;








}
