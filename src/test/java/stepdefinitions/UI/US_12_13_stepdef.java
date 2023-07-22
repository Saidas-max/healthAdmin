


package stepdefinitions.UI;



import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.US_12_13_page;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US_12_13_stepdef {

    //pageleri obj create etmeyi unutma
    US_12_13_page us_12_13_page =new US_12_13_page();

    @Given("user is on {string} page12")
    public void user_is_on_page(String string) {
        Driver.getDriver().get(string);

    }
    @When("click on user icon12")
    public void click_on_user_icon() {
        ReusableMethods.waitFor(1);
        us_12_13_page.userIcon.click();

    }
    @When("click on Sign In option12")
    public void click_on_sign_in_option() {
        ReusableMethods.waitFor(1);
        us_12_13_page.signInOption.click();
    }
    @When("enter {string} in username input12")
    public void enter_in_username_input(String username) {
        ReusableMethods.waitFor(3);
        us_12_13_page.usernameInput.sendKeys(username);
    }
    @When("enter {string} in password input12")
    public void enter_in_password_input(String password) {
        ReusableMethods.waitFor(1);
        us_12_13_page.passwordInput.sendKeys(password);
    }
    @When("click on Sign In submit button12")
    public void click_on_sign_in_submit_button() {
        ReusableMethods.waitFor(1);
        us_12_13_page.signInSubmitButton.click();
        ReusableMethods.waitFor(3);
    }
    @When("click on MY PAGES12")
    public void click_on_my_pages() {
        ReusableMethods.waitFor(1);
        us_12_13_page.mypagesbutton.click();


    }
    @When("click on My Appointments12")
    public void click_on_my_appointments() {
        ReusableMethods.waitFor(1);
        us_12_13_page.myappointments.click();
    }
    @When("clicks on edit button to create or edit an appointment12")
    public void clicks_on_edit_button_to_create_or_edit_an_appointment() {
        ReusableMethods.waitFor(1);
        us_12_13_page.editbutton.click();
    }
    @Then("verifies patient's id,start datetime and end datetime, status12")
    public void verifies_patient_s_id_start_datetime_and_end_datetime_status() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us_12_13_page.hastaid.isDisplayed());
        Assert.assertTrue(us_12_13_page.hastastartdatetime.isDisplayed());
        Assert.assertTrue(us_12_13_page.hastaenddatetime.isDisplayed());



    }
    @Then("Doctor fills in required fields, anemnesis, treatment, diagnosis12")
    public void doctor_fills_in_required_fields_anemnesis_treatment_diagnosis() {
        ReusableMethods.waitFor(2);
        us_12_13_page.anamnesisfield.clear();
        us_12_13_page.anamnesisfield.sendKeys("no surgery");
        us_12_13_page.treatmentfield.clear();
        us_12_13_page.treatmentfield.sendKeys("medicine");
        us_12_13_page.diagnosisfield.clear();
        us_12_13_page.diagnosisfield.sendKeys("tumor");


    }
    @Then("click on save button12")
    public void click_on_save_button() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_12_13_page.saveappoinmentbutton);

    }
    @Then("Verify appointment is saved successfully12")
    public void verify_appointment_is_saved_successfully() {
        ReusableMethods.waitFor(1);
        String text= us_12_13_page.appointmentstextondoctorsappoinmentspage.getText();
        Assert.assertTrue(text.equals("Appointments"));
    }

    //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02

    @Then("verify patient's id;12")
    public void verify_patient_s_id() {
        ReusableMethods.waitFor(1);

        String textid=JSUtils.getValueInStringByJS("appointment-id");
        System.out.println(textid);
        ReusableMethods.waitFor(1);
        Assert.assertEquals("2469",textid);


    }
    @Then("verify patient's start date time;12")
    public void verify_patient_s_start_date_time() {

        ReusableMethods.waitFor(1);
        String Textstartdatefield=JSUtils.getValueInStringByJS("appointment-startDate");
        System.out.println(" startdatein icindeki tarih "+Textstartdatefield);
        ReusableMethods.waitFor(1);
        Assert.assertEquals("2023-02-21T18:00",Textstartdatefield);


    }
    @Then("verify patient's end date time;12")
    public void verify_patient_s_end_date_time() {
        ReusableMethods.waitFor(1);
        String Textenddatefield=JSUtils.getValueInStringByJS("appointment-endDate");
        System.out.println(" enddatein icindeki tarih "+Textenddatefield);
        ReusableMethods.waitFor(1);
        Assert.assertEquals("2023-02-21T19:00",Textenddatefield);

    }
    @Then("verify patient's status;12")
    public void verify_patient_s_status() {
        ReusableMethods.waitFor(1);
        String Textstatusfield=JSUtils.getValueInStringByJS("appointment-status");
        System.out.println(" STATUSUN ICINDEKI TEXT "+Textstatusfield);
        ReusableMethods.waitFor(1);
        Assert.assertEquals("PENDING",Textstatusfield);
    }

    //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02 //TC02


    @Then("click on signout12")
    public void click_on_signout() {
        us_12_13_page.signOutOption.click();

    }

    //TC03 //TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03

    @Then("verify you see {string} message on empty Anamnesis field when you enter the save button12")
    public void verify_you_see_message_on_empty_anamnesis_field_when_you_enter_the_save_button(String string) {

        ReusableMethods.waitFor(1);
        us_12_13_page.anamnesisfield.clear();
        JSUtils.clickElementByJS(us_12_13_page.saveappoinmentbutton);
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us_12_13_page.emptyfieldmessage.isDisplayed());

    }

    @Then("verify you see {string} message on empty Treatment field when you enter the save button12")
    public void verify_you_see_message_on_empty_treatment_field_when_you_enter_the_save_button(String string) {

        ReusableMethods.waitFor(1);
        us_12_13_page.treatmentfield.clear();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_12_13_page.emptyfieldmessage.isDisplayed());
    }

    @Then("verify you see {string} message on empty Diagnosis field when you enter the save button12")
    public void verify_you_see_message_on_empty_diagnosis_field_when_you_enter_the_save_button(String string) {

        ReusableMethods.waitFor(1);
        us_12_13_page.diagnosisfield.clear();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us_12_13_page.emptyfieldmessage.isDisplayed());

    }

    //TC03 //TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03//TC03



    //TC04  //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04

    @Then("verify prescription is optional12")
    public void verify_prescription_is_optional() {

        us_12_13_page.appointmentprescriptionfield.clear();
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_12_13_page.saveappoinmentbutton);
        ReusableMethods.waitFor(6);
        String text= us_12_13_page.appointmentstextondoctorsappoinmentspage.getText();
        Assert.assertTrue(text.equals("Appointments"));
        ReusableMethods.waitFor(1);




    }
    @Then("verify description is optional12")
    public void verify_description_is_optional() {

        JSUtils.clickElementByJS(us_12_13_page.editbutton);
        us_12_13_page.appointmentprescriptionfield.clear();
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_12_13_page.saveappoinmentbutton);
        ReusableMethods.waitFor(5);
        String text= us_12_13_page.appointmentstextondoctorsappoinmentspage.getText();
        Assert.assertTrue(text.equals("Appointments"));


    }

    //TC04  //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04 //TC04




    //TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05
    @Then("verify Status dropdown has PENDING,COMPLETED AND CANCELLED options12")
    public void verify_status_dropdown_has_pending_completed_and_cancelled_options() {

        List<WebElement> statusdropdownlist= us_12_13_page.appointmentstatusdropdownlist;
        System.out.println(statusdropdownlist.size());
        String pendingtext=statusdropdownlist.get(1).getText();
        String completedtext =statusdropdownlist.get(2).getText();
        String canselledtext=statusdropdownlist.get(3).getText();
        List<String> statusdropdownlisttext=new ArrayList<>();
        statusdropdownlisttext.add(pendingtext);
        statusdropdownlisttext.add(completedtext);
        statusdropdownlisttext.add(canselledtext);
        Assert.assertTrue(statusdropdownlist.size()==4);
        Assert.assertTrue(statusdropdownlisttext.contains("PENDING"));
        Assert.assertTrue(statusdropdownlisttext.contains("COMPLETED"));
        Assert.assertTrue(statusdropdownlisttext.contains("CANCELLED"));
    }
    //TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05//TC05


    //us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01
    @And("click on {string} button13")
    public void clickOnButton(String arg0) {
        ReusableMethods.waitFor(1);
        us_12_13_page.requestatestButton.click();


    }


    @And("click on {string} check mark13")
    public void clickOnCheckMark(String arg0) {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_12_13_page.insulinCheckBox);


    }

    @Then("verify user see success popup message13")
    public void verifyUserSeeSuccessPopupMessage() {
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(us_12_13_page.testCreatedSuccessMessage);

    }

    @Then("verify {string} {string} {string} {string} {string} {string}  {string} has checkmark options13")
    public void verifyHasCheckmarkOptions(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        List<WebElement> checkboxlist=us_12_13_page.checkBoxes;
        System.out.println(checkboxlist.size());



    }

    //us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01//us13tc01



//input[@type='checkbox']


}
