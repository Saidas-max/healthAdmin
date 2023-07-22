package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_04ActivationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_04Stepdefinitions {

    US_04ActivationPage us_04ActivationPage = new US_04ActivationPage();

    @When("clicks on user sign in option4")
    public void clicks_on_user_sign_in_option() {

        us_04ActivationPage.signInOption.click();
    }

    @When("send admin username into username input4")
    public void send_admin_username_into_username_input() {
        us_04ActivationPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
    }
    @When("send admin password into password input4")
    public void send_admin_password_into_password_input() {
        us_04ActivationPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
    }
    @When("clicks on Sign in button4")
    public void clicks_on_sign_in_button() {
        us_04ActivationPage.signInSubmitButton.click();
    }
    @When("verify administration option is displayed")
    public void verify_administration_option_is_displayed() {
        Assert.assertTrue(us_04ActivationPage.administration.isDisplayed());
    }
    @When("click on administration option4")
    public void click_on_administration_option() {
        us_04ActivationPage.administration.click();
    }
    @When("click on user management link4")
    public void click_on_user_management_link() {
        us_04ActivationPage.userManagement.click();
    }

    @And("goes to activation page url")
    public void goesToActivationPageUrl() {
        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().to("https://www.medunna.com/admin/user-management?page=21&sort=id,asc");
        ReusableMethods.waitFor(3);
    }

    @When("click on deactivated registered {string} edit button")
    public void click_on_deactivated_registered_edit_button(String role) {
        switch (role) {
            case "patient":
                JSUtils.clickElementByJS(us_04ActivationPage.editPatient);
                break;
            case "staff":
                JSUtils.clickElementByJS(us_04ActivationPage.editStaff);
                break;
            case "doctor":
                JSUtils.clickElementByJS(us_04ActivationPage.editDoctor);
                break;
            case "user":
                JSUtils.clickElementByJS(us_04ActivationPage.editUser);
                break;
        }
    }
    @And("click on Activated checkbox if not checked")
    public void clickOnActivatedCheckboxIfNotChecked() throws IOException {
        ReusableMethods.waitFor(3);
        if (!us_04ActivationPage.activatedCheckbox.isSelected()){
            JSUtils.clickElementByJS(us_04ActivationPage.activatedCheckbox);
        }
        ReusableMethods.getScreenshot("activate");
    }

    @And("select Role_Patient option from profiles dropdown")
    public void selectRole_PatientOptionFromProfilesDropdown() {
        ReusableMethods.waitFor(3);
        Select select = new Select(us_04ActivationPage.rolesDropdown);
        select.selectByVisibleText("ROLE_PATIENT");
    }

    @When("click on save button")
    public void click_on_save_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us_04ActivationPage.saveButton);
    }

    @Then("verify user updated message is displayed")
    public void verifyUserUpdatedMessageIsDisplayed() {
      //  Driver.getDriver().navigate().to("https://www.medunna.com/admin/user-management?page=1&sort=id,asc");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_04ActivationPage.alert.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    @And("select Role_Staff option from profiles dropdown")
    public void selectRole_StaffOptionFromProfilesDropdown() {
        Select select = new Select(us_04ActivationPage.rolesDropdown);
        select.selectByVisibleText("ROLE_STAFF");
    }

    @And("select Role_Physician option from profiles dropdown")
    public void selectRole_PhysicianOptionFromProfilesDropdown() {
        Select select = new Select(us_04ActivationPage.rolesDropdown);
        select.selectByVisibleText("ROLE_PHYSICIAN");
    }

    @And("select Role_USER option from profiles dropdown")
    public void selectRole_USEROptionFromProfilesDropdown() {
        Select select = new Select(us_04ActivationPage.rolesDropdown);
        select.selectByVisibleText("ROLE_USER");
    }

    @And("click on adminTeam{int}")
    public void clickOnAdminTeam(int arg0) {
        JSUtils.clickElementByJS(us_04ActivationPage.adminTeam03);
        ReusableMethods.waitFor(2);
    }

    @And("click on sign out")
    public void clickOnSignOut() {
        JSUtils.clickElementByJS(us_04ActivationPage.signOut);
        ReusableMethods.waitFor(3);
    }
}

