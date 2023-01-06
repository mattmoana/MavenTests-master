package RestAssuredTests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;


public class RestAssuredTests {

    @Test
    public void testOrdersById()  {
        when()
            .get("http://51.250.6.164:8080/test-orders/{id}", 3)
                .then()
                .statusCode(200)
                .body("status", equalTo("OPEN"),
                        "courierId", equalTo(null),
                        "id", equalTo(3));
    }
}
