package features.featuresDB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Us_31_Api_DoctorValidate {
    List<String> firstNames = new ArrayList<>();
    int counter;

    @Given("admin connects to the databaseh")
    public void admin_connects_to_the_databaseh() {

        DBUtils.createConnection();
    }

    @When("admin gets {string} as a list from {string}")
    public void admin_gets_as_a_list_from(String first_name, String physician) {
        String query = "SELECT " + first_name + " FROM " + physician + " order by first_name ";
        //myList = DBUtils.getColumnData(query,ID);
        // String query = "SELECT id FROM physician";
        DBUtils.executeQuery(query);
    }

    @Then("admin validates all physicians")
    public void admin_validates_all_physicians() throws SQLException {
        while (DBUtils.getResultset().next()) {
            firstNames.add(DBUtils.getResultset().getString(1));
        }
        System.out.println(firstNames);
    }
    @Then("verify that {string} should be in list")
    public void verify_that_should_be_in_list(String string) {

        for(String w : firstNames){
            if(w.equals("Tom")){
                counter++;
            }
        }
        System.out.println(counter);
        //Assert.assertEquals(1,counter);
        Assert.assertTrue(firstNames.contains("Tom"));

    }

}










//    @Then("verify that  {String} should be in list")
//    public void verify_that_should_be_in_list(Integer String) {
//        for(String w : firstNames){
//            if(w==int1){
//                counter ++;
//            }
//        }
//        assertEquals(1,counter);
//    }
//}