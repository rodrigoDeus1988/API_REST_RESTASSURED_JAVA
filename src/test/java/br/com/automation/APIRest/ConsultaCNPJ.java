package br.com.automation.APIRest;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.http.ContentType;

public class ConsultaCNPJ {
	
	
	@Test
	public void consultaCNPJ() {
		String uriBase = "https://www.receitaws.com.br/v1/cnpj/04959158000144";
		given().relaxedHTTPSValidation()
        .get(uriBase).then().statusCode(200) // O status http retornado foi 200
		.contentType(ContentType.JSON); // O response foi retornado no formato JSON
					
	}

}
