package api.tests;

import org.testng.annotations.Test;

import api.dataprovider.createUserDataProvider;
import api.endpoints.UserEndpoints;
import api.payloads.UserPOJO;
import io.restassured.response.Response;

public class DataDrivenTest {
@Test(dataProviderClass =api.dataprovider.createUserDataProvider.class  ,dataProvider = "getDataforcreateUser")
	void createUserDataTest(String usname,String Fname,String Lname, String email, String pass,
			String phone) {
		UserPOJO p = new UserPOJO();
		 p = new UserPOJO();
		//	p.setId(Integer.getInteger(id));
			p.setUsername(usname);
			p.setFirstName(Fname);
			p.setLastName(Lname);
			p.setEmail(email);
			p.setPassword(pass);
			p.setPhone(phone);
		System.out.println("*******Creating user*********");
		Response res = UserEndpoints.createUser(p);
		res.then().log().all();
		UserEndpoints.getUser(p.getUsername()).then().log().all();
		
}}