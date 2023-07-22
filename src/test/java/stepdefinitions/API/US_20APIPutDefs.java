package stepdefinitions.API;

import base_urls.MedunnaBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US20_StaffPojo;
import pojos.US20_User_innerPojo;
import utilities.JsonUtil;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_20APIPutDefs {

    Response response;
    US20_User_innerPojo expectedData=new US20_User_innerPojo();
    US20_StaffPojo responsePojo=new US20_StaffPojo();

    @Given("user sends put request for test-item data FC")
    public void userSendsPutRequestForTestItemDataFC() {
        Faker faker=new Faker();
        //set the url
        MedunnaBaseUrl.medunnaSetUp();
        spec.pathParams("first", "api", "second", "staff");

        //set the expected data
        expectedData=new US20_User_innerPojo("stafffazi",true,"432-47-2390",2791);
        responsePojo=new US20_StaffPojo("yesil","fazilet",faker.phoneNumber().cellPhone(),"432-47-2390",expectedData,2791);
        System.out.println("expecteddatam bu " +responsePojo);

        //Send the request and get the response
       response = given().spec(spec).headers("Authorization", "Bearer " + generateToken(), "Content-Type", ContentType.JSON, "Accept",
                ContentType.JSON).body(responsePojo).when().put("/{first}/{second}");
        //response.prettyPrint();

    }


    @Then("user gets the put response data and validates FC")
    public void userGetsThePutResponseDataAndValidatesFC() {
        //Do assertion

        US20_StaffPojo actualData= JsonUtil.convertJsonToJavaObject(response.asString(),US20_StaffPojo.class);
        assertEquals(expectedData.getSsn(),actualData.getSsn());



    }
}

/*
{

    "firstName": "cetin",
    "lastName": "fazilet",
    "phone": "123-321-1234",
    "id": 4362,
    "ssn": "432-47-2390",
    "user": {

        "login": "stafffazilet",

        "activated": true,
        "id": 2791,

        "ssn": "432-47-2390"
    }
}
 */