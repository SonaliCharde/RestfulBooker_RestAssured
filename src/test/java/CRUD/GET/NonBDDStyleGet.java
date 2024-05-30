package CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStyleGet {
    public static void main(String[] args) {
        // GET Request
        // BDD style and Non BDD Style

        // given, when. then () . builder pattern

        // https://restful-booker.herokuapp.com/bookin
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/1").log().all();
        requestSpecification.when().log().all().get();
        requestSpecification.then().log().all().statusCode(200);
        requestSpecification.log().body();

    }
}
