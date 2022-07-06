package workspaceRestAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import static org.apache.http.HttpStatus.SC_OK;

public class E2E_Project {

    public String path;
    String memberOf = "/workspaces/member-of";

    // What is TestNG annotation that allows us to run a Test Before each Test = @BeforeTest
    // This method returning the token, so we can use to fo @Test
    @BeforeTest
    public String setupLogInAndToken() {
        RestAssured.baseURI = "https://api.octoperf.com";
        path = "/public/users/login";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("password", "jane12345");
        map.put("username", "jane.pc2022@gmail.com");

        return RestAssured.given()
                .queryParams(map)
                .contentType(ContentType.JSON) // this is I want to accept
                .accept(ContentType.JSON)
                .post(path)// send request to end point
                .then()
                .statusCode(SC_OK) // Verify status code = 200 or OK
                .extract() // Method that extracts response JSON data
                .body() // Body Extracted as JSON format
                .jsonPath() // Navigate using jsonPath
                .get("token"); // get value for key Token
    }

    @Test
    public void printResult() {
        System.out.println(setupLogInAndToken());
    }

    // Write a test for API endpoint member-of
    @Test
    public void verifyToken(){
        Response response = RestAssured.given()
                .header("Authorization", setupLogInAndToken())
                .when()
                .get(memberOf)
                .then()
                .log().all() //log allow to see all/we can choose by .log().....
                .extract().response(); //so we can start our own validation

        // Verify status code
        Assert.assertEquals(SC_OK, response.statusCode());
        Assert.assertEquals("Default", response.jsonPath().getString("name[0]"));

        // TODO add tests for ID, userID, Description
    }
}

