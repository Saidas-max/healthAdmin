package stepdefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_05_HomePage;
import pages.US_05_LoginPage;
import pages.US_21_UserManagementPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_21_UserManagementStepDefs {
    US_05_HomePage us_05_homePage = new US_05_HomePage();
    US_05_LoginPage us_05_loginPage = new US_05_LoginPage();

    US_21_UserManagementPage us_21_userManagementPage = new US_21_UserManagementPage();

    Faker faker = new Faker();
    @Given("Admin should navigate to {string} pageYA")
    public void admin_should_navigate_to_page_ya(String url) {
        Driver.getDriver().get(url);
    }
    @When("click on user icon optionYA")
    public void click_on_user_icon_option_ya() {
        ReusableMethods.waitFor(1);
       us_05_homePage.userIcon.click();
    }
    @When("click on sign in optionYA")
    public void click_on_sign_in_option_ya() {
        ReusableMethods.waitFor(1);
        us_05_homePage.signInOption.click();
    }
    @When("Enter Admin {string} into username inputYA")
    public void enter_admin_into_username_input_ya(String username) {
        ReusableMethods.waitFor(1);
        us_05_loginPage.userNameInput.sendKeys(username);
    }
    @When("Enter Admin {string} into password inputYA")
    public void enter_admin_into_password_input_ya(String password) {
        ReusableMethods.waitFor(1);
        us_05_loginPage.passwordInput.sendKeys(password);
    }
    @When("Click on Sign In submit buttonYA")
    public void click_on_sign_in_submit_button_ya() {
        ReusableMethods.waitFor(1);
        us_05_loginPage.signInSubmitButton.click();
    }
    @When("Click on Administration dropdown iconYA")
    public void click_on_administration_dropdown_icon_ya() {
        ReusableMethods.waitFor(1);
       us_05_homePage.administrationDropdown.click();
    }
    @When("Click on User management optionYA")
    public void click_on_user_management_option_ya() {
        ReusableMethods.waitFor(1);
     us_05_homePage.userManagementOption.click();
    }
    @When("Click on Login option to sort in desc orderYA")
    public void click_on_login_option_to_sort_in_desc_order_ya() {
        ReusableMethods.waitFor(1);
      us_21_userManagementPage.loginOption.click();
    }
    @When("Click on View option of registered userYA")
    public void click_on_view_option_of_registered_user_ya() {
        ReusableMethods.waitFor(1);
      us_21_userManagementPage.viewOption.click();
    }
//    @Then("Verify registered user info displayed on the pageYA")
//    public void verify_registered_user_info_displayed_on_the_page_ya() {
//        ReusableMethods.waitFor(2);
//        for(WebElement w:us_21_userManagementPage.userInfoList){
//            Assert.assertEquals(ConfigReader.getProperty("registeredFirstname"),us_21_userManagementPage.userInfoList.get(1).getText());
//            Assert.assertEquals(ConfigReader.getProperty("registeredLastname"),us_21_userManagementPage.userInfoList.get(2).getText());
//            Assert.assertEquals(ConfigReader.getProperty("registeredEmail"),us_21_userManagementPage.userInfoList.get(3).getText());
//        }
//    }

    @Then("Verify registered user info {string}, {string} and {string} displayed on the pageYA")
    public void verifyRegisteredUserInfoAndDisplayedOnThePageYA(String firstname, String lastname, String email) {
        ReusableMethods.waitFor(2);
        for(WebElement w:us_21_userManagementPage.userInfoList){
            Assert.assertEquals(firstname,us_21_userManagementPage.userInfoList.get(1).getText());
            Assert.assertEquals(lastname,us_21_userManagementPage.userInfoList.get(2).getText());
            Assert.assertEquals(email,us_21_userManagementPage.userInfoList.get(3).getText());
        }
    }

    @When("Click on Edit option of registered userYA")
    public void click_on_edit_option_of_registered_user_ya() {
        ReusableMethods.waitFor(2);
     us_21_userManagementPage.editOption.click();
    }
    @When("Click on Activated Checkbox if it is not selectedYA")
    public void click_on_activated_checkbox_if_it_is_not_selected_ya() {
        ReusableMethods.waitFor(1);
        if(!us_21_userManagementPage.activatedCheckBox.isSelected()){
            us_21_userManagementPage.activatedCheckBox.click();
        }
    }
    @When("Select {string} from Profiles dropdownYA")
    public void select_from_profiles_dropdown_ya(String role) {
       new Select(us_21_userManagementPage.rolesDropdown).selectByVisibleText(role);
    }
    @When("Click on Save buttonYA")
    public void click_on_save_button_ya() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us_21_userManagementPage.saveButton);
    }
    @Then("Verify user status is ActivatedYA")
    public void verify_user_status_is_activated_ya() {
      ReusableMethods.waitFor(2);
      Assert.assertTrue(us_21_userManagementPage.activatedText.isDisplayed());
    }
    @Then("Verify user profiles {string} is displayed on the pageYA")
    public void verify_user_profiles_is_displayed_on_the_page_ya(String roleText) {
      ReusableMethods.waitFor(2);
      for(WebElement w:us_21_userManagementPage.rolesTextList ){
          if(w.getText().equals(roleText)){
              Assert.assertTrue(w.getText().contains(roleText));
          }
      }

    }
    @When("Click on Create a new user buttonYA")
    public void click_on_create_a_new_user_button_ya() {
     us_21_userManagementPage.createNewUserButton.click();
    }
    @When("Enter user {string} into login fieldYA")
    public void enter_user_into_login_field_ya(String login) {
       us_21_userManagementPage.loginInput.sendKeys(login);
    }
    @When("Enter user {string} into email fieldYA")
    public void enter_user_into_email_field_ya(String email) {
        us_21_userManagementPage.emailInput.sendKeys(email);
    }
    @When("Enter user {string} into ssn fieldYA")
    public void enter_user_into_ssn_field_ya(String ssn) {
        us_21_userManagementPage.ssnInput.sendKeys(ssn);
    }
    @And("Click on ID option to sort in desc orderYA")
    public void clickOnIDOptionToSortInDescOrderYA() {
        ReusableMethods.waitFor(1);
        us_21_userManagementPage.idOption.click();
    }
    @Then("Click on delete buttonYA")
    public void click_on_delete_button_ya() {
       ReusableMethods.waitFor(2);
       us_21_userManagementPage.deleteButton.click();
    }
    @And("Click on confirm delete buttonYA")
    public void clickOnConfirmDeleteButtonYA() {
        ReusableMethods.waitFor(2);
        us_21_userManagementPage.confirmDeleteButton.click();
    }

    @Then("verify user deleted message displayed on the pageYA")
    public void verifyUserDeletedMessageDisplayedOnThePageYA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_21_userManagementPage.userDeletedMessage.isDisplayed());
    }
    @And("Click on Save submit buttonYA")
    public void clickOnSaveSubmitButtonYA() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_21_userManagementPage.saveSubmitButton);
    }

}
