package stepdefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_16PatientPage;

public class US_16StepDefinitions {

    US_16PatientPage us_16PatientPage = new US_16PatientPage();
    Faker faker = new Faker();

    @When("clicks on Items and Titles option")
    public void clicks_on_items_and_titles_option() {
        us_16PatientPage.items_titles.click();
    }

    @When("clicks on Patient option")
    public void clicks_on_patient_option() {
        us_16PatientPage.patient.click();
    }

    @When("clicks on Create a new patient")
    public void clicks_on_create_a_new_patient() {
       us_16PatientPage.newPatient.click();
    }
    @When("enters firstname")
    public void enters_firstname() {
        us_16PatientPage.firstname.sendKeys(faker.name().firstName());
    }
    @When("enters lastname")
    public void enters_lastname() {
        us_16PatientPage.lastname.sendKeys(faker.name().lastName());
    }
    @When("enters birthdate")
    public void enters_bithdate() {
       //us_16PatientPage.birthDate.sendKeys("2023-03-14 08:00 AM");
    }

    @And("enters email")
    public void entersEmail() {
        us_16PatientPage.email.sendKeys(faker.internet().emailAddress());
    }

    @When("enters phone")
    public void enters_phone() {
        us_16PatientPage.phone.sendKeys(faker.phoneNumber().cellPhone());
    }
    @When("enters gender")
    public void enters_gender() {
        Select select = new Select(us_16PatientPage.gender);
        select.selectByVisibleText("FEMALE");
    }
    @When("enters blood group")
    public void enters_blood_group() {
        Select select = new Select(us_16PatientPage.bloodGroup);
        select.selectByVisibleText("AB+");

    }
    @When("enters address")
    public void enters_address() {
        us_16PatientPage.address.sendKeys(faker.address().streetAddress());

    }
    @When("enters description")
    public void enters_description() {
    us_16PatientPage.description.sendKeys("New Patient");
    }
    @When("select country")
    public void select_country() {
    Select select = new Select(us_16PatientPage.patientCountry);
    select.selectByVisibleText("Canada");
    }
    @When("select state")
    public void select_state() {
        us_16PatientPage.patientCstate.sendKeys("Ontario");
    }
    @When("clicks on save button")
    public void clicks_on_save_button() {

    }
    @Then("verify A new patient is created with identifier text is visible")
    public void verify_a_new_patient_is_created_with_identifier_text_is_visible() {

    }


    @When("admin clicks first patient id")
    public void adminClicksFirstPatientId() {
        us_16PatientPage.firstId.click();
    }


    @Then("verify patient firstname is visible.")
    public void verifyPatientFirstnameIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientFirstName.isDisplayed());
    }

    @Then("verify patient lastname is visible.")
    public void verifyPatientLastnameIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientLastName.isDisplayed());
    }


    @Then("verify patient birthdate is visible.")
    public void verifyPatientBirthdateIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientBirthDate.isDisplayed());
    }


    @Then("verify patient phone is visible.")
    public void verifyPatientPhoneIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientPhone.isDisplayed());
    }


    @Then("verify patient gender is visible.")
    public void verifyPatientGenderIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientGender.isDisplayed());
    }


    @Then("verify patient blood group is visible.")
    public void verifyPatientBloodGroupIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientBloodGroup.isDisplayed());
    }


    @Then("verify patient address is visible.")
    public void verifyPatientAddressIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientAddress.isDisplayed());
    }


    @Then("verify patient country is visible.")
    public void verifyPatientCountryIsVisible() {
        //Assert.assertTrue(us_16PatientPage.patient1Country.isDisplayed());
    }


    @Then("verify patient state is visible.")
    public void verifyPatientStateIsVisible() {
        Assert.assertTrue(us_16PatientPage.patientStateCity.isDisplayed());
    }

    @Then("verify country box  is selectable")
    public void verifyCountryBoxIsSelectable() {
        Assert.assertTrue(us_16PatientPage.patient1Country.isEnabled());

    }

    @Then("verify  state box is selectable")
    public void verifyStateBoxIsSelectable() {
    }
}
