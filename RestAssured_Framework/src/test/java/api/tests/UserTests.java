package api.tests;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payloads.UserPOJO;
import io.restassured.response.Response;

public class UserTests {
UserPOJO p;
@BeforeClass
void setTestData(){
	 p = new UserPOJO();
	p.setId(1);
	p.setUsername("Ankit11");
	p.setFirstName("Ankit");
	p.setLastName("Kayasth");
	p.setEmail("akayasth100@gmail.com");
	p.setPassword("1234556");
	p.setPhone("789456123");	
	
}
	
@Test(priority = 1)
void createUserTest() {
	Response res = UserEndpoints.createUser(p);
	res.then().log().body();
	res.then().assertThat().statusCode(200);
}

@Test(priority = 2)
void getUserTest() {
 Response res = UserEndpoints.getUser(p.getUsername());
 res.then().log().body();
 res.then().assertThat().body("username",Matchers.equalTo(p.getUsername()) );
 res.then().assertThat().body("firstName",Matchers.equalTo(p.getFirstName()));
 res.then().assertThat().body("lastName",Matchers.equalTo(p.getLastName()));
 res.then().assertThat().body( "email",Matchers.equalTo(p.getEmail()));
 res.then().assertThat().body( "password",Matchers.equalTo(p.getPassword()));
 res.then().assertThat().body("phone", Matchers.equalTo(p.getPhone()));
 }

@Test(priority = 3)
void updateUserTest() {
	p.setFirstName("Ansh");
Response res = UserEndpoints.updateUser(p,p.getUsername());
res.then().log().body();
//UserEndpoints.getUser(p.getUsername()).then().assertThat().body("firstName",Matchers.equalTo("Ansh"));
   UserEndpoints.getUser(p.getUsername()).then().log().all();
}





}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

