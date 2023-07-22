package stepdefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_0102UserManagementPage;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_02_TC_05JdbcDataStepDefs {
    List<String> emailList = new ArrayList<>();
    String useremail;
    US_0102UserManagementPage us_0102UserManagementPage=new US_0102UserManagementPage();
    @Given("user gets the column email {string} from table {string}")
    public void user_gets_the_column_email_from_table(String email, String jhi_user) {
        String query = "SELECT "+email+"  FROM  "+jhi_user;
        DBUtils.executeQuery(query);
    }
    @And("user reads all the  email data")
    public void userReadsAllTheEmailData() throws SQLException {
        while (DBUtils.getResultset().next()){
            emailList.add(DBUtils.getResultset().getString(1));   }
        System.out.print(emailList);
    }
    @When("get the user email from first row")
    public void get_the_user_email_ssn_from_first_row() {
        useremail = us_0102UserManagementPage.emailFromTable.getText();
        System.out.println(useremail);
    }
    @Then("verify  userEmail should be in jhi_user list")
    public void verifyUserEmailShouldBeInJhi_userList() {
        Assert.assertTrue(emailList.contains(useremail));
    }
}
