package CRUD.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.tokens.Token;

public class NonBDDDelete2788 {
    //Booking ID = 2788
    //BaseURL = "https://restful-booker.herokuapp.com"
    //Basepath = "/booking/2788"
    //Content-Type: application/json
    //Cookie: token = 1b0e1a49a0f102d


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;
    String token = "1b0e1a49a0f102d";

    @Test
    public void deletebookingNONBDD(){
        requestSpecification = RestAssured.given();
        requestSpecification.given().baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/2788");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.auth().basic("token",token);

        response = requestSpecification.when().delete();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(403);

    }


}
