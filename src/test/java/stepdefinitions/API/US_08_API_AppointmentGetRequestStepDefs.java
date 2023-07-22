package stepdefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_08_AppointmentPojo;
import pojos.US_08_PatientPojo;
import pojos.US_08_UserPojo;

import static base_urls.MedunnaBaseUrl.medunnaSetUp;
import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateToken;

public class US_08_API_AppointmentGetRequestStepDefs {
    Response response;

    @Given("User set the urlHA")
    public void user_set_the_url_ha() {
        medunnaSetUp();
        spec.pathParams("first","api","second","appointments","third",10586);
    }

    @Then("verify HTTP Status Code is {int} HA")
    public void verifyHTTPStatusCodeIsHA(Integer statusCode) {

        response.then().assertThat().statusCode(statusCode);
    }

    @Then("verify user get the appointment data as expectedHA")
    public void verifyUserGetTheAppointmentDataAsExpectedHA() {
        US_08_UserPojo userPojo =new US_08_UserPojo( "hastabilge", "545-78-2471");
        US_08_PatientPojo patientPojo =new US_08_PatientPojo("Bilge Bella","Pery","FEMALE",userPojo);
        US_08_AppointmentPojo expectedData =new US_08_AppointmentPojo(10586,"COMPLETED",patientPojo);
        System.out.println("expectedData =" + expectedData);


        JsonPath jsonPath=response.jsonPath();
        assertEquals(10586,jsonPath.getInt("id"));
        assertEquals(expectedData.getStatus(),jsonPath.getString("status"));
        assertEquals(expectedData.getUs_08_patientPojo().getFirstname(),jsonPath.getString("patient.firstName"));
        assertEquals(expectedData.getUs_08_patientPojo().getLastname(),jsonPath.getString("patient.lastName"));
        assertEquals(expectedData.getUs_08_patientPojo().getGender(),jsonPath.getString("patient.gender"));
        assertEquals(expectedData.getUs_08_patientPojo().getUserPojo().getLogin(),jsonPath.getString("patient.user.login"));
        assertEquals(expectedData.getUs_08_patientPojo().getUserPojo().getSsn(),jsonPath.getString("patient.user.ssn"));
//        assertEquals(10586,jsonPath.getInt("id"));
//        assertEquals("COMPLETED",jsonPath.getString("status"));
//        assertEquals("Bilge Bella",jsonPath.getString("patient.firstName"));
//        assertEquals("Pery",jsonPath.getString("patient.lastName"));
//        assertEquals("FEMALE",jsonPath.getString("patient.gender"));
//        assertEquals("hastabilge",jsonPath.getString("patient.user.login"));
//        assertEquals("545-78-2471",jsonPath.getString("patient.user.ssn"));


    }

    @When("Send a get request to get patient appointmentHA")
    public void sendAGetRequestToGetPatientAppointmentHA() {
        response =  given().spec(spec).when().headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).get("/{first}/{second}/{third}");
        response.prettyPrint();
    }
}
