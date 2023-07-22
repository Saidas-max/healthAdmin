package stepdefinitions.API;

import base_urls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_30_RoomCreationPojo;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.AuthenticationMedunna.generateToken;

public class US_30_GetRequestStepDefs {
    /*
    {
    "createdBy": "adminteam03",
    "createdDate": "2023-03-09T02:59:45.614571Z",
    "id": 19067,
    "roomNumber": 2344,
    "roomType": "TWIN",
    "status": true,
    "price": 220.00,
    "description": "New room"
}
     */
    Response response;
    US_30_RoomCreationPojo roomCreationPojo = new US_30_RoomCreationPojo();
    @Given("user reads created  room dataha")
    public void user_reads_created_room_dataha() {
        US_30_RoomCreationPojo roomCreationPojo = new US_30_RoomCreationPojo(220.00,2344,"TWIN",true,"New room");
        MedunnaBaseUrl.medunnaSetUp();
        spec.pathParams("first","api","second","rooms","third",19067);


        response = given().spec(spec).headers("Authorization","Bearer " +generateToken(),
                        "Content-Type",ContentType.JSON,
                        "Accept",ContentType.JSON).
                when().get("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("user gets the room data and validatesha")
    public void user_gets_the_room_data_and_validatesha() {

        //1. Validation
        JsonPath jsonPath = response.jsonPath();
        //assertEquals(220.00, jsonPath.getDouble("price"));
        assertEquals(2344, jsonPath.getInt("roomNumber"));
        assertEquals("TWIN", jsonPath.getString("roomType"));
        assertTrue(jsonPath.getBoolean("status" ));
        assertEquals("New room", jsonPath.getString("description"));

        //3.validation
//        US_30_RoomCreationPojo actualDataPojo = response.as(US_30_RoomCreationPojo.class);
//
//        assertEquals(roomCreationPojo.getRoomNumber(), actualDataPojo.getRoomNumber());
//        assertEquals(roomCreationPojo.getRoomType(), actualDataPojo.getRoomType());
//        assertEquals(roomCreationPojo.getStatus(), actualDataPojo.getStatus());
//        assertEquals(roomCreationPojo.getPrice(), actualDataPojo.getPrice());
//        assertEquals(roomCreationPojo.getDescription(), actualDataPojo.getDescription());

    }

}
