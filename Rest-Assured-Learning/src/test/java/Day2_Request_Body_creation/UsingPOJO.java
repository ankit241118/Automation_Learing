package Day2_Request_Body_creation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class UsingPOJO {

	@Test
	void createUser() {
		
	PojoBody p = new PojoBody();
	p.setName("Ankit");
	p.setJob("QA");
	 
	given().contentType("application/json").body(p).when().post("https://reqres.in/api/users").then().log().all();
		
		
		
	}
}
