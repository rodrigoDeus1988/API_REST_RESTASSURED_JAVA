package br.com.automation.APIRest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import com.sun.tools.xjc.generator.bean.ImplStructureStrategy.Result;

import io.restassured.http.ContentType;

public class ApiTabelaFipe {

	@Test
	public void TabelaFipe() {
		String uriBase = "http://fipeapi.appspot.com/api/1/carros/veiculo/21/4828.json";
		given().relaxedHTTPSValidation().param("2014-1", "Palio 1.0 ECONOMY Fire Flex 8V 4p").when()

				.get(uriBase).then().statusCode(200) // O status http retornado foi 200
				.contentType(ContentType.JSON); // O response foi retornado no formato J?
		
		

	}

}
