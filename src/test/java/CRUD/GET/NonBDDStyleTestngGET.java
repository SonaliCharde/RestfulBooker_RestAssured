package CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class NonBDDStyleTestngGET {
    //Testng -Add

    @Test

    public void testGetAllBookingNegative(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/00");
        requestSpecification.when().log().all().get().body();
        requestSpecification.then().log().all().statusCode(404);
    }

    @Test
    public void testGetAllBookingPositive(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/869");
        requestSpecification.when().log().all().get().body();
        requestSpecification.then().log().all().statusCode(200);
    }
    @Test
    public void testGetAllBookingNegative1(){
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/-1");
        requestSpecification.when().log().all().get().body().prettyPeek();
        requestSpecification.then().log().all().statusCode(404);
    }

}
