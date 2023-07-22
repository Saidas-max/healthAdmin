package stepdefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_10DB {
    List<Object> getId =new ArrayList<>();
    @Given("user connects to the  database IU")
    public void user_connects_to_the_database_IU() {
        DBUtils.createConnection();
    }
    @Given("user gets the column {string} from table {string}IU")
    public void user_gets_the_column_from_table_patient_IU(String id,String patient) {
        String query = "SELECT " + id + "  FROM  " + patient;
        DBUtils.executeQuery(query);
    }
    @And("user reads all the  columnIds dataIU")
    public void userReadsAllTheColumnIdsDataIU() throws SQLException {
        while (DBUtils.getResultset().next()){
            getId.add(DBUtils.getResultset().getInt(1));   }
    }
    @Then("verify that {int} should be in patient listIU")
    public void verifyThatShouldBeInPatientListIU(int arg0) {
        System.out.println("idsList :"+getId);
        Assert.assertTrue(getId.contains(5972));
    }
    @Then("close the connectionIU")
    public void close_the_connection_IU() {
        DBUtils.closeConnection();
    }
}

