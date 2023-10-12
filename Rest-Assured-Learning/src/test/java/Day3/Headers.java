package Day3;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Headers {

	@Test
	void getHeader() { 
		
	Response res = given().pathParam("path1", "api").pathParam("path2", "users").queryParam("page", "3").when()
		.get("https://reqres.in/{path1}/{path2}");
	
	io.restassured.http.Headers headers = res.getHeaders(); //get all headers
//	System.out.println(headers);
	
	System.out.println(res.getHeader("Server")); //get single header by passing header name
	
	res.then().header("Server",Matchers.equalTo("cloudflare"));
	

	}
}
