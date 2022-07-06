package API_Testing.StudentPractice;

import Pojos.logInPojos;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class loginWithPojos {

    @Test
    public void loginWihtPojosData() {
        logInPojos data = new logInPojos(); // name logInPojos came from class that we create under Pojos package
        data.setPassWord("jane12345");
        data.setUserName("jane.pc2022@gmail.com");

        RestAssured.baseURI = "https://api.octoperf.com";
        String path = "/public/users/login";

        RestAssured.given()
                .queryParam("username", data.getUserName())
                .queryParam("password", data.getPassWord())
                .when()
                .post(path)
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .log().all();
    }
}


