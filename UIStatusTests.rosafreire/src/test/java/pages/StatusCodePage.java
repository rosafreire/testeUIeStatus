package pages;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class StatusCodePage {
    public int httCode(String url) {
        return RestAssured.get(url).statusCode();
    }

    public StatusCodePage validadeStatusCode(String url, Integer expectedStatus, String expectedMessage) {
        RestAssured.given()
                .when()
                .get(url)
                .then()
                .assertThat()
                .statusCode(expectedStatus);
        System.out.println("Confirma: " + expectedStatus);

        Response response = given()
                .contentType("aplication/JSON")
                .get(url);
        response
                .then()
                .assertThat()
                .statusLine(expectedMessage);
        System.out.println("Confirma: " + expectedMessage);


        return this;
    }
}
