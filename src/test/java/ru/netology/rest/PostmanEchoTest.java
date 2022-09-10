package ru.netology.rest;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEchoTest {
    @Test
    void PostmanEchoTest() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some value")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",equalTo("some value"));
        ;
    }
}
