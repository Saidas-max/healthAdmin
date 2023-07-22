package stepdefinitions.DB;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

public class US_29_DBStepDefinition {
    @When("user sends the query to getYA {string} column from {string} table")
    public void user_sends_the_query_to_get_ya_column_from_table(String columnName, String tableName) {
     String query = "select "+columnName+" from "+tableName;
        DBUtils.executeQuery(query);
    }
    @Then("user verifyYA in {string} table {string} column contains {string}")
    public void user_verify_ya_in_table_column_contains(String table, String column, String data) {
        String query = "select * from "+table;
        List<Object> columnDataName = DBUtils.getColumnData(query,column);
        System.out.println("columnDataName = " + columnDataName);
        Assert.assertTrue(columnDataName.contains(data));

    }

//    @Then("user verify in {string} table {string} column containsYA {string}")
//    public void userVerifyInTableColumnContainsYA(String table, String column, String data) {
//        String query = "select * from "+table;
//        List<Object> columnData2 = DBUtils.getColumnData(query,column);
//        System.out.println("columnData2 = " + columnData2);
//        Assert.assertTrue(columnData2.contains(Integer.valueOf(data)));
//    }
}
