package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_09UIpage;
import utilities.ConfigReader;
import utilities.Driver;
public class US_09UIStepDef {
    US_09UIpage page=new US_09UIpage();
    @Given("user clicks the logIn dropdown")
    public void userClicksTheLogInDropdown() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

        //Driver.getDriver().get(ConfigReader.getProperty("medunna_login_url"));

        page.loginDropDown.click();
    }
    @And("user clicks on the signIn button")
    public void user_Clicks_On_The_Sign_In_Button() {
        page.signinbtn.click();
    }
    @And("user provides the userName as {string}")
    public void userProvidesTheUserNameAs(String string) {
        page.enterUsername.sendKeys(string);
    }
    @And("user provides the passWord as {string}")
    public void userProvidesThePassWordAs(String string) {
        page.password.sendKeys(string);
    }
    @And("user clicks on the signInButton")
    public void userClicksOnTheSignInButton() {
        page.clickSignin.click();
    }
    @And("user clicks on user segment")
    public void userClicksOnUserSegment() {
        page.userProfile.click();
    }
    @And("user clicks on Password")
    public void userClicksOnPassword() {
        page.passwordOption.click();
    }
    @And("user provides the currentPassword as {string}")
    public void userProvidesTheCurrentPasswordAs(String string) throws InterruptedException{
        Thread.sleep(5000);
        page.currentPassword.sendKeys(string);
    }
    @And("user provides the newPassword as {string}")
    public void userProvidesTheNewPasswordAs(String string) {
        page.newPassword.sendKeys(string);
    }
    @And("user provides the newPasswordConfirmation as {string}")
    public void userProvidesTheNewPasswordConfirmationAs(String string) {
        page.confirmPassword.sendKeys(string);
    }
    @Then("user verifies password changed successfully")
    public void userVerifiesPasswordChangedSuccessfully() {

       // page.passwordStrength1.isDisplayed();

        page.passwordStrength1.isDisplayed();

    }
}
