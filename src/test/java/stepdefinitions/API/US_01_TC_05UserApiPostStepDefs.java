package stepdefinitions.API;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.US_01MedunnaUsersPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_01_TC_05UserApiPostStepDefs {


    Response response;
    US_01MedunnaUsersPojo expectedData;


    Faker faker = new Faker();
    String url;

    RequestSpecification spec;


    @Given("user set the url for post request")
    public void user_set_the_url_for_post_request () {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "register");


    }
    @Given("Call the Pojo to create new expected data")
    public void call_the_pojo_to_create_new_expected_data () {

        expectedData = new US_01MedunnaUsersPojo(faker.name().username(), faker.name().firstName(),
                faker.name().lastName(), faker.idNumber().ssnValid(), faker.internet().emailAddress(), faker.internet().password());

        System.out.println("expectedData  :" + expectedData);


    }
    @Given("user sends a post-request to create a new registrant")
    public void user_sends_a_post_request_to_create_a_new_registrant () {
        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON, "Accept",
                        ContentType.JSON).body(expectedData).
                when().post("/{first}/{second}");
        response.prettyPrint();


    }
    @Then("Verify expected values and actual values")
    public void verify_expected_values_and_actual_values() {

        US_01MedunnaUsersPojo actualData = response.as(US_01MedunnaUsersPojo.class);
        System.out.println("actualData  =  " + actualData);

        assertEquals(expectedData.getLogin(),actualData.getLogin());
        assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        assertEquals(expectedData.getLastName(),actualData.getLastName());
        assertEquals(expectedData.getSsn(),actualData.getSsn());
        assertEquals(expectedData.getEmail(),actualData.getEmail());
    }

 
}
