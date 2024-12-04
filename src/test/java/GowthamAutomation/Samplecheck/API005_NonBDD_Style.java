package GowthamAutomation.Samplecheck;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API005_NonBDD_Style {

    static  RequestSpecification r= RestAssured.given();

    @Description("Testcase1: Non BDD Style Positive testcase")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_nonBddstyle()
    {
        String pincode="561203";
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);
        r.when().log().all();
        r.then().log().all().statusCode(200);
    }

    @Description("Testcase2: Non BDD Style Negative testcase")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_nonBddstyle1()
    {
        String pincode="-12";
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pincode);
        r.when().log().all();
        r.then().log().all().statusCode(404);
    }

}
