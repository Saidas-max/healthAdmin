package features.featuresDB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;


import static base_urls.MedunnaBaseUrl.medunnaSetUp;
import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.AuthenticationMedunna.generateToken;

public class US_31_Api_DrValiadate {
    Response response;
    int counter;
    List<String> physicianList;
    JsonPath json;

    @Given("User set the urlHU")
    public void user_set_the_url_hu() {
        medunnaSetUp();
        spec.pathParam("first", "physicians");

    }
    @When("Send a get request to get PhysiciansHU with token")
    public void send_a_get_request_to_get_physicians_hu_with_token() {

        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).when().get("/{first}");
        response.prettyPrint();
    }
    @Then("verify user get the Physicians name as expectedHU")
    public void verify_user_get_the_physicians_name_as_expected_hu() {
        json = response.jsonPath();

       physicianList = json.getList("first_name");

        System.out.println(physicianList);
    }}

/*
JsonPath json = response.jsonPath();
        int counter =0;
        List<Integer> physcians = json.getList("id");

        for (int w : physcians) {
counter++;
        }
        System.out.println(counter);
        System.out.println(physcians);
        assertEquals(20,physcians.size());
    }
 */
