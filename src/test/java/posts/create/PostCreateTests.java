package posts.create;

import api.base.BaseApiTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class PostCreateTests extends BaseApiTest {

    @Test
    void tc_3_1_ujPostLetrehozasa_pozitiv_logolassal() {

        String requestBody = """
        {
          "title": "projektfeladat",
          "body": "api házivizsga",
          "userId": 1
        }
        """;

        given()
            .contentType(ContentType.JSON)
            .log().all()
            .body(requestBody)
        .when()
            .post("/posts")
        .then()
            .log().ifValidationFails()
            .statusCode(201)
            .body("id", notNullValue());
    }
}
