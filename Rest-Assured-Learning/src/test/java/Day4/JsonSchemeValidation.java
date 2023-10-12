package Day4;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class JsonSchemeValidation {
	
//Firstly generate scheme from api response using online tools and save it in .json file in the project
	@Test 
	void jsonSchemeVal() {
	Response res = given().pathParam("para1", "users").queryParam("page", "2").when()
			.get("https://reqres.in/api/{para1}");

	//path where json scheme file is saved
	File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\scheme.json");
	
	//use JsonSchema Validator in body to verify scheme
	res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(f));
	
	
	
	
	
	
	
	}
}