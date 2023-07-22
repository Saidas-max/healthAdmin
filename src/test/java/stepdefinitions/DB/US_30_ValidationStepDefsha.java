package stepdefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_30_ValidationStepDefsha {

    List<Object> columnList;
    @Given("user connects to databaseha")
    public void user_connects_to_databaseha() {
        DBUtils.createConnection();
    }
    @When("get all {string} as a list fromha {string}")
    public void get_all_as_a_list_fromha(String columnName, String tableName) {
        String query = "SELECT * FROM " + tableName;
        columnList = DBUtils.getColumnData(query, columnName);
        System.out.println("columnList = " + columnList);
    }
    @Then("verify list containsha {string}")
    public void verify_list_containsha(String roomNumber) {
        assertTrue(columnList.contains(Integer.valueOf(roomNumber)));
    }

    @And("close the connectionha")
    public void closeTheConnectionha() {
        DBUtils.closeConnection();
    }
}
