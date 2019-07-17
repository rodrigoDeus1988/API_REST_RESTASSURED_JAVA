package br.com.automation.APIRest;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;

public class OlaMundoTest {
	

	@Test
	public void OlaMundo () {
		
		Response response = RestAssured.request(Method.GET, "https://restapi.wcaquino.me/ola");
		System.out.println(response.getBody().asString().equals("Ola Mundo!"));
		System.out.println(response.statusCode() == 200);
		
		ValidatableResponse validacao = response.then();
				validacao.statusCode(200);	
		
	}
 
}
 