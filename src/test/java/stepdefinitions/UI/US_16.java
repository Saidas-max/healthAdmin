package stepdefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_16PatientPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_16 {

    US_16PatientPage us_16PatientPage = new US_16PatientPage();
    Faker faker = new Faker();

    @Given("clicks on user icon")
    public void clicks_on_user_icon() {
        us_16PatientPage.userIcon.click();
    }
    @When("admin select patient option")
    public void admin_select_patient_option() {
       us_16PatientPage.patient.click();
    }
    @When("admin clicks on create a new patient button")
    public void admin_clicks_on_create_a_new_patient_button() {
        us_16PatientPage.newPatient.click();
    }
    @When("admin fills the patient info boxes")
    public void admin_fills_the_patient_info_boxes() {
        us_16PatientPage.firstname.sendKeys(faker.name().firstName());
        us_16PatientPage.lastname.sendKeys(faker.name().lastName());
        us_16PatientPage.birthDate.sendKeys("2000-03-14 08:00 AM");
        us_16PatientPage.email.sendKeys(faker.internet().emailAddress());
        us_16PatientPage.phone.sendKeys("647 657 0993");
        Select select = new Select(us_16PatientPage.gender);
        select.selectByVisibleText("MALE");
        Select select1 = new Select(us_16PatientPage.bloodGroup);
        select1.selectByVisibleText("A+");
        us_16PatientPage.address.sendKeys(faker.address().streetAddress());
        us_16PatientPage.description.sendKeys(faker.expression("thyroid"));
        Select select2 = new Select(us_16PatientPage.user);
        select2.selectByIndex(12);
        Select select3 = new Select(us_16PatientPage.patientCountry);
        select3.selectByVisibleText("Canada");

    }
    @When("admin clicks on save button")
    public void admin_clicks_on_save_button() {
        JSUtils.clickElementByJS(us_16PatientPage.savePatient);
    }

    @Then("verify a new patient with identifier message is displayed")
    public void verify_a_new_patient_with_identifier_message_is_displayed() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_16PatientPage.alert.isDisplayed());

    }

}
