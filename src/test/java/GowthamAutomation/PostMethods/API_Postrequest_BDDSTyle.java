package GowthamAutomation.PostMethods;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class API_Postrequest_BDDSTyle {
    @Test
    public void createPost()
    {
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com").basePath("/auth")
                .contentType(ContentType.JSON)
                .when()
                .log().all().body(payload)
                .then()
                .log().all().statusCode(200);
    }
}
