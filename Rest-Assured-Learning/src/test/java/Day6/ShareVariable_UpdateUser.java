package Day6;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ShareVariable_UpdateUser{
	//https://reqres.in/api/users/2
	
	@Test
	void updateUser(ITestContext context) { 
		JSONObject h = new JSONObject();
		h.put("name", "Ankit");
		h.put("job","QA Automation engineer");
		
		//Use getAttribute to get the value and save it in a variable named id
		String id = context.getAttribute("user_id").toString()     ;
	Response Res = given().contentType("application/json").pathParam("path1", "users").
			pathParam("path2", id).body(h.toString()).
	when().post("https://reqres.in/api/{path1}/{path2}");
	}
	

}