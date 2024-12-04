package GowthamAutomation.PostMethods;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Non_BDD_Stle {

    @Description("non bdd style")
    @Test
    public void testNonBddStyle()
    {
        RequestSpecification r=RestAssured.given();
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

                r.baseUri("https://restful-booker.herokuapp.com").basePath("/auth");
                r.contentType(ContentType.JSON);
                r.when();
                r.log().all().body(payload);
                r.then().log().all().statusCode(200);

    }
}
