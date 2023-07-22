package stepdefinitions.DB;

import io.cucumber.java.en.*;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_18_DB_StedDefs {

    List<Integer> idColumnList = new ArrayList<>();
    @Given("user   Given user connects to the databaseFC")
    public void user_given_user_connects_to_the_database_fc() {

        DBUtils.createConnection();

    }



    @When("user sends the query to get the id of {string} column from {string} tableFC")
    public void userSendsTheQueryToGetTheIdOfColumnFromTableFC(String columnName, String tableName) {
        String query = "select "+columnName+" from public."+tableName;
        DBUtils.executeQuery(query);
        System.out.println(query);



    }

    @And("user get all column dataFC")
    public void userGetAllColumnDataFC() throws SQLException {
        while(DBUtils.getResultset().next()){
            idColumnList.add(DBUtils.getResultset().getInt(1));

        }
        System.out.println("idColumnList = " + idColumnList);


    }

    @Then("assert that there is  a test_item id  {int}")
    public void assertThatThereIsATest_itemId(int arg0) {

        assertTrue(idColumnList.contains(13244));
    }

    @And("close the connection")
    public void closeTheConnection() {
        DBUtils.closeConnection();
    }
}
