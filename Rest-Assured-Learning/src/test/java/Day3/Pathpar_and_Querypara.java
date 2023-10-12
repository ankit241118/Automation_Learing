package Day3;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;

public class Pathpar_and_Querypara {
//  https://reqres.in/api/users?page=2
//  https://reqres.in - domain or base uri
//  /api- path parameter - routes the request where to go
//  /users- path parameter - routes the request where to go
//  ?page=2 - query parameter - filters the data, comes after ? mark

	@Test()
	void getData() {
	//  https://reqres.in/api/users?page=2
		given().pathParam("path1", "api").pathParam("path2", "users").queryParam("page", "3").when()
				.get("https://reqres.in/{path1}/{path2}").then().log().all();

	}
 
	
	@Test
	void cookie() {
		Response res = given().when().get("https://www.google.com");
     Map<String, String> c = res.getCookies();		
     System.out.println(c.keySet());   //returns all the keys stored in map "c"
     System.out.println(c.values());    //returns all the values of key stored in map "c"
     System.out.println(c);
     
    
	}
	
	
	
}
