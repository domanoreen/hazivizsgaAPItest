package posts.list;

import api.base.BaseApiTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostsListTests extends BaseApiTest {

    @Test
    void tc_1_1_postsLekerdezese_pozitiv() {
        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/posts")
        .then()
            .statusCode(200)
            .body("$", is(not(empty())))
            .body("$", is(instanceOf(java.util.List.class)))
            .body("size()", greaterThan(0))
            .body("[0].id", notNullValue())
            .body("[0].title", notNullValue())
            .body("[0].body", notNullValue());
    }
}
