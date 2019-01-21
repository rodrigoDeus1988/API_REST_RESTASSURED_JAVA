package br.com.automation.APIRest;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.http.ContentType;

public class ApiMoedas {
	
	@Test
	public void consultaMoeda() {
		String uriBase = "https://economia.awesomeapi.com.br/all";
		given().relaxedHTTPSValidation()
        .get(uriBase).then().statusCode(200) // O status http retornado foi 200
		.contentType(ContentType.JSON); // O response foi retornado no formato JSON
					
	}

}
