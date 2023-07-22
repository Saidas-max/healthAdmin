package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {


    public static String generateToken() {
        Map<String, Object> med= new HashMap<>();
        med.put("password", "Batch81+");
        med.put("rememberMe", true);
        med.put("username", "Batch81");

        Response response = given().
                contentType(ContentType.JSON).
                body(med).
                when().
                post("https://medunna.com/api/authenticate");

        return response.jsonPath().getString("id_token");

    }
// password "Batch81+"
    //"rememberMe"=true
    //username="Batch81"

}
