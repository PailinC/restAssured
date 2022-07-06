package API_Testing.StudentPractice;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.ws.Response;
import java.io.File;

public class apiReadFromJsonBody {

    @Test
    public void readFromJson() {
        // TODO how can you read  from a file using Java

        // need to review again, don't copy yet


    }
    //TODO Task 1: Create a json file Authors -> Send a Post request
    // Validate Status code, content-type and all the fields from the request body
//    @Test
//    public void validateAuthorsPost() {
//        File requestBody = new File("src/resources/authors.json");
//
//        Response response = RestAssured.given()
//                .header("content-type", "application/json")
//                .and()
//                .body(requestBody)
//                .when()
//                .post("https://fakerestapi.azurewebsites.net/api/v1/Authors")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract().response();
//        Assert.assertEquals(response.contentType);
//
//
//    }



    //TODO Task 2: Create a json file Books -> Send a Post request
    // Validate Status code, content-type and all the fields from the request body

//    @Test
//    public void validateAuthorsPost() {
//        File requestBody = new File("src/resources/book.json");

//        Response response = RestAssured.given()
//                .header("content-type", "application/json")
//                .and()
//                .body(requestBody)
//                .when()
//                .post("https://fakerestapi.azurewebsites.net/api/v1/Books")
//                .then()
//                .log().all()
//                .statusCode(200)
//                .extract().response();

    }
//}
