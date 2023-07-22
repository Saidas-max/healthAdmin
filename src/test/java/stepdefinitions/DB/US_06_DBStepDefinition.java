package stepdefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_06_DBStepDefinition {
   List<Integer> idColumnList = new ArrayList<>();
    @Given("user connects to the databaseYA")
    public void user_connects_to_the_database_ya() {
      DBUtils.createConnection();
    }
    @When("user sends the query to get {string} column from {string} tableYA")
    public void user_sends_the_query_to_get_column_from_table_ya(String columnName, String tableName) {
       String query = "select "+columnName+" from public."+tableName;
       DBUtils.executeQuery(query);
    }
    @And("user get all column dataYA")
    public void userGetAllColumnDataYA() throws SQLException {
        while(DBUtils.getResultset().next()){
            idColumnList.add(DBUtils.getResultset().getInt(1));
        }
        System.out.println("idColumnList = " + idColumnList);
    }
    @Then("user verify the appointment with id {int} is existYA")
    public void userVerifyTheAppointmentWithIdIsExistYA(int id) {
        Assert.assertTrue(idColumnList.contains(id));
    }
    @Then("close the connectionYA")
    public void close_the_connection_ya() {
      //DBUtils.closeConnection();
    }
}
