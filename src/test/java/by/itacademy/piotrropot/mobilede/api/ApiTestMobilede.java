package by.itacademy.piotrropot.mobilede.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTestMobilede {

    @Test
    public void testOpenMobiledeGET() {
        RestAssured.baseURI = "https://www.mobile.de";
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " +
                "(KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36";
        Response response = RestAssured.given()
                .header("User-Agent", userAgent)
                .when()
                .get();
        assertEquals(200, response.getStatusCode());
    }
}
