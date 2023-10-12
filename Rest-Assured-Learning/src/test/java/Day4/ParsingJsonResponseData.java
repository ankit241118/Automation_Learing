package Day4;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class ParsingJsonResponseData {
//https://reqres.in/api/users?page=2
//How validate response body
//use online json finder to find json path of any key
	@Test//Way one to validate json response
	void test() {
		Response res = given().pathParam("para1", "users").queryParam("page", "2").when()
				.get("https://reqres.in/api/{para1}");
		res.then().log().all(); // log entire reponse ,headers
		res.then().body("total", Matchers.equalTo(12));// validate particular key body
		res.then().statusCode(200);// validate status code
		String total = res.jsonPath().get("total").toString();// get the value of key from body
	}

	// Validate using testNG
	@Test//Way two to validate json response
	void test2() { 
		Response res = given().pathParam("para1", "users").queryParam("page", "2").when()
				.get("https://reqres.in/api/{para1}");
		res.then().log().all(); // log entire reponse ,headers
		String t = res.jsonPath().getString("total");//get value of "total" from response
		Assert.assertEquals(t, "12");  //Assert using testNG

	}

}
