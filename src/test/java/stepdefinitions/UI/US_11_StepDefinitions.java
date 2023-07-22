package stepdefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_11_DoctorApptPage;
import pages.US_11_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_11_StepDefinitions {
    US_11_LoginPage us_11_LoginPage = new US_11_LoginPage();
    US_11_DoctorApptPage us_11_doctorApptPage = new US_11_DoctorApptPage();

    @Given("User navigate to {string}")
    public void user_navigate_to(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("Click Sign in iconHU")
    public void click_sign_in_icon() {

        us_11_LoginPage.signIn.click();
    }

    @When("Choose Sign in from dropdownHU")
    public void choose_sign_in_from_dropdown() {

        us_11_LoginPage.signInOption.click();
    }

    @When("Enter the usernameHU")
    public void enter_the_username() {

        us_11_LoginPage.usernameInput.sendKeys("DoktorSedat");
    }

    @When("Enter the passwordHU")
    public void enter_the_password() throws InterruptedException {
        Thread.sleep(1000);

        us_11_LoginPage.passwordInput.sendKeys("Maitland20");
    }

    @When("Click the sign in buttonHU")
    public void click_the_sign_in_button() {
        us_11_LoginPage.signInSubmitButton.click();
    }

    @When("Click on MY PAGEHU")
    public void click_on_my_page() throws InterruptedException {
        Thread.sleep(1000);

        us_11_doctorApptPage.myPagesDropDown.click();
    }

    @When("Choose My Appointments from dropdownHU")
    public void choose_my_appointments_from_dropdown() throws InterruptedException {
        Thread.sleep(1000);
        us_11_doctorApptPage.myAppointmentButton.click();
    }

    @Then("Verify that their Appointments list on My Appointments pageHU")
    public void verify_that_their_appointments_list_on_my_appointments_page() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(us_11_doctorApptPage.myAppointmentsPage.isDisplayed());
    }

    @Then("Verify that their Appointments time slots on My Appointments pageHU")
    public void verify_that_their_appointments_time_slots_on_my_appointments_page() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(us_11_doctorApptPage.fromDate.isDisplayed());
        assertTrue(us_11_doctorApptPage.toDate.isDisplayed());
    }

    @Then("close the applicationHU")
    public void close_the_application() {

        Driver.closeDriver();
    }

    @Then("Verify that patient id, start date, end date, statusHU")
    public void verify_that_patient_id_start_date_end_date_status() throws InterruptedException {
        Thread.sleep(1000);
        assertTrue(us_11_doctorApptPage.idButton.isDisplayed());
        assertTrue(us_11_doctorApptPage.startDateTimeButton.isDisplayed());
        assertTrue(us_11_doctorApptPage.endDateTimeButton.isDisplayed());
        assertTrue(us_11_doctorApptPage.status.isDisplayed());


    }
}