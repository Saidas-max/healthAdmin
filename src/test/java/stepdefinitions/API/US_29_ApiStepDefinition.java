package stepdefinitions.API;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_29_CountryPojo;

import java.util.HashMap;
import java.util.Map;

import static base_urls.MedunnaBaseUrl.medunnaSetUp;
import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_29_ApiStepDefinition {
    Response response;
    Map<String,String> expectedDataPost;
    US_29_CountryPojo expectedDataPut;

    //*************************  GET   REQUEST  ********************************
    @Given("user set the url for GET RequestYA")
    public void userSetTheUrlForGETRequestYA() {
       medunnaSetUp();
        spec.pathParams("first","api","second","countries","third",7787);
    }
    @When("user send GET request to see the countryYA")
    public void user_send_get_request_to_see_the_country_ya() {
       response = given().spec(spec).when().
               headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
               get("/{first}/{second}/{third}");
       response.prettyPrint();
    }
    @Then("verifyYA HTTP Status is {int}")
    public void verifyyaHTTPStatusIs(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }
    @Then("verify user get the country data as expectedYA")
    public void verify_user_get_the_country_data_as_expected_ya() {

        US_29_CountryPojo expectedDataGet = new US_29_CountryPojo(7787,"Belgium");
        System.out.println("expectedDataGet = " + expectedDataGet);

        US_29_CountryPojo actualData = response.as(US_29_CountryPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(expectedDataGet.getId(),actualData.getId());
        assertEquals(expectedDataGet.getName(),actualData.getName());
    }
    //*************************  POST  REQUEST  ********************************
    @Given("user set the url for POST RequestYA")
    public void userSetTheUrlForPOSTRequestYA() {
        medunnaSetUp();
        spec.pathParams("first","api","second","countries");
    }
    @When("user send POST request to see the countryYA")
    public void userSendPOSTRequestToSeeTheCountryYA() {
        String countryName = Faker.instance().country().name();
        expectedDataPost = new HashMap<>();
        expectedDataPost.put("name",countryName);
        System.out.println("expectedDataPost = " + expectedDataPost);
        response = given().spec(spec).
                headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
                body(expectedDataPost).when().post("/{first}/{second}");
    }
    @Then("verify user get the country data as expectedYA after post request")
    public void verifyUserGetTheCountryDataAsExpectedYAAfterPostRequest() {

        US_29_CountryPojo actualData = response.as(US_29_CountryPojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(expectedDataPost.get("name"),actualData.getName());
    }
    //*************************  PUT   REQUEST  ********************************
    @Given("user set the url for PUT RequestYA")
    public void userSetTheUrlForPUTRequestYA() {
        medunnaSetUp();
        spec.pathParams("first","api","second","countries");
    }
    @When("user send PUT request to see the countryYA")
    public void userSendPUTRequestToSeeTheCountryYA() {
        String name = Faker.instance().country().name();
        expectedDataPut = new US_29_CountryPojo(20158,name);
        System.out.println("expectedDataPut = " + expectedDataPut);
        response = given().spec(spec).
                headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).
                body(expectedDataPut).when().put("/{first}/{second}");
        response.prettyPrint();
    }
    @Then("verify user get the country data as expectedYA after put request")
    public void verifyUserGetTheCountryDataAsExpectedYAAfterPutRequest() {
        US_29_CountryPojo actualData = response.as(US_29_CountryPojo.class);
        System.out.println("actualData = " + actualData);
        assertEquals(expectedDataPut.getId(),actualData.getId());
        assertEquals(expectedDataPut.getName(),actualData.getName());

    }

}
