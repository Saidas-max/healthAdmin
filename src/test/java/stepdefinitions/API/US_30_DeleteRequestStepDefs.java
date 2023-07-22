package stepdefinitions.API;

import base_urls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.US_30_RoomCreationPojo;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_30_DeleteRequestStepDefs {
    Response response;
    @Given("user deletes room of dataa" )
    public void userDeletesRoomOfDataa() {
      MedunnaBaseUrl.medunnaSetUp();
//        spec.pathParams("first","api","second","rooms","third",18645);
//
//        response = given().spec(spec).
//                headers("Authorization", "Bearer " + generateToken(),
//                        "Content-Type", ContentType.JSON,
//                        "Accept", ContentType.JSON).
//                when().
//                delete("/{first}/{second}/{third}");
//   {
//    "createdBy": "adminteam03",
//    "createdDate": "2023-03-09T03:23:33.154046Z",
//    "id": 19068,
//    "roomNumber": 2348,
//    "roomType": "TWIN",
//    "status": true,
//    "price": 250,
//    "description": "New room"
//}     response.prettyPrint();
/*

 */

        spec.pathParams("first", "api", "second", "rooms", "third", 19913);
        US_30_RoomCreationPojo expectedDataDelete = new US_30_RoomCreationPojo();
        // String expectedDataDelete = "Created";
        response = given().spec(spec).
                headers("Authorization", "Bearer " + generateToken(),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).
                        contentType(ContentType.JSON).when().delete("/{first}/{second}/{third}" );
        response.prettyPrint();

    }

    @Then("user verify delete the room data validateha" )
    public void userVerifyDeleteTheRoomDataValidateha() {
        US_30_RoomCreationPojo actualDataDelete = new US_30_RoomCreationPojo();
        US_30_RoomCreationPojo expectedDataDelete = new US_30_RoomCreationPojo();
        assertEquals(201,response.statusCode());
        assertEquals(expectedDataDelete,actualDataDelete);

    }
}
