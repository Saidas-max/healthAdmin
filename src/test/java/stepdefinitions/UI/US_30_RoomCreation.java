package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_30_MedunnaRoomPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_30_RoomCreation {
    US_30_MedunnaRoomPage us30MedunnaRoomPage = new US_30_MedunnaRoomPage();
    @Given("user is {string} pageha")
    public void user_is_pageha(String string) {
        ReusableMethods.waitFor(1);
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Click on user icon on menuha")
    public void click_on_user_icon_on_menuha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.userIconha.click();
    }
    @When("Click on Sign In optionha")
    public void click_on_sign_in_optionha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.signInOptionha.click();
    }
    @When("Enter registered  admin usernameha")
    public void enter_registered_admin_usernameha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.adminNameInputha.sendKeys("AdminTeam03");
    }
    @When("Enter registered  admin passwordha")
    public void enter_registered_admin_passwordha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.adminPasswordInputha.sendKeys("Team03+");
    }
    @When("Click on Sign In submit buttonha")
    public void click_on_sign_in_submit_buttonha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.signInSubmitButtonha.click();
    }
    @When("Click Ittem&Titles Menuha")
    public void click_ittem_titles_menuha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.itemTitleDropDownha.click();
    }
    @When("Click room dropdown optionha")
    public void click_room_dropdown_optionha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.roomDropDownha.click();
    }
    @When("Click Creat a new Room Buttonha")
    public void click_creat_a_new_room_buttonha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.createANewRoomButtonha.click();
    }
    @When("Enter a room numberha")
    public void enter_a_room_numberha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.roomNumberInputha.sendKeys("2555831");
    }
    @When("Choose Room Typeha")
    public void choose_room_typeha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.roomTypeDropdownha.sendKeys("SUITE");
    }
    @When("Click Status Checkboxha")
    public void click_status_checkboxha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.statusCheckboxha.click();
    }
    @When("Enter room priceha")
    public void enter_room_priceha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.priceInputha.sendKeys("250");
    }
    @When("Enter Descriptionha")
    public void enter_descriptionha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.descriptionInputha.sendKeys("Need extra blanket");
    }
    @When("Choose created dateha")
    public void choose_created_dateha() {
        ReusableMethods.waitFor(2);
        us30MedunnaRoomPage.createdDateha.sendKeys("05/09/2023");
    }
    @Then("Click save buttonha")
    public void click_save_buttonha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.saveButtonha.click();
    }

    @Then("Verify created roomha" )
    public void verifyCreatedRoomha() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us30MedunnaRoomPage.roomCreatedMessage.isDisplayed());
    }

    @And("Click Edit buttonha")
    public void clickEditButtonha() {
        ReusableMethods.waitFor(2);
        us30MedunnaRoomPage.showRoomha.click();
    }



    @And("Change description buttonha")
    public void changeDescriptionButtonha() {
        ReusableMethods.waitFor(2);
        us30MedunnaRoomPage.descriptionInputha.sendKeys("Need extra towel");
    }

    @Then("click again savebuttonha")
    public void clickAgainSavebuttonha() {
        ReusableMethods.waitFor(2);
        us30MedunnaRoomPage.saveButtonha.click();
    }

    @Then("verify updated messageha")
    public void verifyUpdatedMessageha() {
        ReusableMethods.waitFor(2);
       Assert.assertTrue(us30MedunnaRoomPage.roomUpdatedMessage.isDisplayed());

    }



//    @Then("Click first room numberha")
//    public void clickFirstRoomNumberha(String roomNumber) {
//        ReusableMethods.waitFor(3);
//        ReusableMethods.waitForVisibility(us30MedunnaRoomPage.firstRoomNumberha,10);
//        assertEquals(roomNumber,us30MedunnaRoomPage.firstRoomNumberha.getText());
//
//    }

    @Then("Clear pricebuttonha")
    public void clearPricebuttonha() {
        ReusableMethods.waitFor(1);
        us30MedunnaRoomPage.priceInputha.clear();
    }

    @Then("enter new roomPriceha")
    public void enterNewRoomPriceha() {
        ReusableMethods.waitFor(2);
        us30MedunnaRoomPage.priceInputha.sendKeys("200");
    }

    @Then("Clear descriptionbuttonha")
    public void clearDescriptionbuttonha() {
        ReusableMethods.waitFor(3);
        us30MedunnaRoomPage.descriptionInputha.clear();
    }


        @When("Click delete buttonha")
        public void click_delete_buttonha() {
            ReusableMethods.waitFor(2);
            us30MedunnaRoomPage.deleteButtonha.click();
        }

    @Then("click delete pop up messageha")
    public void clickDeletePopUpMessageha() {
        ReusableMethods.waitFor(2);
        us30MedunnaRoomPage.deletePopUpha.click();
    }

    @Then("verify appear deleted room alert messageha")
    public void verifyAppearDeletedRoomAlertMessageha() {
        ReusableMethods.waitFor(2);
        ReusableMethods.verifyElementDisplayed(us30MedunnaRoomPage.roomDeletedAlertMessage);
    }

    @And("Click view  result buttonha")
    public void clickViewResultButtonha() {
        ReusableMethods.waitFor(2);
        us30MedunnaRoomPage.viewButtonha.click();
    }

    @Then("Verify created room infoha")
    public void verifyCreatedRoomInfoha() {
        ReusableMethods.waitFor(2);
       Assert.assertTrue(us30MedunnaRoomPage.createdRoomInfoha.isDisplayed());
    }
}

