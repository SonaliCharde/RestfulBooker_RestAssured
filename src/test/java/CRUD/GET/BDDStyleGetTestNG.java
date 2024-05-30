package CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BDDStyleGetTestNG {
    @Test
    public void BDDStyleGetBooking(){
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .when().log().all().get().then().log().body().statusCode(200);


                   }
}
