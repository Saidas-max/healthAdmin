package stepdefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_28APIpojo;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_28ApiGetStepDefs {


    Response response;
    US_28APIpojo expectedData;
    //https://medunna.com/api/c-messages/16628
    @Given("user set the urlmedunna to get requestUI")
    public void user_set_the_urlmedunna_to_get_request() {
        spec.pathParams("first","api","second","c-messages","third",16628);
    }
    @Given("get a get-request to validate messagesUI")
    public void get_a_get_request_to_validate_messages() {
        //expectedData=new US_28APIpojo("Hasan","hasan@gmail.com","status","how are you");
        response=given().spec(spec).headers("Authorization","Bearer " + generateToken(),"Content-Type",
                ContentType.JSON,"Accept", ContentType.JSON).when().get("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("user should validate expected value actual valueUI")
    public void user_should_validate_expected_value_actual_value() {
        JsonPath jsonPath = response.jsonPath();
        //Hard Assertion
        assertEquals("Hasan",jsonPath.getString("name"));
        assertEquals("hasan@gmail.com",jsonPath.getString("email"));
        assertEquals("hello",jsonPath.getString("subject"));
        assertEquals("how are you",jsonPath.getString("message"));

/*
        {
            "id": 16628,
                "name": "Hasan",
                "email": "hasan@gmail.com",
                "subject": "hello",
                "message": "how are you"
        }
 */
    }

}