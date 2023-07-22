package stepdefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_0102UserManagementPage;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_01_TC_07JdbcDataStepDefs {
    List<String> ssnList = new ArrayList<>();
    US_0102UserManagementPage us_0102UserManagementPage=new US_0102UserManagementPage();
   String SSN;
    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {
        DBUtils.createConnection();
    }
    @And("user gets the column {string} from table {string}")
    public void userGetsTheColumnFromTable(String ssn, String jhi_user) {

            String query = "SELECT "+ssn+"  FROM  "+jhi_user;
            DBUtils.executeQuery(query);
    }
    @Then("user reads all the  column data")
    public void userReadsAllTheColumnData() throws SQLException {
        while (DBUtils.getResultset().next()){
            ssnList.add(DBUtils.getResultset().getString(1));   }
    }
    @And("get the ssn number from first row")
    public void getTheIdFromFirstRow() {
    SSN= us_0102UserManagementPage.ssnFromTable.getText();
    }
        @Then("verify  ssnNumber should be in jhi_user list")
       public void verifyIdNumberShouldBeInJhi_userList() {
        System.out.println("idsList :"+ssnList);
        Assert.assertTrue(ssnList.contains(SSN));
    }
}



