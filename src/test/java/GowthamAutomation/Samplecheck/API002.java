package GowthamAutomation.Samplecheck;

import io.restassured.RestAssured;

public class API002 {
    public static void main(String[] args) {

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/1")
                .when()
                    .get()
                .then()
                    .log().all() // to print complete json data like postman body
                    .statusCode(200);
    }
}
