package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_22_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_22StepDefinitons {
   US_22_Page us_22_page =new US_22_Page();

    @Given("user goes to medunna urlha")
   public void user_goes_to_medunna_urlha() {
        ReusableMethods.waitFor(1);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Click account menuha")
    public void click_account_menuha() {
        ReusableMethods.waitFor(2);
        us_22_page.staffAccountMenuha.click();
    }

    @When("Click sign In dropdownha")
    public void click_sign_in_dropdownha() {
       ReusableMethods.waitFor(2);
       us_22_page.staffSignInha.click();

    }
    @When("Enter registered staff usernameha")
    public void enter_registered_staff_usernameha() {
        ReusableMethods.waitFor(2);
        us_22_page.registeredStaffUserNameha.sendKeys(ConfigReader.getProperty("staffUsername"));
    }
    @When("Enter registered staff passwordha")
    public void enter_registered_staff_passwordha() {
       us_22_page.registeredStaffPasswordha.sendKeys(ConfigReader.getProperty("staffPassword"));
    }

    @When("Click Sign In submit buttonHA")
    public void click_sign_in_submit_button_ha() {
        ReusableMethods.waitFor(2);
        us_22_page.signInButtonha.click();
    }
    @When("Click my pages on menuha")
    public void click_my_pages_on_menuha() {
        ReusableMethods.waitFor(2);
        us_22_page.staffMyPagesMenuha.click();
    }
    @When("Click search patient dropdownha")
    public void click_search_patient_dropdownha() {
       ReusableMethods.waitFor(2);
       us_22_page.searchPatientDropDownha.click();
    }

    @And("Enter SSN numberha")
    public void enterSSNNumberha() {
        ReusableMethods.waitFor(2);
        us_22_page.ssnNumberBoxha.sendKeys("545-78-2471");
    }

    @When("Click show appointments buttonha")
    public void click_show_appointments_buttonha() {

        us_22_page.showAppointmentsButtonha.click();
    }
    @When("Click edit buttonha")
    public void click_edit_buttonha() {
       ReusableMethods.waitFor(2);
       JSUtils.clickElementByJS(us_22_page.editButtonha);
    }
    @When("Update start dateha")
    public void update_start_dateha() {
        ReusableMethods.waitFor(2);
        us_22_page.startDateBoxha.sendKeys("03/27/2023");
    }
    @When("Update end dateha")
    public void update_end_dateha() {
        ReusableMethods.waitFor(2);
        us_22_page.endDateBoxha.sendKeys("03/27/2023");
    }

   @And("Select appointment-physicianha")
    public void selectAppointmentPhysicianha() {
        Select select =new Select(us_22_page.physicianButtonha);
       select.selectByIndex(3);
    }
    @And("Click Save Buttonha")
    public void clickSaveButtonha() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us_22_page.saveButtonha);
    }


    @When("Verify updated appointment date massage alert is appeardha")
    public void verify_updated_appointment_date_massage_alert_is_appeardha() {
        ReusableMethods.waitFor(2);
        us_22_page.updatedMessageha.isDisplayed();
    }



    @Then("Close an applicationha")
    public void closeAnApplicationha() {
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }

    @And("click UNAPPROVED dropdownha")
    public void clickUNAPPROVEDDropdownha() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us_22_page.unaprovvedDropDownha);
    }

    @And("click PENDING dropdownha")
   public void clickPENDINGDropdownha() {
        ReusableMethods.waitFor(2);
       JSUtils.clickElementByJS(us_22_page.pendingDropDownha);
    }

    @And("click CANCELLED  dropdownha")
    public void clickCANCELLEDDropdownha() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us_22_page.cancelDropDownha);
    }



    @And("verify COMPLETED dropdown is not display to clickha")
    public void verifyCOMPLETEDDropdownIsNotDisplayToClickha() {
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(us_22_page.completedDropDownha);
    }

    @And("Click status buttonha")
    public void clickStatusButtonha() {
        ReusableMethods.waitFor(2);
        us_22_page.appointmentStatusha.click();
    }

    @And("Leave Anamnesis field emptyha")
    public void leaveAnamnesisFieldEmptyha() {
        ReusableMethods.waitFor(2);
        us_22_page.anamnesisButton.sendKeys("");
    }

    @And("Leave Treatment field emptyha")
    public void leaveTreatmentFieldEmptyha() {
        ReusableMethods.waitFor(2);
        us_22_page.treatmentButton.sendKeys("");
        
    }

    @And("Leave Diagnosis field emptyha")
    public void leaveDiagnosisFieldEmptyha() {
        ReusableMethods.waitFor(2);
        us_22_page.diagnosisButton.sendKeys("");
    }

    @And("verify selectable appointment-physicianha")
    public void verifySelectableAppointmentPhysicianha() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_22_page.physicianButtonha.isDisplayed());
    }


    @And("Click show test button")
    public void clickShowTestButton() {
        ReusableMethods.waitFor(2);
      JSUtils.clickElementByJS(us_22_page.showTestResultha);
    }

    @And("Click View Result buttonha")
    public void clickViewResultButtonha() {
        ReusableMethods.waitFor(2);
        us_22_page.viewResult.click();
    }


    @Then("Verify the patient test result is appear")
    public void verifyThePatientTestResultIsAppear() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_22_page.testResultPage.isDisplayed());
    }


}

