package CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStylePOSTToken {
    @Test
    public void NonBDDStylePOSTToken(){
        // POST Request
        // URL - https://restful-booker.herokuapp.com/auth
        // BODY - PAYLOAD - JSON
        // username- admin
        //password - password 123
        // HEADER - Content Type - application/json
        //Response - Status code 200, token in response body

        RequestSpecification requestSpecification = RestAssured.given();
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        requestSpecification.given().baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);


        //Making request
        Response response = requestSpecification.when().log().all().post();

        //Validation

        ValidatableResponse validatableResponse = response.then().statusCode(200);
        String responseString = response.asString();

        System.out.println(responseString);


    }
}
