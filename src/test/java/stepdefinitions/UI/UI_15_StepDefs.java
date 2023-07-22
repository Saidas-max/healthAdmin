package stepdefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_15_HomePage;
import pages.US_15_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class UI_15_StepDefs {

    US_15_HomePage us15HomePage = new US_15_HomePage();
    US_15_LoginPage us15LoginPage = new US_15_LoginPage();

    @Given("Doctor is in {string} Medunna_US15")
    public void doctor_is_in_medunna_us15(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Click on ICON on the menu_US15")
    public void click_on_icon_on_the_menu_us15() {
            ReusableMethods.waitFor(1);
           us15HomePage.userIcon.click();

    }

    @When("click on Sign In option_US15")
    public void click_on_sign_in_option_us15() {
        ReusableMethods.waitFor(2);
        us15HomePage.signInOption.click();
    }
    @When("input registered Username_US15")
    public void input_registered_username_us15() {
        ReusableMethods.waitFor(2);
       us15LoginPage.usernameInput.sendKeys("DoktorSedat");
    }
    @When("input registered  password_US15")
    public void input_registered_password_us15()
    {
        ReusableMethods.waitFor(2);
        us15LoginPage.passwordInput.sendKeys("Maitland20");
    }
    @When("check rememmber me checkbox_US15")
    public void check_rememmber_me_checkbox_us15() {
        ReusableMethods.waitFor(2);
        us15LoginPage.rememberMeCheckbox.click();
    }
    @When("click submit button confirm submission_US15")
    public void click_submit_button_confirm_submission_us15() {
        ReusableMethods.waitFor(2);
        us15LoginPage.signInSubmitButton.click();
    }
    @When("click My Patients_US15")
    public void click_my_patients_us15() {
  us15HomePage.MyAppointments.click();
    }
    @Then("verify doctor can see ID_US15")
    public void verify_doctor_can_see_id_us15() {
        Assert.assertTrue(us15HomePage.patientId.isDisplayed());
    }

    @Then("verify doctor can see start and_US15")
    public void verify_doctor_can_see_start_and_us15() {

Assert.assertTrue(us15HomePage.startDate.isDisplayed());

    }

    @Then("verify doctor can see created end dates_US15")
    public void verify_doctor_can_see_created_end_dates_us15() {
us15HomePage.endDate.isDisplayed();

    }
    @Then("verify doctor can see  description_US15")
    public void verify_doctor_can_see_description_us15() {
        us15HomePage.description.isDisplayed();
    }
    @Then("verify doctor can see created data_US15")
    public void verify_doctor_can_see_created_data_us15() {
        us15HomePage.createdDate.isDisplayed();
    }
    @Then("Click on My Inpatient")
    public void click_on_my_inpatient() {
        JSUtils.clickElementByJS(us15HomePage.clickInpatient);
    }
    @Then("Click edit In Patient")
    public void click_edit_in_patient() {
        us15HomePage.EditInpatient.click();

    }
    @Then("click Status to change the inpatient status")
    public void click_status_to_change_the_inpatient_status() {

    }
    @Then("change status from Canceled to  DISCHARGED")
    public void change_status_from_canceled_to_discharged() {
us15HomePage.Discharging.isSelected();
Select select = new Select(us15HomePage.Discharging);
select.selectByIndex(2);

    }
    @Then("Click SAVE  button confirm changes")
    public void click_save_button_confirm_changes() {
    JSUtils.clickElementByJS(us15HomePage.saveButton);
    }

    }






