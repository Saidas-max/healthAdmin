package stepdefinitions.UI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.US_28UIpage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_28UIStepDef {


    US_28UIpage page = new US_28UIpage();

    @Given("admin clickiu the logIn dropdown")
    public void admin_clickiu_the_log_in_dropdown() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
        Thread.sleep(3000);
        page.logIndropdown.click();
    }
    @Given("admin clickiu on the signIn button")
    public void admin_clickiu_on_the_sign_in_button() throws InterruptedException {
        Thread.sleep(3000);
        page.signInbutton.click();
    }
    @Given("admin provideiu the userName {string}")
    public void admin_provideiu_the_user_name(String string) throws InterruptedException {
        Thread.sleep(3000);
     page.userName.sendKeys("AdminTeam03");
    }
    @Given("admin provideiu the passWord {string}")
    public void admin_provideiu_the_pass_word(String string) throws InterruptedException {
        Thread.sleep(3000);
        page.password.sendKeys("Team03+");
    }
    @Given("admin clickui on the SignIn button")
    public void admin_clickui_on_the_sign_in_button() throws InterruptedException {
        Thread.sleep(3000);
        page.SignInbutton.click();
    }
    @Given("admin clickiu on the Items&Titles")
    public void admin_clickiu_on_the_items_titles() throws InterruptedException {
        Thread.sleep(3000);
        page.ItemsTitles.click();
    }
    @Given("admin clickiu on the Messages")
    public void admin_clickiu_on_the_mesages() throws InterruptedException {
        Thread.sleep(3000);
        page.Messages.click();
    }
    @Given("admin clickiu on the Create a new Message")
    public void admin_clickiu_on_the_create_a_new_message() throws InterruptedException {
        Thread.sleep(3000);
        page.CreateanewMessage.click();
    }
    @Given("admin can add Name")
    public void admin_can_add_name() throws InterruptedException {
        Thread.sleep(3000);
        page.Name.sendKeys("Xelil");
    }
    @Given("admin can add Email")
    public void admin_can_add_email() throws InterruptedException {
        Thread.sleep(3000);
        page.Email.sendKeys("halilisak@gmail.com");
    }
    @Given("admin can add Subject")
    public void admin_can_add_subject() throws InterruptedException {
        Thread.sleep(3000);
        page.Subject.sendKeys("Hello World");
    }
    @Given("admin can add Message")
    public void admin_can_add_message() throws InterruptedException {
        Thread.sleep(3000);
        page.Message.sendKeys("Hi World");
    }
    @Given("admin can save")
    public void admin_can_save() throws InterruptedException {
        Thread.sleep(3000);
        page.save.click();
    }
    @And("admin can view")
    public void adminCanView() throws InterruptedException {
        Thread.sleep(5000);
        page.View.click();
    }
    @Given("admin can edit the message")
    public void admin_can_edit_the_message() throws InterruptedException {
        Thread.sleep(5000);
        page.edit.click();
    }
    @And("admin can clickiu saveiu")
    public void adminCanClickiuSave() throws InterruptedException {
        Thread.sleep(5000);
        page.saveiu.click();
    }


}
