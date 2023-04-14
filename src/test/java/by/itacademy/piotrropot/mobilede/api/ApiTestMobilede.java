package by.itacademy.piotrropot.mobilede.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class ApiTestMobilede {

    @Test
    public void testOpenMobilede() {
        String URL = "https://www.mobile.de";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .get(URL);
        response.prettyPrint();
    }
    @Test
    public void postRequestExampleTest() {
        String someRandomString = String.format("%1$TH%1$TM%1$TS", new Date());
        JSONObject requestBody = new JSONObject();
        requestBody.put("FirstName", someRandomString);
        requestBody.put("LastName", someRandomString);
        requestBody.put("UserName", someRandomString);
        requestBody.put("Password", someRandomString);
        requestBody.put("Email", someRandomString + "@gmail.com");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestBody.toString());
        Response response = request.post("https://webhook.site/a18a23cb-e9a0-4f03-a7fa-cdfcfa76ca98");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
        System.out.println("The status code recieved: " + statusCode);
}}