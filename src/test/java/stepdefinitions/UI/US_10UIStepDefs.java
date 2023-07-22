package stepdefinitions.UI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.US_10UIpage;

public class US_10UIStepDefs {

    US_10UIpage page = new US_10UIpage();

    @And("user clicks MY PAGEUI")
    public void userClicksMYPAGEUI() throws InterruptedException {
        page.MyPage.click();
        Thread.sleep(3000);
    }
    @And("user clicks SearchPatientUI button")
    public void userClicksSearchPatientUIButton() throws InterruptedException {
        page.SearchPatient.click();
        Thread.sleep(3000);
    }
    @And("user provides patient in SSNUI box {string}")
    public void userProvidesPatientInSSNUIBox(String arg0) throws InterruptedException {
        page.patientSSNBox.sendKeys("113-13-6789");
        Thread.sleep(3000);
    }
    @Then("user clicks edit button")
    public void userClicksEditButton() throws InterruptedException {
        page.editButton.click();
        Thread.sleep(3000);
    }
    @Then("user edits {string}")
    public void userEdits(String string) throws InterruptedException {
        page.firstNameBox.clear();
        page.firstNameBox.sendKeys("Tabir");
        Thread.sleep(3000);
    }
    @Then("user editss {string}")
    public void userEditss(String string) throws InterruptedException {
        page.lastNameBox.sendKeys("Adil");
        Thread.sleep(3000);
    }
    @Then("user edit birthDateBox")
    public void userEditBirthDateBox() throws InterruptedException {
        page.birthDateBox.clear();
        Thread.sleep(3000);
    }
    @Then("user edit {string}")
    public void userEdit(String string) throws InterruptedException {
        page.eMailBox.clear();
        Thread.sleep(3000);
        page.eMailBox.sendKeys("Mabiradil@gmail.com");
        Thread.sleep(3000);
    }
    @Then("user  edit phoneNumberBox")
    public void userEditPhoneNumberBox() throws InterruptedException {
        page.phoneNumberBox.clear();
        page.phoneNumberBox.sendKeys("913-515-5151");
        Thread.sleep(3000);
    }
    @Then("user edit genderDropDown")
    public void userEditGenderDropDown() throws InterruptedException {
        page.genderDropDown.sendKeys("FEMALE");
        Thread.sleep(3000);
    }
    @Then("user edit bloodGroupDropDown")
    public void userEditBloodGroupDropDown() throws InterruptedException {
        page.bloodGroupDropDown.sendKeys("B+");
        Thread.sleep(3000);
    }
    @Then("user edit addressBox")
    public void userEditAddressBox() throws InterruptedException {
        page.addressBox.sendKeys("3307 Fairfax");
        Thread.sleep(3000);
    }
    @Then("user edit descriptionBox")
    public void userEditDescriptionBox() throws InterruptedException {
        page.descriptionBox.sendKeys("headache");
        Thread.sleep(3000);
    }
    @Then("user edit userPatientDropDown")
    public void userEditUserPatientDropDown() throws InterruptedException {
        page.userPatientDropDown.sendKeys("doctormurat");
        Thread.sleep(3000);
    }
    @Then("user edit countryDropDown")
    public void userEditCountryDropDown() throws InterruptedException {
        page.countryDropDown.sendKeys("Hello");
        Thread.sleep(3000);
    }
    @Then("user edit stateDropDown")
    public void userEditStateDropDown() throws InterruptedException {
        page.stateDropDown.sendKeys("VA/Fairfax");
        Thread.sleep(3000);
    }
    @Then("user  edit saveButton")
    public void userEditSaveButton() throws InterruptedException {
        page.saveButton.click();
        Thread.sleep(3000);
    }



}
