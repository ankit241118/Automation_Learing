package Day2_Request_Body_creation;
/*Different ways to create payload body for post request
 * Using Hashmap
Using org.json library
Using POJO class- plain old Java object
Using- external json file
*/

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class UsingHashMap {

	@Test
void createUser() {
	
	HashMap<String, String> data = new HashMap<String, String>();
	data.put("name", "Ankit");
	data.put("job", "QA engineer"); 
	
	
	given().contentType("application/json").body(data)
	.when().post("https://reqres.in/api/users")
	.then().log().all();
	
}
}
