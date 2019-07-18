package br.com.automation.APIRest;

import org.junit.Assert;
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
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		Assert.assertTrue(response.statusCode() == 200);
		Assert.assertTrue("O  status  code deveria ser 200",response.statusCode() == 200 );
		Assert.assertEquals(200, response.statusCode()); 
		
		//ValidatableResponse validacao = response.then();
		//validacao.statusCode(200);
		System.out.println(response.getBody().asString().equals("Ola Mundo!"));
		
	}
 
}
 