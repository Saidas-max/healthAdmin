package stepdefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_06_AppointmentPojo;
import pojos.US_06_PatientPojo;
import pojos.US_06_UserPojo;

import java.io.IOException;

import static base_urls.MedunnaBaseUrl.medunnaSetUp;
import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_06_ApiStepDefinition {
    Response response;
    @Given("user set the urlYA")
    public void user_set_the_url_ya() {
      medunnaSetUp();
      spec.pathParams("first","api","second","appointments","third",10567);

    }
    @When("user send GET request to see the appointmentYA")
    public void user_send_get_request_to_see_the_appointment_ya() {

        response =   given().spec(spec).when().headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).get("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("verify HTTP Status is {int} YA")
    public void verify_http_status_is_ya(Integer statusCode) {
       response.then().assertThat().statusCode(statusCode);
    }
    @Then("verify user get the appointment data as expectedYA")
    public void verify_user_get_the_appointment_data_as_expected_ya() throws IOException {
        US_06_UserPojo userPojo = new US_06_UserPojo("halecan","777-88-9555");
        US_06_PatientPojo us06PatientPojo =new US_06_PatientPojo("Hale","Can","FEMALE",userPojo);
        US_06_AppointmentPojo expectedData=new US_06_AppointmentPojo(10567,"COMPLETED",us06PatientPojo);
        System.out.println("expectedData = " + expectedData);


        JsonPath jsonPath = response.jsonPath();
        assertEquals(expectedData.getId(),jsonPath.getInt("id"));
        assertEquals(expectedData.getStatus(),jsonPath.getString("status"));
        assertEquals(expectedData.getPatientPojo().getFirstName(),jsonPath.getString("patient.firstName"));
        assertEquals(expectedData.getPatientPojo().getLastName(),jsonPath.getString("patient.lastName"));
        assertEquals(expectedData.getPatientPojo().getGender(),jsonPath.getString("patient.gender"));
        assertEquals(expectedData.getPatientPojo().getUserPojo().getLogin(),jsonPath.getString("patient.user.login"));
        assertEquals(expectedData.getPatientPojo().getUserPojo().getSsn(),jsonPath.getString("patient.user.ssn"));

    }

}
/*
     {
    "id": 10567,
    "status": "COMPLETED",
    "patient": {
        "firstName": "Hale",
        "lastName": "Can",
        "gender": "FEMALE",
        "user": {
            "login": "halecan",
            "ssn": "777-88-9555"
      }
 */
