package stepdefinitions.UI;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_07_HomePage;
import pages.US_07_LoginPage;
import pages.US_08_AppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US_08_UI_AppointmentStepDefs {
   US_07_HomePage us_07_homePage =new US_07_HomePage();
   US_07_LoginPage us_07_loginPage = new US_07_LoginPage();
   US_08_AppointmentPage us_08_appointmentPage = new US_08_AppointmentPage();

   @Given("user is {string} pageHA")
   public void user_is_page_ha(String string) {
      ReusableMethods.waitFor(1);
      Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

   }
   @When("Click on user icon on menu08")
   public void click_on_user_icon_on_menu08() {
      ReusableMethods.waitFor(1);
      us_08_appointmentPage.userIconha.click();

   }
   @When("Click on Sign In optionHA")
   public void click_on_sign_in_option_ha() {
      ReusableMethods.waitFor(1);
      us_08_appointmentPage.signInOptionha.click();

   }
   @When("Enter registered usernameHA")
   public void enter_registered_username_ha() {
      ReusableMethods.waitFor(1);
      us_08_appointmentPage.usernameInputha.sendKeys(ConfigReader.getProperty("patientUsername07"));

   }

   @When("Enter registered  passwordHA")
   public void enter_registered_password_ha() {
      ReusableMethods.waitFor(1);
      us_08_appointmentPage.passwordInputha.sendKeys(ConfigReader.getProperty("patientPassword07"));

   }
   @When("Click on Sign In submit buttonHA")
   public void click_on_sign_in_submit_button_ha() {
      ReusableMethods.waitFor(1);
      us_08_appointmentPage.signInSubmitButtonha.click();

   }
   @When("click My pages\\(Patient) iconHA")
   public void click_my_pages_patient_icon_ha() {
      ReusableMethods.waitFor(2);
      us_08_appointmentPage.myPagesha.click();

   }
   @When("click  Make an AppointmentHA")
   public void click_make_an_appointment_ha() {
      ReusableMethods.waitFor(2);
      us_08_appointmentPage.makeAnAppointmentha.click();
   }
   @When("enter a phone numberHA")
   public void enter_a_phone_number_ha() {
      ReusableMethods.waitFor(2);
      us_08_appointmentPage.phoneNumberha.sendKeys(ConfigReader.getProperty("patientPhoneNumber08"));

   }
   @When("Enter invalid dateHA")
   public void enter_invalid_date_ha() {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.appointmentDateha.sendKeys(ConfigReader.getProperty("patientAnInvalidDate"));

   }
   @When("Click Send an Appointment Request ButtonHA")
   public void click_send_an_appointment_request_button_ha() {
      ReusableMethods.waitFor(2);
      us_08_appointmentPage.requestButtonha.click();

   }
   @When("Verify the user should not be see the past date messageHA")
   public void verify_the_user_should_not_be_see_the_past_date_message_ha() {
      ReusableMethods.waitFor(2);
      Assert.assertTrue(us_08_appointmentPage.requestButtonMessageha.isEnabled());
   }
   @When("Click Sign in IconHA")
   public void click_sign_in_icon_ha() {
      ReusableMethods.waitFor(2);
      us_08_appointmentPage.registeredNameIconha.click();

   }
   @Then("click sign outHA")
   public void click_sign_out_ha() {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.signOutha.click();
   }


   @And("choose a valid date in proper formatHA")
   public void chooseAValidDateInProperFormatHA() {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.appointmentDateButtonha.sendKeys(ConfigReader.getProperty("patientValidDate"));
   }

   @Then("Verify the user should  be see the appointment  messageHA")
   public void verifyTheUserShouldBeSeeTheAppointmentMessageHA(){
      ReusableMethods.waitFor(3);
      Assert.assertTrue(us_08_appointmentPage.requestButtonMessageha.isDisplayed());


   }

   @And("Enter registered  doctor usernameHA")
   public void enterRegisteredDoctorUsernameHA() {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.usernameInputha.sendKeys(ConfigReader.getProperty("drUsername"));
   }

   @And("Enter registered  doctor passwordHA")
   public void enterRegisteredDoctorPasswordHA() {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.passwordInputha.sendKeys(ConfigReader.getProperty("drPassword"));
   }

   @And("click My Appointments dropdownHA")
   public void clickMyAppointmentsDropdownHA() {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.myAppointmentsDropDown.click();
   }

   @And("enter  date in the {string} boxHA")
   public void enterDateInTheBoxHA(String arg0) {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.fromDateBox.sendKeys(ConfigReader.getProperty("patientValidDate"));
   }

   @And("enter  date {string} date boxHA")
   public void enterDateDateBoxHA(String arg0) {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.toDateBox.sendKeys(ConfigReader.getProperty("patientValidDate"));
   }

   @Then("verify patient appointment appears on the pageHA")
   public void verifyPatientAppointmentAppearsOnThePageHA() {
      ReusableMethods.waitFor(3);
      Assert.assertTrue(us_08_appointmentPage.verifyAppointmentId.isDisplayed());
   }

   @And("Click on account menuHA")
   public void clickOnAccountMenuHA() {
      ReusableMethods.waitFor(3);
      us_07_homePage.userIconha.click();
   }

   @Then("click sign out dropdownHA")
   public void clickSignOutDropdownHA() {
      ReusableMethods.waitFor(3);
      us_08_appointmentPage.signOutha.click();
   }

   @And("click My pages iconHA")
   public void clickMyPagesIconHA() {
      us_08_appointmentPage.myPagesMenuha.click();
   }


}