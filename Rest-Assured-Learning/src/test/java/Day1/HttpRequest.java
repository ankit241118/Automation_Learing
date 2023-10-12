package Day1;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HttpRequest {
	/*
	 * Gherkin keywords for rest assured-
	 * Given-Request header,body,cookies, headers, auth,content, pathparameter,queryparameter
	 * type etc (All the prerequisites for making request)
	 * When- Httpmethod- PUT,POST,GET,DELETE etc. Pass URL here
	 * Then- For Validating responsebody,status code,cookies status code and 
	 *  extracting status code,extract response body, extract particular value using json path
	 * header, body etc
	 */

	@Test(priority = 1)
	void getUser() {

		given()
		.when().get("https://reqres.in/api/users?page=1")
		.then().statusCode(200).body("page",
				Matchers.equalTo(1)).log().all();

	};
	int id;
	@Test(priority = 2)
	void createUser() {

	Response Respnse = given().contentType("application/json").body("{\r\n"
				+ "    \"name\": \"Ankit\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}").

				when().post("https://reqres.in/api/users");
	
	 id=Respnse.jsonPath().getInt("id");
	System.out.println(id);
	Respnse.then().log().all();	
 
	}

	@Test(priority = 3)
	void updateUser() {
		
	given().contentType("application/json")
	.body("{\r\n"
			+ "    \"name\": \"Ankit\",\r\n"
			+ "    \"job\": \"Captain\"\r\n"
			+ "}\r\n"
			+ "").
	when().put("https://reqres.in/api/users/"+id).then().body("job",Matchers.equalTo("Captain"))
	.log().all();
	
	
	
	
	
	}
}
