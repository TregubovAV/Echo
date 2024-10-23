package ru.netology;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

class PostmanEchoTest {

    @Test
            void shouldReturnSendData () {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when().log().all()
                .post("/post")
// Проверки
                .then().log().all()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("new data"));



    };



}