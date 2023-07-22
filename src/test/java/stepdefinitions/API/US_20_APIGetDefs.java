package stepdefinitions.API;

import base_urls.MedunnaBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_20_APIGetDefs {
    Faker faker = new Faker();
    Response response;

    @Given("users set the url and get request FC")
    public void users_set_the_url_and_get_request_fc() {

        //set the url
        MedunnaBaseUrl.medunnaSetUp();
        spec.pathParams("first","api","second","staff","third","4362");

        //send the request get the response

        response=given().spec(spec).headers("Authorization","Bearer "+generateToken(),"Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON).when().get("/{first}/{second}/{third}");
        response.prettyPrint();




    }
    @Then("user validates the test items FC")
    public void user_validates_the_test_items_fc() {

        JsonPath jsonPath=response.jsonPath();

        assertEquals(200,response.statusCode());
        assertEquals("cetin",jsonPath.getString("firstName"));
        assertEquals("fazilet",jsonPath.getString("lastName"));
        assertEquals("111-111-1111",jsonPath.getString("phone"));

        assertEquals("stafffazilet",jsonPath.getString("user.login"));
        //assertEquals(true,jsonPath.getString("user.activated"));
        assertEquals("432-47-2390",jsonPath.getString("user.ssn"));

        System.out.println("basarili get request fazilet");



    }



}
