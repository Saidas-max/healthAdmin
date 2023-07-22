package stepdefinitions.DB;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_08_DB_ValidationAppointmentStepDefs {
    List<Object> getId =new ArrayList<>();
    @Given("user connects to the  database HA")
    public void userConnectsToTheDatabaseHA() {
        DBUtils.createConnection();
    }
    @And("user gets the column {string} from table {string}HA")
    public void userGetsTheColumnFromTableHA(String id, String appointment) {
        String query = "SELECT " + id + "  FROM  " + appointment;
        DBUtils.executeQuery(query);
    }
    @Then("user reads all the  columnIds data")
    public void userReadsAllTheColumnData() throws SQLException {
        while (DBUtils.getResultset().next()){
            getId.add(DBUtils.getResultset().getInt(1));   }
    }
    @Then("verify that {int} should be in appointment list")
    public void verifyThatShouldBeInAppointmentList(int arg0) {
        System.out.println("idsList :"+getId);
        Assert.assertTrue(getId.contains(10586));
    }
    @And("close the connectionHA")
    public void closeTheConnectionHA() {
        DBUtils.closeConnection();
    }
}