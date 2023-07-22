package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_07_HomePage;
import pages.US_07_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_07_SigninStepDefs {
    US_07_HomePage us_07_homePage =new US_07_HomePage();
    US_07_LoginPage us_07_loginPage = new US_07_LoginPage();


    @Given("user is on {string} pageHA")
    public void user_is_on_page_ha(String string) {
        ReusableMethods.waitFor(1);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("click on user icon on menuHA")
    public void click_on_user_icon_on_menu_ha() {
        ReusableMethods.waitFor(1);
        us_07_homePage.userIconha.click();
    }
    @When("click on Sign In optionHA")
    public void click_on_sign_in_option_ha() {
        ReusableMethods.waitFor(1);
        us_07_homePage.signInOptionha.click();
    }
    @When("enter registered usernameHA")
    public void enter_registered_username_ha() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.usernameInputha.sendKeys(ConfigReader.getProperty("patientUsername07"));
    }
    @When("enter registered  passwordHA")
    public void enter_registered_password_ha() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.passwordInputha.sendKeys(ConfigReader.getProperty("patientPassword07"));
    }
    @When("click on Sign In submit buttonHA")
    public void click_on_sign_in_submit_button_ha() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.signInSubmitButtonha.click();
    }

    @When("Edit the emailHA")
    public void edit_the_email_ha() {
        us_07_loginPage.editedEmailha.clear();
        us_07_loginPage.editedEmailha.sendKeys(ConfigReader.getProperty("patientEditedEmail07"));
    }
    @When("Click save buttonHA")
    public void click_save_button_ha() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.saveButtonha.click();
    }
    @Then("Verify  Setting saved is displayedHA")
    public void verify_setting_saved_is_displayed_ha() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.settingSavedAlertha.isDisplayed();
    }
    @Then("close the applicationHA")
    public void close_the_application_ha() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }

    @When("Click On User  Registered User Name iconHA")
    public void clickOnUserRegisteredUserNameIconHA() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.registeredUserNameha.click();
    }

    @And("Click SettingHA")
    public void clickSettingHA() {
        ReusableMethods.waitFor(1);
        us_07_loginPage.userSettingha.click();
    }

    @And("Edit the first nameHA")
    public void editTheFirstNameHA() {
        us_07_loginPage.editedFirstNameha.clear();
        us_07_loginPage.editedFirstNameha.sendKeys(ConfigReader.getProperty("patientEditedUserame07"));
    }

    @And("Edit the last nameHA")
    public void editTheLastNameHA() {
        us_07_loginPage.editedLastNameha.clear();
        us_07_loginPage.editedLastNameha.sendKeys(ConfigReader.getProperty("patientEditedLastname07"));
    }
}
