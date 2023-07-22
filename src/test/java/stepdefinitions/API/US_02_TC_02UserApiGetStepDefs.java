package stepdefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.AuthenticationMedunna.generateToken;

public class US_02_TC_02UserApiGetStepDefs {

    Response response;

   String url;
    @Given("user set the Medunna healty url")
    public void user_set_the_medunna_url() {

      spec.pathParams("first", "api", "second", "users");



    }
    @Given("sends a get-request to get all users registrants data")
    public void sends_a_get_request_to_get_all_users_registrant_data() {

        response = given().spec(spec).headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
                when().get("/{first}/{second}");
        response.prettyPrint();


    }

    @Then("HTTP Status Code is {int}")
    public void httpStatusCodeIs(int statuscode) {

        Assert.assertEquals(statuscode, response.statusCode());

    }

    @Then("Verify response content should be {string}")
    public void verifyResponseContentShouldBe(String contenttype) {

        Assert.assertEquals(contenttype, response.contentType());
        JsonPath jsonPath=response.jsonPath();

    }


    @Then("Verify expected username {string} unique")
    public void verifyExpectedUsernameUnique(String login) {
        JsonPath jsonPath=response.jsonPath();
        List<String> userNameList = jsonPath.getList("login");
        System.out.println(userNameList);
        int counter =0;

        for(String w:userNameList){
            if(w.contains(login)){
                counter++;
            }

        }


    }



}
