package GowthamAutomation.Samplecheck;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API003_TestNg_TC1 {

    @Test
    public void Testcase_getMethod() {
        // RestAssured library used for making HTTP requests
        RestAssured
                .given()  // Setup phase: prepare the request
                .baseUri("https://restful-booker.herokuapp.com")  // Base URI of the API
                .basePath("/booking/1")  // Specific path to the resource being tested
                .when()
                .get()  // Perform a GET request
                .then()  // Assertions phase: verify the response
                .log().all()  // Log all the response data (like body, headers, etc.)
                .statusCode(200);  // Assert that the HTTP status code is 200 (OK)
    }
}
