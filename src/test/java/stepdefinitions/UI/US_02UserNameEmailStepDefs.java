package stepdefinitions.UI;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_0102HomePage;
import pages.US_0102UserManagementPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.regex.Pattern;

import static stepdefinitions.UI.US_01RegisterStepDefs.userEmail;

public class US_02UserNameEmailStepDefs {

    String login;
    static String SSNNumber;

    US_0102UserManagementPage us_01UserManagementPage=new US_0102UserManagementPage();
    US_0102HomePage us_01HomePage=new US_0102HomePage();
    Faker faker=new Faker();


    @When("user enters the SsnNumber {string}")
    public void user_enters_the_ssn_number(String SSNNumber) {
        SSNNumber=faker.idNumber().ssnValid();
       us_01HomePage.ssnNumber.sendKeys(SSNNumber);
        System.out.println(SSNNumber);



    }
    @When("user enters the firstName {string}")
    public void user_enters_the_first_name(String FirstName) {
        us_01HomePage.firstName.sendKeys(faker.name().firstName());


    }
    @When("user enters the lastName {string}")
    public void user_enters_the_last_name(String lastName) {
        us_01HomePage.lastName.sendKeys(faker.name().lastName());


    }
    @When("user enters the userName {string}")
    public void user_enters_the_user_name(String login) {


        us_01HomePage.userName.sendKeys(faker.name().username());



    }
    @When("user enters the userEmail {string}")
    public void user_enters_the_user_email(String userEmail) {

        us_01HomePage.email.sendKeys(faker.internet().emailAddress());
    }
    @When("user enters the userNewPasword and confirm password {string}")

    public void user_enters_the_user_new_pasword(String userNewPassword) {
        String password = faker.internet().password();
        us_01HomePage.newPassword.sendKeys(password);
        us_01HomePage.newConfirmPassword.sendKeys(password);

    }

    @Then("verify that  username should have any chars")
    public void verify_that_username_should_have_any_chars() {
        String userName = us_01UserManagementPage.loginUserName.getText();
        Assert.assertTrue(userName.length()!=0);

    }
    @Then("verify that username cannot be blank")
    public void verify_that_username_cannot_be_blank() {

        Assert.assertFalse(us_01UserManagementPage.loginUserName.getText().isBlank());


    }


    @And("admin click the edit button")
    public void adminClickTheEditButton() {
        JSUtils.clickElementByJS(us_01UserManagementPage.editButton);

        JSUtils.clickElementByJS(us_01UserManagementPage.activationCheckbox);
        ReusableMethods.waitFor(3);
        WebElement dropdown= us_01UserManagementPage.selectOptions;
        ReusableMethods.waitFor(3);
        Select select = new Select(dropdown);
        select.selectByIndex(4);

        JSUtils.clickElementByJS(us_01UserManagementPage.editSaveButton);

    }



    @Then("verify that email has @ and .")
    public void verifyThatEmailHasAnd() {

        String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern=Pattern.compile(emailRegex);
        Assert.assertTrue(pattern.matcher( userEmail).matches());



    }


    @Then("verify that email is not blank")
    public void verifyThatEmailIsNotBlank() {

        Assert.assertFalse(userEmail.isBlank());

    }

    @Then("verify email length should be greater zero")
    public void verifyEmailLengthShouldBeGreaterZero() {

        Assert.assertTrue(userEmail .length()!=0);


    }


}
