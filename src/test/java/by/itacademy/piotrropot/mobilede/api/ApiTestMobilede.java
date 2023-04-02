package by.itacademy.piotrropot.mobilede.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class ApiTestMobilede {
    @Test
    public void testOpenMobilede() {
        String URL = "https://www.mobile.de/ru/";
        when().get(URL)
                .then().assertThat().statusCode(403);
    }
}
