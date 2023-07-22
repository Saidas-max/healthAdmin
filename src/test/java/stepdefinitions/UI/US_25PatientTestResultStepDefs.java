package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.US_25PatientHomePage;
import utilities.JSUtils;

import java.util.ArrayList;
import java.util.List;

public class US_25PatientTestResultStepDefs {
   US_25PatientHomePage us_25PatientHomePage=new US_25PatientHomePage();

    @And("patient click on MY PAGES on menu")
    public void patientClickOnMYPAGESOnMenu() {

        us_25PatientHomePage.myPages.click();
    }
    @When("patient click on My Appointments opotions")
    public void patient_click_on_my_appointments_opotions() {

        us_25PatientHomePage.myAppointments.click();
    }
    @When("patient click to show Tests button to see test results")
    public void patient_click_to_show_tests_button_to_see_test_results() {
         us_25PatientHomePage.showTestsButton.click();
    }
    @When("patient click on view Results button")
    public void patient_click_on_view_results_button() {
        us_25PatientHomePage.viewResultsButton.click();
    }
    @Then("verify that Test Results table name is seen")
    public void verify_that_test_results_table_name_is_seen() {
        Assert.assertTrue(us_25PatientHomePage.testResultTableName.isDisplayed());
    }
    @Then("verify that sees id, name, default min and max value, test date and description are on table")
    public void verify_that_sees_id_name_default_min_and_max_value_test_date_and_description_are_on_table() {
        List<WebElement> tableColumnHeads=new ArrayList<>();
        for(WebElement w:tableColumnHeads){
           Assert.assertTrue(w.isDisplayed());
            w.sendKeys(Keys.ENTER);
        }
    }


    @And("Patient click the Show Invoce button")
    public void patientClickTheShowInwoceButton() {
        JSUtils.clickElementByJS(us_25PatientHomePage.showInvoce);

    }

    @Then("Verify that  name , SSNNumber , totalCost on invoice")
    public void verifyThatNameSSNNumberTotalCostOnInvoice() {


        Assert.assertEquals("545-78-2471", us_25PatientHomePage.rowSSN.getText());
        Assert.assertEquals("Bilge Bella Pery", us_25PatientHomePage.rowName.getText());
        Assert.assertEquals("700$" , us_25PatientHomePage.rowTotalCost.getText());

    }
}
