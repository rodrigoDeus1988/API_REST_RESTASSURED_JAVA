package br.com.automation.APIRest;

import static io.restassured.RestAssured.*;

import io.restassured.assertion.BodyMatcher;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;

import javax.mail.search.BodyTerm;

import org.junit.Test;

public class TestApi {

	@Test
	public void Teste() {
		String uriBase = "https://postman-echo.com/get";
		given().relaxedHTTPSValidation().param("foo1", "bar1").param("foo2", "bar2").when()

				.get(uriBase).then().statusCode(200) // O status http retornado foi 200
				.contentType(ContentType.JSON) // O response foi retornado no formato JSON
				.body("headers.host", is("postman-echo.com")) // A chave "host" possui exatamente o valor
																// "postman-echo.com"
				.body("args.foo1", containsString("bar")); // A chave "foo1" contém o valor "bar"
	}

}
