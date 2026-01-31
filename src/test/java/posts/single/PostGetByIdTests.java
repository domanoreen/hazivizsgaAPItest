package posts.single;

import api.base.BaseApiTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostGetByIdTests extends BaseApiTest {

    @Test
    void tc_2_1_letezoPostLekerdezese_pozitiv() {
        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/posts/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1));
    }

    @Test
    void tc_2_2_nemLetezoPostLekerdezese_negativ() {
        given()
            .accept(ContentType.JSON)
        .when()
            .get("/posts/9999")
        .then()
            .statusCode(404)
            .body(anyOf(equalTo(""), equalTo("{}")));
    }
}
