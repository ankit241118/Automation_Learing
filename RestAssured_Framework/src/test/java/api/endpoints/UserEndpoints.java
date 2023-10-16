package api.endpoints;

import static io.restassured.RestAssured.*;

import api.payloads.UserPOJO;
import io.restassured.response.Response;

//This class contains all the api request method of user module
//This method will only perform api request. 
//This methods will be return the api response body
//These will be called in test classes and assertion will be done on response returned by this functions
public class UserEndpoints {

	public static Response createUser(UserPOJO userdata) {
		return given().header("accept", "application/json").header("Content-Type", "application/json")
				.body(userdata).when().post(Routes.createuser);
	}

	public static Response getUser(String user) {
		return given().header("accept", "application/json").pathParam("username", user).
				when().get(Routes.getuser);

	}
	
	public static Response updateUser(UserPOJO userdata,String username) {
		return given().header("accept", "application/json").header("Content-Type", "application/json")
				.pathParam("username", username).body(userdata).when().put(Routes.updateuser);
	}

}
