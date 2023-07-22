package stepdefinitions.API;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_30_RoomCreationPojo;

import static base_urls.MedunnaBaseUrl.medunnaSetUp;
import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_30_PostRequestStepDefs {
    Response response;


    @Given("user sends post request for room dataha")
    public void user_sends_post_request_for_room_dataha() {
        medunnaSetUp();
        spec.pathParams("first","api","second","rooms");
        US_30_RoomCreationPojo roomCreationPojo = new US_30_RoomCreationPojo();
      roomCreationPojo.setRoomNumber(Faker.instance().number().numberBetween(1000, 1000000));
       roomCreationPojo.setRoomType("TWIN");
        roomCreationPojo.setStatus(true);
       roomCreationPojo.setPrice(100);
        roomCreationPojo.setDescription("This room is created by API");
      //  roomCreationPojo =new US_30_RoomCreationPojo(200,7808,"TWIN",true,"This room is created by HastaBilge");


     response= given().
             headers("Authorization","Bearer " +generateToken(),
                     "Content-Type",ContentType.JSON,
              "Accept",ContentType.JSON).
              spec(spec).contentType(ContentType.JSON).
              body(roomCreationPojo).when().post("/{first}/{second}");
      response.prettyPrint();


    }
    @Then("user gets the room data and validateshy" )
    public void userGetsTheRoomDataAndValidateshy() {
        assertEquals(201, response.getStatusCode());

//        //1. Validation
//        JsonPath jsonPath = response.jsonPath();
//
//        assertEquals(roomCreationPojo.getRoomNumber(), jsonPath.getInt("roomNumber"));
//        assertEquals(roomCreationPojo.getRoomType(), jsonPath.getString("roomType"));
//        assertEquals(roomCreationPojo.getStatus(), jsonPath.getBoolean("status"));
//        assertEquals(roomCreationPojo.getPrice(), jsonPath.getInt("price"));
//        assertEquals(roomCreationPojo.getDescription(), jsonPath.getString("description"));
    // GoRestPojo actualData=response.as(GoRestPojo.class);
    //3.validation
}


    }
