package br.com.automation.APIRest;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.http.ContentType;

public class ApiConsultaCep {
	
	@Test
	public void consultaCep() {
		String uriBase = "https://cep.awesomeapi.com.br/03350000";
		given().relaxedHTTPSValidation()
        .get(uriBase).then().statusCode(200) // O status http retornado foi 200
		.contentType(ContentType.JSON); // O response foi retornado no formato JSON
					
	}

}

