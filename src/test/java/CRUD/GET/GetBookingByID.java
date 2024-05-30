package CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetBookingByID {
    RequestSpecification requestSpecification ;
    ValidatableResponse validatableResponse ;

    @Test
    public void BYID(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/:500");

        Response response = requestSpecification.when().log().all().get();
        validatableResponse = response.then().log().body();
        validatableResponse = response.then().assertThat().statusCode(404);

    }
}
