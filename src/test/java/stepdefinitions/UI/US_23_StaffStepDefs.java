package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.US_0102HomePage;
import pages.US_23StaffSearchPatient;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_23_StaffStepDefs {

    US_23StaffSearchPatient us_23StaffSearchPatient=new US_23StaffSearchPatient();
    US_0102HomePage us_0102HomePage=new US_0102HomePage();


    @When("staff clicks Sign in option")
    public void staff_clicks_sign_in_option() {

      us_0102HomePage.signInOption.click();

    }
    @When("staff enters user's name {string} in field")
    public void staff_enters_user_s_name_in_field(String username) {

           us_0102HomePage.userName.sendKeys(username);    }
    @When("staff enterspasswords's   {string} in field")
    public void staff_enterspasswords_s_in_field(String password) {

       us_0102HomePage.passwordInput.sendKeys(password);
    }
    @When("staff click Remember Me checkbox")
    public void staff_on_remember_me_checkbox() {
        us_0102HomePage.rememberMeCheckbox.click();

    }
    @When("staff click on Sign In submit buttonAnd")
    public void staff_click_on_sign_in_submit_button_and() {
        us_0102HomePage.signInSubmitButton.click();

    }

    @When("staff enters the SsnNumber {string} into patient ssn field")
    public void user_enters_the_ssn_number_into_patient_ssn_field(String ssn) {
       us_23StaffSearchPatient.patientSsnSearch.sendKeys(ssn);

    }
    @When("staff clicks show appointments button to see appointment")
    public void user_clicks_show_appointments_button_to_see_appointment() {
        us_23StaffSearchPatient.showAppointmentsButton.click();

    }

    @And("staff clicks show test button to reach test")
    public void userClicksShowTestButtonToReachTest() {


        JSUtils.clickElementByJS(us_23StaffSearchPatient.showTestsButton);


    }

    @And("staff clicks view result button to view results")
    public void userClicksViewResultButtonToViewResults() {

        JSUtils.clickElementByJS(us_23StaffSearchPatient.viewResultsmb);

    }

    @And("staff clicks view Edit Button to edit results")
    public void userClicksViewEditButtonToEditResults() {

        JSUtils.clickElementByJS(us_23StaffSearchPatient.editButtonmb);


    }
    @When("staff enter test result in result field")
    public void user_enter_test_result_in_result_field() {
        us_23StaffSearchPatient.testResultField.clear();
        ReusableMethods.waitFor(2);
        us_23StaffSearchPatient.testResultField.sendKeys("negative");

    }
    @When("staff enter test description in description field")
    public void user_enter_test_description_in_description_field() {

        us_23StaffSearchPatient.testDescriptionField.clear();
        ReusableMethods.waitFor(2);

        us_23StaffSearchPatient.testDescriptionField.sendKeys("recipe will be written");
    }
    @When("staff click test result save button")
    public void user_click_test_result_save_button() {
        ReusableMethods.waitFor(2);
        us_23StaffSearchPatient.saveTestResultButton.click();

    }
}
