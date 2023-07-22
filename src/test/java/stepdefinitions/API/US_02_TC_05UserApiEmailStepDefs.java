package stepdefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.regex.Pattern;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_02_TC_05UserApiEmailStepDefs {
     Response response;
    JsonPath jsonPath;

    String  url;
    String emailUser;
    @Given("user sets the url {string}")
    public void userSetsTheUrl(String URL) {

        url=URL;
    }

    @And("sends a get request to get all registrant data")
    public void sendsAGetRequestToGetAllRegistrantData() {
        response = given().headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
                when().get(url);
        response.prettyPrint();


    }

    @Given("get the email from response")
    public void get_the_email_from_response() {
        jsonPath= response.jsonPath();
        emailUser = jsonPath.getString("email");

    }

    @Then("HTTP StatusCode should be {int}")
    public void http_status_code_should_be(int statuss) {
        Assert.assertEquals(statuss, response.statusCode());
    }
    @Then("Verify Response ContentType is {string}")
    public void verify_response_content_type_is(String contenttype) {
        assertEquals(contenttype,   response.contentType());

    }
          @Then("verify that responseemail has @ and .")
             public void verifyThatResponseemailHasAnd() {
              String emailRegex="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
              Pattern pattern=Pattern.compile(emailRegex);
              Assert.assertTrue(pattern.matcher( emailUser).matches());
          }


    @Then("verify that responseemail is not blank")
    public void verify_that_responseemail_is_not_blank() {
        Assert.assertFalse(emailUser.isBlank());

    }
    @Then("verify responseemail length should be greater zero")
    public void verify_responseemail_length_should_be_greater_zero() {

        Assert.assertTrue(emailUser.length()!=0);


    }























/*
JsonPath jsonPath = response.jsonPath();

        //Hard Assertion
        assertEquals("Josh", jsonPath.getString("firstname"));
        assertEquals("Allen", jsonPath.getString("lastname"));
        assertEquals(111, jsonPath.getInt("totalprice"));
 */

}
