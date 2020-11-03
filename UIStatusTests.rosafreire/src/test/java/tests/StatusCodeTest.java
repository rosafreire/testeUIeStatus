package tests;
import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.StatusCodePage;

public class StatusCodeTest {
    @Before
    public void SetUp(){
        RestAssured.baseURI = "https://reqres.in/";
    }

    @Test
    public void httpCode200() {
        new StatusCodePage().validadeStatusCode("/api/users?page=2", 200,"HTTP/1.1 200 OK")
                .validadeStatusCode("/api/unknown/23", 404, "HTTP/1.1 404 Not Found");
    }

    @After
    public void tearDown() {
        //System.exit(0);
    }
}
