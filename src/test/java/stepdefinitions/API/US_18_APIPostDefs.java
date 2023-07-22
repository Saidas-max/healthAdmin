package stepdefinitions.API;

import base_urls.MedunnaBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US18_adminPojo;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.AuthenticationMedunna.generateToken;

public class US_18_APIPostDefs {
    US18_adminPojo expectedData;
    Faker faker = new Faker();
    Response response;
//        response = given().spec(spec).
//                headers("Authorization","Bearer "+generateToken(),"Content-Type", ContentType.JSON,
//                "Accept", ContentType.JSON).when().body(expectedData).post("/{first}/{second}");
//        response.prettyPrint();


    @Given("user sends post request for test-item data FC")
    public void user_sends_post_request_for_test_item_data_fc() {

        //set the url
        MedunnaBaseUrl.medunnaSetUp();
        spec.pathParams("first", "api", "second", "c-test-items");

        //set the expected data
        expectedData = new US18_adminPojo(faker.name().firstName(), "headache", 555.55);
        System.out.println(expectedData);

//        //send the request get the response
//      //response=given().spec(spec).contentType(ContentType.JSON).body(expectedData).headers("Authorization","Bearer "+generateToken()).when().post("/{first}/{second}");
//
 response = given().spec(spec).headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON, "Accept",
                        ContentType.JSON).body(expectedData).
                when().post("/{first}/{second}");
        response.prettyPrint();


    }
    @Then("user gets the test-item data and validates FC")
    public void user_gets_the_test_item_data_and_validates_fc() {

        //convert response to pojo
        US18_adminPojo actualData=response.as(US18_adminPojo.class);

        Assert.assertEquals(201,response.statusCode());
        Assert.assertEquals(expectedData.getName(),actualData.getName());
        Assert.assertEquals(expectedData.getDescription(),actualData.getDescription());
        Assert.assertEquals(expectedData.getPrice(),actualData.getPrice());

    }



    }
