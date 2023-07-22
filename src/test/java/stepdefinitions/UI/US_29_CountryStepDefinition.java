package stepdefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_29_CountryPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_29_CountryStepDefinition {
    US_29_CountryPage us_29_countryPage = new US_29_CountryPage();
    Faker faker = new Faker();
    @When("Click on Items&Titles dropdown iconYA")
    public void click_on_items_titles_dropdown_icon_ya() {
        ReusableMethods.waitFor(1);
        us_29_countryPage.itemsTitlesDropdown.click();
    }
    @When("Click on Country optionYA")
    public void click_on_country_option_ya() {
        ReusableMethods.waitFor(1);
        us_29_countryPage.countryOption.click();
    }
    @When("Click on Create a new Country buttonYA")
    public void click_on_create_a_new_country_button_ya() {
        ReusableMethods.waitFor(1);
        us_29_countryPage.createNewCountryButton.click();
    }
    @When("Enter a Country name into Name fieldYA")
    public void enter_a_country_name_into_name_field_ya() {
        ReusableMethods.waitFor(1);
        us_29_countryPage.countryNameInput.sendKeys(faker.address().country());
    }
    @Then("Verify A new Country is created message displayed on the pageYA")
    public void verify_a_new_country_is_created_message_displayed_on_the_page_ya() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_29_countryPage.countryCreatedMessage.isDisplayed());
    }
//    @Then("Verify created country is on country pageYA")
//    public void verify_created_country_is_on_country_page_ya() {
//
//    }

    @When("Click on Delete button of the last created countryYA")
    public void click_on_delete_button_of_the_last_created_country_ya() {
        JSUtils.scrollIntoViewJS(us_29_countryPage.deleteButton);
        JSUtils.clickElementByJS(us_29_countryPage.deleteButton);

    }
    @Then("Verify country is deleted message displayed on the pageYA")
    public void verify_country_is_deleted_message_displayed_on_the_page_ya() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_29_countryPage.countryDeletedMessage.isDisplayed());
    }


}
