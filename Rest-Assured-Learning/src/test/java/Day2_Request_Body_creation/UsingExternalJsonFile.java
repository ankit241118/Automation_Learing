package Day2_Request_Body_creation;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.internal.support.FileReader;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;

public class UsingExternalJsonFile {
 
	@Test
	void createUser() throws FileNotFoundException {

		File f = new File(System.getProperty("user.dir") + "\\body.json");
		java.io.FileReader fr = new java.io.FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject ob = new JSONObject(js);

		given().contentType("application/json").body(ob.toString()).when().post("https://reqres.in/api/users").then()
				.log().all();

	}

}
