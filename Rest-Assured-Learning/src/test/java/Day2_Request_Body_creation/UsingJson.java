package Day2_Request_Body_creation;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class UsingJson {

@Test
void createUser() {
JSONObject data = new JSONObject();
data.put("name", "Ankit");
data.put("job", "job2");
given().contentType("application/json").
body(data.toString() ).    //use to string method in case of JSONObject
when().post("https://reqres.in/api/users").
then().log().all(); 

		
	}
}
