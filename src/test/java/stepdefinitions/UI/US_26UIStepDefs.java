package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_26UIpage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class US_26UIStepDefs {
    US_26UIpage page = new US_26UIpage();
    @Given("user clicku the logIn dropdown")
    public void user_clicku_the_log_in_dropdown() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(3000);
        page.loginDropDown.click();
    }
    @Given("user clicku on the signIn button")
    public void user_clicku_on_the_sign_in_button() throws InterruptedException {
        Thread.sleep(3000);
    page.signinbtn.click();
    }
    @Given("user provideu the userName {string}")
    public void user_provideu_the_user_name(String string) throws InterruptedException {
        Thread.sleep(3000);
    page.enterUsername.sendKeys("HastaBilge");
    }
    @Given("user provideu the passWord {string}")
    public void user_provideu_the_pass_word(String string) throws InterruptedException {
        Thread.sleep(3000);
      page.enterpassword.sendKeys("Luzumsuz71");
    }
    @And("user clicku on the SignIn button")
    public void userClickuOnTheSignInButton() throws InterruptedException {
        Thread.sleep(3000);
        page.clickSignin.click();
    }
    @And("user clicku on the First Name")
    public void userClickuOnTheFirstName() {
        page.clickFirstName.click();
    }
    @And("user clicku on the Last Name")
    public void userClickuOnTheLastName() {
        page.clickLastName.click();
    }

    @Given("user clicku on the MY PAGES\\(PATIENT)")
    public void user_clicku_on_the_my_pages_patient() throws InterruptedException {
        Thread.sleep(3000);
    page.clickMyPagesPatient.click();
    }
    @Given("user clicku on the Make an Appointment")
    public void user_clicku_on_the_make_an_appointment() throws InterruptedException {
        Thread.sleep(3000);
     page.clickMakeAnAppointment.click();
    }
    @Given("user clicku on the SSN")
    public void user_clicku_on_the_ssn() throws InterruptedException {
        Thread.sleep(3000);
     page.clickSSN.clear();
     Thread.sleep(3000);
     page.clickSSN.sendKeys("545-78-2471");
    }
    @Given("user clicku on the Email")
    public void user_clicku_on_the_email() throws InterruptedException {
        Thread.sleep(3000);
        page.clickEmail.clear();
        Thread.sleep(3000);
    page.clickEmail.sendKeys("peryhasta@gmail.com");
    }
    @Given("user clicku on the Phone")
    public void user_clicku_on_the_phone() throws InterruptedException {
        Thread.sleep(3000);
    page.clickPhoneNumber.sendKeys("571-300-5070");
    }
    @Given("user clicku on the Appointment DateTime")
    public void user_clicku_on_the_appointment_date_time() throws InterruptedException {
        Thread.sleep(5000);
    page.clickAppointmentDateTime.click();
    }
    @Then("user clicku on Send an Appointment Request Button")
    public void userClickuOnSendAnAppointmentRequestButton() throws InterruptedException {
        Thread.sleep(5000);
        JSUtils.scrollIntoViewJS(US_26UIpage.appointmentSubmitButton);
        JSUtils.clickElementByJS(US_26UIpage.appointmentSubmitButton);
    }
}
