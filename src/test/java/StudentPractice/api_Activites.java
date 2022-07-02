package StudentPractice;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class api_Activites {

    // Testing URI = https://fakerestapi.azurewebsites.net/api/v1/

    // Task 1: Using Rest Assured validate the status code for endpoint /Activities
    @Test
    public void verifyStatusCode() {
        RestAssured.given()
                .when()
                .post("https://fakerestapi.azurewebsites.net/api/v1/")
                .then()
                .assertThat()
                .statusCode(200);
        System.out.println("Test verified, status code is 200 ok");
    }

    // Task 2: Using Rest Assured Validate Content-Type  is application/json; charset=utf-8; v=1.0
    // for endpoint /Activities


    // Task 1: Using Rest Assured validate the status code for endpoint /Activities/12

    // Task 2: Using Rest Assured Validate Content-Type  is application/json; charset=utf-8; v=1.0
    // for endpoint /Activities/12
}
