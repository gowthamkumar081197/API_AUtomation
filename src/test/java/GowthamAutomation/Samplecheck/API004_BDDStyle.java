package GowthamAutomation.Samplecheck;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API004_BDDStyle {

    @Test
    public void test_get_Method()
    {
        String pincode="561203";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pincode)
                .when()
                    .log().all()
                .then()
                    .log().all()
                    .statusCode(200);

    }
    @Test
    public void test_get_Method1()
    {
        String pincode="-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .then()
                .log().all()
                .statusCode(200);

    }
}
