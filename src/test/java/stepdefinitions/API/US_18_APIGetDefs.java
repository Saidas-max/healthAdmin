package stepdefinitions.API;

import base_urls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;









public class US_18_APIGetDefs {
Response response;

    String url;
    @Given("users set the urlus18 and get request")
    public void users_set_the_urlus18() {
        //https://medunna.com/api/c-test-items/1754
        //url="https://medunna.com/api/c-test-items";
        MedunnaBaseUrl.medunnaSetUp();
        spec.pathParams("first","api","second","c-test-items","third",1761);
        response = given().spec(spec).headers("Authorization","Bearer "+generateToken(),"Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON).when().get("/{first}/{second}/{third}");
        response.prettyPrint();


    }

    @Then("user validates the test itemsus18")
    public void userValidatesTheTestItems() {
        JsonPath jsonPath = response.jsonPath();
      assertEquals("Hemoglobin",jsonPath.getString("name"));
      assertEquals("Hemoglobin",jsonPath.getString("description"));
      //assertEquals( 145.00,jsonPath.getDouble("price"));
      assertEquals("13.2 gm/dL",jsonPath.getString("defaultValMin"));
      assertEquals("16.2 gm/dL",jsonPath.getString("defaultValMax"));

//        {
//            "createdBy": "adminmurat",
//                "createdDate": "2023-02-22T08:56:30.703166Z",
//                "id": 1761,
//                "name": "Hemoglobin",
//                "description": "Hemoglobin",
//                "price": 145.00,
//                "defaultValMin": "13.2 gm/dL",
//                "defaultValMax": "16.2 gm/dL"
//
//
//
//
//
//    }
//    @Given("users send request to get test itemus18")
//    public void users_send_request_to_get_test_itemus18() {
//        //Send the request and get the response
//
//
//    }

}
}
