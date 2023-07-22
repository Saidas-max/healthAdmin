package stepdefinitions.UI;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_18_20Page;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_20_stepdefs {

    US_18_20Page us_18_20Page =new US_18_20Page();

    @When("click on staff item20us")
    public void click_on_staff_item20us() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_18_20Page.staffFromDropdown);
        ReusableMethods.waitFor(1);

    }
    @When("click on create a new staff button20us")
    public void click_on_create_a_new_staff_button20us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.createNewStaffButton.click();
        ReusableMethods.waitFor(1);

    }
    @When("click on use search box20us")
    public void click_on_use_search_box20us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.useSearchBox.click();
        ReusableMethods.waitFor(1);

    }
    @When("enter registered staff ssn number20us")
    public void enter_registered_staff_ssn_number20us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.ssnSearchField.sendKeys("432-47-2390");
        ReusableMethods.waitFor(1);

    }
    @When("click on search user button20us")
    public void click_on_search_user_button20us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.searchStaffUserButton.click();
        ReusableMethods.waitFor(1);

    }
    @Then("verify admin sees user found success pop up message20us")
    public void verify_admin_sees_user_found_success_pop_up_message20us() {
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(us_18_20Page.searchStaffSuccessBox);
        ReusableMethods.waitFor(1);
    }

    @When("populate their information20us")
    public void populate_their_information20us() {

        Select select=new Select(us_18_20Page.populateStaffGender);
        Select select1=new Select(us_18_20Page.populateStaffBlood);
        Select select2=new Select(us_18_20Page.populateStaffCountry);
        Select select3=new Select(us_18_20Page.populateStaffCState);

        us_18_20Page.populateStaffName.sendKeys("hakan");
        us_18_20Page.populateStaffLastName.sendKeys("cetin");
        us_18_20Page.populateStaffBirthday.sendKeys("2023-03-07T00:00");
        us_18_20Page.populateStaffPhone.sendKeys("111-111-1111");
        select.selectByVisibleText("MALE");
        select1.selectByVisibleText("A+");
        us_18_20Page.populateStaffAddress.sendKeys("saint charles,usa");
        us_18_20Page.populateStaffDescription.sendKeys("master degree");
        us_18_20Page.populateStaffCreatedDate.sendKeys("2023-09-07T00:00");
        us_18_20Page.populateStaffUser.sendKeys("hakanadmin");
        select2.selectByVisibleText("USA");
        select3.selectByVisibleText("OHIO");


    }
    @When("click on save button20us")
    public void click_on_save_button20us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.testItemSaveButton.click();

    }
    @Then("verify admin sees success pop up message20us")
    public void verify_admin_sees_success_pop_up_message20us() {
        ReusableMethods.waitFor(1);


    }

    @And("click on staff's id which is us{string}FC")
    public void clickOnStaffSIdWhichIsUsFC(String arg0) {
        us_18_20Page.sortID.click();
        ReusableMethods.waitFor(1);
        us_18_20Page.staffID4362.click();
    }

    @Then("verify admin can select staff from staff listFC")
    public void verifyAdminCanSelectStaffFromStaffListFC() {
        ReusableMethods.waitFor(1);

        Assert.assertEquals("4362",us_18_20Page.confirmStaffId4362.getText());
    }

    @Then("verify admin can edit staff info")
    public void verifyAdminCanEditStaffInfo() {
        ReusableMethods.waitFor(1);
        us_18_20Page.sortID.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us_18_20Page.staffEditButton.isEnabled());
    }

    @Then("verify admin can delete staff info")
    public void verifyAdminCanDeleteStaffInfo() {
        ReusableMethods.waitFor(1);
        us_18_20Page.sortID.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(us_18_20Page.staffDeleteButton.isEnabled());


    }
}





