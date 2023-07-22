package stepdefinitions.UI;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.US_14_HomePage;
import pages.US_14_LoginPage;
import pages.US_14_MyInpatient;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.io.IOException;

import static org.junit.Assert.assertTrue;


public class US_14_UI_SignInStepDefs {

    US_14_HomePage us14HomePage = new US_14_HomePage();
    US_14_LoginPage us14LoginPage = new US_14_LoginPage();

    US_14_MyInpatient us14MyInpatient = new US_14_MyInpatient();

    @Given("Doctor is in {string} Medunna_US14")
    public void doctor_is_in_medunna(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Click on ICON on the menu_US14")
    public void click_on_icon_on_the_menu() {
        ReusableMethods.waitFor(1);
        us14HomePage.userIcon.click();
    }

    @When("click on Sign In option_US14")
    public void and_click_on_sign_in_option() {
        ReusableMethods.waitFor(1);
        us14HomePage.signInOption.click();

    }

    @When("click LoginItem_US14")
    public void click_login_item() {
        ReusableMethods.waitFor(1);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @When("input registered Username_US14")
    public void input_registered_username() {
        ReusableMethods.waitFor(1);

        us14LoginPage.usernameInput.sendKeys("DoktorSedat");

    }

    @When("input registered  password_US14")
    public void input_registered_password() {
        ReusableMethods.waitFor(1);
        us14LoginPage.passwordInput.sendKeys("Maitland20");
    }


    @When("check rememmber me checkbox_US14")
    public void check_rememmber_me_checkbox() {
        ReusableMethods.waitFor(1);
        us14LoginPage.rememberMeCheckbox.click();

    }

    @When("click submit button confirm submission_US14")
    public void click_submit_button_confirm_submission() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us14LoginPage.signInSubmitButton);
    }

    @When("click My page")
    public void click_my_page() {
        us14HomePage.MyPage.click();
    }

    @When("click My Appointment control patient Tests_US14")
    public void click_my_appointment_control_patient_tests() {
        ReusableMethods.waitFor(1);
        us14HomePage.MyAppointments.click();
    }

    @Then("Assert that patients test outcomes is displayed on Appointments_US14")
    public void assert_that_patients_test_outcomes_is_displayed_on_appointments() {
        ReusableMethods.waitFor(3);
        assertTrue(us14HomePage.patientTestResult.isDisplayed());

    }

    @When("clik edit to be able to go Sedats test results_US14")
    public void clik_edit_to_be_able_to_go_sedats_test_results() {

        ReusableMethods.waitFor(3);
        us14HomePage.updateAppointment.click();
    }

    @When("click Show test Results to see patient tests_US14")
    public void click_show_test_results_to_see_patient_tests() {
        ReusableMethods.waitFor(3);
        us14HomePage.TestResults.click();
    }

    @When("click View results get patient's tests details_US14")
    public void click_view_results_get_patient_s_tests_details() {
        ReusableMethods.waitFor(3);
        us14HomePage.ClickViewTest.click();
    }

    @Then("after clicking View results Doctor should be able to see Test Results . Verify Tests Result is displayed")
    public void after_clicking_view_results_doctor_should_be_able_to_see_test_results_verify_tests_result_is_displayed() {
        ReusableMethods.waitFor(5);
        assertTrue(us14HomePage.TestResultsVisible.isDisplayed());
    }

    @Given("Click on My Inpatient_US14")
    public void click_on_my_inpatient() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(us14MyInpatient.clickInpatient);
    }


    @Given("Click edit In Patient_US15")
    public void click_edit_in_patient() {
        ReusableMethods.waitFor(3);
        JSUtils.clickElementByJS(us14MyInpatient.EditInpatient);
    }


    @Given("click Status to change the inpatient status_US14")
    public void click_status_to_change_the_inpatient_status() {
        JSUtils.clickElementByJS(us14MyInpatient.clickStatus);

    }

    @When("click on Sign In option")
    public void click_on_sign_in_option() {
        us14HomePage.signInOption.click();
    }

    @Given("change status from Canceled to Staying_US14")
    public void change_status_from_canceled_to_staying() {
        us14MyInpatient.StatusStaying.click();

    }

    @Given("Select ROOM number from dropdown_US14")
    public void select_room_number_from_dropdown_us14() {

        Select select = new Select(us14HomePage.patientRoom);
        select.selectByIndex(10);
    }


    @Given("Click SAVE  button confirm changes_US14")
    public void click_save_button_confirm_changes() throws IOException {
        ReusableMethods.waitFor(2);
        us14MyInpatient.SaveInpatient.submit();
       ReusableMethods.getScreenshot("Fail1234");
    //    ReusableMethods.getScreenshot("https://www.medunna.com/in-patient/2052/edit");
    }

    @Then("take a screenshot of notification after clicking save_US14")
    public void take_a_screenshot_of_notification_after_clicking_save() {



    }

    @When("Assert ID is displayed")
    public void assert_id_is_displayed() {
        us14HomePage.IDAppointmentPage.getText();
        assertTrue(us14HomePage.IDAppointmentPage.isDisplayed());

    }

    @When("Assert SNN is displayed")
    public void assert_snn_is_displayed() {

    }

    @When("Select ROOM number from dropdown")
    public void select_room_number_from_dropdown() {
us14MyInpatient.SelectRoom.isSelected();
    }


    @Then("close the application{int}")
    public void closeTheApplication(int arg0) {

        Driver.closeDriver();

    }
}








































