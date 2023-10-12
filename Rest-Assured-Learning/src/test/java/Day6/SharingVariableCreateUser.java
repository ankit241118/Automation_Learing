package Day6;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class SharingVariableCreateUser {
//How to share variable value from one class to other
//Use ITestContext 

	
@Test
void createUser(ITestContext context) { 
//https://reqres.in/api/users
	JSONObject h = new JSONObject();
	h.put("name", "Ankit");
	h.put("job","QA engineer");

Response Res = given().contentType("application/json").pathParam("path1", "users").body(h.toString()).
when().post("https://reqres.in/api/{path1}");

String id=Res.jsonPath().getString("id"); //Fetch the id value from response
context.setAttribute("user_id", id);//Use setAttribute from ITestContext class to save variable value


}
}
