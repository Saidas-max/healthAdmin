package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_05_HomePage;
import pages.US_05_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_05_StepDefinition {
    US_05_HomePage us_05_homePage = new US_05_HomePage();
    US_05_LoginPage us_05_loginPage=new US_05_LoginPage();
    @Given("user navigate to {string} pageYA")
    public void user_navigate_to_pageYA(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("user click on user icon optionYA")
    public void user_click_on_user_icon_optionYA() {
        ReusableMethods.waitFor(3);
        us_05_homePage.userIcon.click();
    }
    @When("user click on sign in optionYA")
    public void user_click_on_sign_in_optionYA() {
        us_05_homePage.signInOption.click();
    }
    @When("user enter valid usernameYA")
    public void user_enter_valid_usernameYA() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.userNameInput.sendKeys(ConfigReader.getProperty("patientUsername5"));
    }
    @When("user enter valid passwordYA")
    public void user_enter_valid_passwordYA() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.passwordInput.sendKeys(ConfigReader.getProperty("patientPassword5"));
    }
    @When("user click on remember me buttonYA")
    public void user_click_on_remember_me_buttonYA() {
        us_05_loginPage.rememberMeBox.click();
    }
    @When("user click on sign in submit buttonYA")
    public void user_click_on_sign_in_submit_buttonYA() {
        us_05_loginPage.signInSubmitButton.click();
    }
    @Then("verify user logged in with valid credentials and Welcome to medunna on the pageYA")
    public void verifyUserLoggedInWithValidCredentialsAndWelcomeToMedunnaOnThePageYA() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_05_homePage.welcomeText.isDisplayed());
    }

    @And("user enter invalid passwordYA")
    public void userEnterInvalidPasswordYA() {
        ReusableMethods.waitFor(1);
        us_05_loginPage.passwordInput.sendKeys(ConfigReader.getProperty("invalidPassword"));
    }

    @Then("verify failed to sign in message displayed on the pageYA")
    public void verifyFailedToSignInMessageDisplayedOnThePageYA() {
        Assert.assertTrue(us_05_loginPage.failedMessage.isDisplayed());
    }

    @Then("close the applicationYA")
    public void closeTheApplicationYA() {
        Driver.closeDriver();
    }
    @When("user enter invalid usernameYA")
    public void userEnterInvalidUsernameYA() {
        ReusableMethods.waitFor(1);
        us_05_loginPage.userNameInput.sendKeys(ConfigReader.getProperty("invalidUsername"));

    }
    @Then("verify remember me option is on the pageYA")
    public void verifyRememberMeOptionIsOnThePageYA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.rememberMeBox.isDisplayed());
    }
    @Then("verify remember me button is selectableYA")
    public void verifyRememberMeButtonIsSelectableYA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.rememberMeBox.isSelected());
    }

    @And("user click on sign out optionYA")
    public void userClickOnSignOutOptionYA() {
        ReusableMethods.waitFor(3);
        us_05_homePage.signOutOption.click();
    }

    @Then("verify thank you for choosing us message on the pageYA")
    public void verifyThankYouForChoosingUsMessageOnThePageYA() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us_05_homePage.thankYouMessage.isDisplayed());
    }
    @And("user click on Sign in Again buttonYA")
    public void userClickOnSignInAgainButtonYA() {
        ReusableMethods.waitFor(3);
        us_05_homePage.signInAgainButton.click();
    }
    @Then("verify valid credentials displayed on username and password box automaticallyYA")
    public void verifyValidCredentialsDisplayedOnUsernameAndPasswordBoxAutomaticallyYA() {
        ReusableMethods.waitFor(3);
        us_05_loginPage.userNameInput.click();
        ReusableMethods.waitFor(3);
        //Assert.assertEquals("HastaBerfin", ?);
        // Assert.assertEquals("merhaba-21",us_05_loginPage.passwordInput.getText());
    }

    @Then("verify Register a new account link option is on the pageYA")
    public void verifyRegisterANewAccountLinkOptionIsOnThePageYA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.registerLink.isDisplayed());
    }
    @And("user click on the Register a new account linkYA")
    public void userClickOnTheRegisterANewAccountLinkYA() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us_05_loginPage.registerLink);
    }

    @Then("verify user is taken to Registration pageYA")
    public void verifyUserIsTakenToRegistrationPageYA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_homePage.RegistrationText.isDisplayed());
    }

    @Then("verify there is cancel button on the login pageYA")
    public void verifyThereIsCancelButtonOnTheLoginPageYA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_loginPage.cancelButton.isDisplayed());
    }
    @And("user click on the cancel buttonYA")
    public void userClickOnTheCancelButtonYA() {
        ReusableMethods.waitFor(2);
        us_05_loginPage.cancelButton.click();
    }
    @Then("verify user is taken to home pageYA")
    public void verifyUserIsTakenToHomePageYA() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us_05_homePage.welcomeText.isDisplayed());
    }

}
