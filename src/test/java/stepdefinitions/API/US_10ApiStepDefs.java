package stepdefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_10APIpojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_10ApiStepDefs {

   US_10APIpojo expectedData;
   US_10APIpojo actualData;
    Response response;
   String url;


    @Given("user set the urlulf {string}")
    public void user_set_the_url(String URL) {
     url=URL;
    }

    @And("Call the Pojo to create expected dataulf")
    public void callThePojoToCreateExpectedData() {
     expectedData= new US_10APIpojo("sabiradil","Sabir","Adil","301-20-3030","sabiradil@gmail.com");
     System.out.println(expectedData);
    }

    @Given("sends a get-request to get all registrant dataulf")
    public void sends_a_get_request_to_get_all_registrant_data() {
     response=given().headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).when().get(url);
     response.prettyPrint();
    }

 @Then("HTTP Status Code shouldulf be {int}")
 public void http_status_code_shouldulf_be(Integer int1) {
  assertEquals(200,response.statusCode());

 }
 @Then("Verify response content type isulf {string}")
 public void verify_response_content_type_is(String string) {
  assertEquals(string,response.contentType());
 }


 @Then("Verify expected values and actual values should be sameulf")
 public void verify_expected_values_and_actual_values_should_be_same() {

  actualData = response.as(US_10APIpojo.class);

  assertEquals(expectedData.getLogin(),actualData.getLogin());
  assertEquals(expectedData.getFirstName(),actualData.getFirstName());
  assertEquals(expectedData.getLastName(),actualData.getLastName());
  assertEquals(expectedData.getSsn(),actualData.getSsn());
  assertEquals(expectedData.getEmail(),actualData.getEmail());

 }




}