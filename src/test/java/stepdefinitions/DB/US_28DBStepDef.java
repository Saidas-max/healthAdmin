package stepdefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_28DBStepDef {

    List<Object> getId =new ArrayList<>();

    @Given("user connectUI to the  database")
    public void user_connect_ui_to_the_database() {
        DBUtils.createConnection();

    }
    @Given("user getUI the column {string} from table {string}")
    public void user_get_ui_the_column_from_table(String id, String cmessage) {
        String query = "SELECT " + id + "  FROM  " + cmessage;
        DBUtils.executeQuery(query);

    }
    @Given("user readUI all the  columnIds database")
    public void user_read_ui_all_the_column_ids_database() throws SQLException {
        while (DBUtils.getResultset().next()){
            getId.add(DBUtils.getResultset().getInt(1));   }

    }
    @Then("verify that {int} should be in cmessage id listUI")
    public void verify_that_should_be_in_cmessage_id_list_ui(Integer int1) {
        System.out.println("idsList :"+getId);
        Assert.assertTrue(getId.contains(23114));

    }
    @Then("close data base connectionUI")
    public void close_data_base_connection_ui() {
        DBUtils.closeConnection();

    }
}
