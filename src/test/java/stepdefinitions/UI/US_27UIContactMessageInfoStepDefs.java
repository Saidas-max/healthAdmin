package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_27ContactPage;
import utilities.JSUtils;
import utilities.ReusableMethods;


public class US_27UIContactMessageInfoStepDefs {

    //        Location:
//        575 Eighth Avenue New York, NY 10018
//
//        Email:
//        contact@medunna.com
//
//        Call:
//        +1 (336) 546-5245
    US_27ContactPage us_27ContactPage=new US_27ContactPage();
    @When("verify that there is location text  and hospital address")
    public void verify_that_there_is_location_text_and_hospital_address() {
       Assert.assertTrue(us_27ContactPage.locationText.getText().contains("Location:"));
       Assert.assertTrue(us_27ContactPage.address.getText().contains("575 Eighth Avenue New York, NY 10018"));
    }
    @When("verify that there is email text  and email")
    public void verify_that_there_is_email_text_and_email() {
       Assert.assertTrue(us_27ContactPage.emailText.getText().contains("Email:"));
        Assert.assertTrue(us_27ContactPage.email.getText().contains("contact@medunna.com"));
           }
    @When("verify that there is call text  and phone number")
    public void verify_that_there_is_call_text_and_phone_number() {
         Assert.assertTrue(us_27ContactPage.callText.getText().contains("Call:"));
        Assert.assertTrue(us_27ContactPage.phoneNumber.getText().contains("+1 (336) 546-5245"));
    }
    @When("user clicks CONTACT Option on homepage")
    public void user_licks_contact_option_on_homepage() {
        ReusableMethods.waitFor(3);
     us_27ContactPage.contactOption.click();
    }
    @When("user enters Name {string} in name field")
    public void user_enters_name_in_name_field(String name) {
        us_27ContactPage.nameUser.sendKeys(name);
    }
    @When("user enters Email {string} in email field")
    public void user_enters_email_in_email_field(String email) {
        us_27ContactPage.emailUser.sendKeys(email);
    }
    @When("user enters Subject {string} in subject field")
    public void user_enters_subject_in_subject_field(String subject) {
        us_27ContactPage.subject.sendKeys(subject);
    }
    @When("user enters Message {string} in message field")
    public void user_enters_message_in_message_field(String message) {
        us_27ContactPage.message.sendKeys(message);
    }
    @And("user clicks message send button")
    public void userClicksMessageSendButton() {
        JSUtils.clickElementByJS(us_27ContactPage.sendButton);
    }
}
