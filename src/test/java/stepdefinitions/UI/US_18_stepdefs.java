package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_18_20Page;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_18_stepdefs {

    US_18_20Page us_18_20Page =new US_18_20Page();
    @When("click on items titles button18us")
    public void click_on_items_titles_button18us() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_18_20Page.items_titles);



    }
    @When("click on test item18us")
    public void click_on_test_item18us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.testitemfromdropdown.click();
    }
    @When("click on create a new test item18us")
    public void click_on_create_a_new_test_item18us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.createAnewTestItem.click();
    }
    @When("enter the name18us")
    public void enter_the_name18us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.testItemName.sendKeys("us18test1");
    }
    @When("enter the price18us")
    public void enter_the_price18us() {
        ReusableMethods.waitFor(1);
        us_18_20Page.testItemPrice.sendKeys("999");
    }
    @When("click on save button18us")
    public void click_on_save_button18us() {
        ReusableMethods.waitFor(1);
        JSUtils.clickElementByJS(us_18_20Page.testItemSaveButton);
    }
    @Then("verify user see success popup message18us")
    public void verify_user_see_success_popup_message18us() {
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(us_18_20Page.createdTestItemSuccessMessage);
    }



    @Then("verify test itemsUsonsekiz")
    public void verifyTestItemsUsonsekiz() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue( us_18_20Page.ItemName.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue( us_18_20Page.ItemsDescription.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue( us_18_20Page.ItemPrice.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue( us_18_20Page.ItemDefaultMinValue.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue( us_18_20Page.ItemDefaultMaxValue.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue( us_18_20Page.ItemCreatedDate.isDisplayed());
        ReusableMethods.waitFor(1);

    }



    @Then("verify admin can delete test itemsUsonsekiz")
    public void verifyAdminCanDeleteTestItemsUsonsekiz() {
        ReusableMethods.waitFor(1);
        us_18_20Page.testItemDeleteButton.click();
        ReusableMethods.waitFor(1);
        us_18_20Page.popupDeleteButton.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(us_18_20Page.deleteSuccessMessage);
        ReusableMethods.waitFor(1);




    }

    @And("click on IDFC;")
    public void clickOnIDFC() {
        ReusableMethods.waitFor(1);
        us_18_20Page.sortID.click();
    }


    @Then("verify admin sees test items")
    public void verifyAdminSeesTestItems() {
        ReusableMethods.waitFor(1);
        ReusableMethods.verifyElementDisplayed(us_18_20Page.testItemsWord);


    }


}
