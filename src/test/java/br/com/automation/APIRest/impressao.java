package br.com.automation.APIRest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class impressao {
	
	public static void main(String[] args) {
		Response response = RestAssured.request(Method.GET, "https://www.receitaws.com.br/v1/cnpj/61186888000789");
		System.out.println(response.getBody().asString());
		System.out.println(response.statusCode() == 200);
		
	} 

}
