package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_03MedunnaHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US_03StepDefinitions {

 US_03MedunnaHomePage us_03MedunnaHomePage = new US_03MedunnaHomePage();

    @Given("user goes to medunna url3")
    public void user_goes_to_medunna_url() {

        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("clicks on account icon3")
    public void clicks_on_account_icon() {

        us_03MedunnaHomePage.accountIcon.click();
    }
    @When("clicks on register button3")
    public void clicks_on_register_button() {
      us_03MedunnaHomePage.registerLink.click();
    }

    @And("verify the url is medunnaRegistrationUrl")
    public void verifyTheUrlIsMedunnaRegistrationUrl() {
       String expectedUrl = "https://www.medunna.com/account/register";
       String actualUrl = Driver.getDriver().getCurrentUrl();
       Assert.assertEquals(expectedUrl,actualUrl);
    }

    @When("click on new password input")
    public void click_on_new_password_input() {
        JSUtils.clickElementByJS(us_03MedunnaHomePage.firstPassword);
    }

    @When("send {int} or more digit pwd without uppercase letter")
    public void send_or_more_digit_pwd_without_uppercase_letter(Integer int1) {
      us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithoutUppercase"));
    }

    @Then("verify the pwd strength is {int} bars")
    public void verify_the_pwd_strength_is_bars(Integer barNumber) {
        if (barNumber==4){
            Assert.assertEquals(barNumber,(Integer)(us_03MedunnaHomePage.bar4.size()));
        }else if (barNumber==5){
            Assert.assertEquals(barNumber,(Integer)(us_03MedunnaHomePage.bar5.size()));
        }
    }
    @And("close the applicationfu")
   public void closeTheApplicationfu() {
        Driver.closeDriver();
        ReusableMethods.waitFor(3);
   }
   @And("send {int} or more digit pwd with {int} uppercase letter")
    public void sendOrMoreDigitPwdWithUppercaseLetter(int arg0, int arg1) {
        us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithUppercase"));
    }

    @And("send {int} or more digit pwd without lowercase letter")
    public void sendOrMoreDigitPwdWithoutLowercaseLetter(int arg0) {
        us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithoutLowercase"));
    }
    @And("send {int} or more digit pwd with {int} lowercase letter")
    public void sendOrMoreDigitPwdWithLowercaseLetter(int arg0, int arg1) {
        us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithLowercase"));
    }

    @And("send {int} or more digit pwd without digit")
    public void sendOrMoreDigitPwdWithoutDigit(int arg0) {
        us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithoutDigit"));
    }

    @And("send {int} or more digit pwd with {int} digit")
    public void sendOrMoreDigitPwdWithDigit(int arg0, int arg1) {
        us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithDigit"));
    }

    @And("send {int} or more digit pwd without special character")
    public void sendOrMoreDigitPwdWithoutSpecialCharacter(int arg0) {
        us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithoutSpecialChar"));
    }

    @And("send {int} or more digit pwd with {int} special character")
    public void sendOrMoreDigitPwdWithSpecialCharacter(int arg0, int arg1) {
        us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("pwdWithSpecialChar"));
    }

    @And("send {int} digit pwd")
    public void sendDigitPwd(int digit) {
        switch (digit){
            case 3:
                us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("3DigitPwd"));
                break;
            case 4:
                us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("4DigitPwd"));
                break;
        }
    }
    @Then("verify error message")
    public void verifyErrorMessage() {

        String invalidPwdText2 = us_03MedunnaHomePage.invalidFeedback.getText();
        System.out.println(invalidPwdText2);
        Assert.assertTrue(invalidPwdText2.contains("Your password is required to be at least 4 characters."));
    }

    @Then("verify valid pwd message")
    public void verifyValidPwdMessage() {
       Assert.assertTrue(us_03MedunnaHomePage.validPassword.isDisplayed());
    }

    @And("send {int} digit pwd including letters, char and digit")
    public void sendDigitPwdIncludingLettersCharAndDigit(int digit) {
        if (digit == 6) {
            us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("6DigitPwd"));
        }else if (digit==7){
            us_03MedunnaHomePage.firstPassword.sendKeys(ConfigReader.getProperty("7DigitPwd"));
        }
    }
    @Then("verify the password is weak")
    public void verifyThePasswordIsWeak() {
        Assert.assertTrue(us_03MedunnaHomePage.weakPassword.isDisplayed());
    }

    @And("click on new password confirmation input")
    public void clickOnNewPasswordConfirmationInput() {
        JSUtils.clickElementByJS(us_03MedunnaHomePage.secondPassword);
        ReusableMethods.waitFor(2);
        us_03MedunnaHomePage.secondPassword.sendKeys("Jo1");
        ReusableMethods.waitFor(2);
    }

    @Then("verify Password strength: text is displayed")
    public void verifyPasswordStrengthTextIsDisplayed() {
        Assert.assertTrue(us_03MedunnaHomePage.passwordStrengthText.isDisplayed());
    }
}
