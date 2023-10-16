package ProductApp;

import static io.restassured.RestAssured.*;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import Pojo.LoginPojo;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import util.TestUtil;

public class loginOptimised {

	
	public static void main(String[] args) throws Exception {
		
	LoginPojo P1 = new LoginPojo("jatinvsharma@gmail.com","123123123")	;
		
	baseURI = TestUtil.ReadFile("dev.properties","URL" ) ;

	
	Header h = new Header("Content-Type","application/json");
//Response x =  given().header(h).and().body(P1.toJson())when().post("/user/signin").then().log().all();
   // System.out.println(x.asPrettyString());
	given().header(h).and().body(P1.ToJson()).when().post("/user/signin").then().log().all().and()
	.assertThat().statusCode(200).and()
	.body("data.user.id",Matchers.equalTo(2) )
	.body("data.user.role", Matchers.equalToIgnoringCase("admin"))
	.body("data.user.name", Matchers.equalTo("Jatin Sharma"))
	.body("data.user.mobile_number", Matchers.equalTo("1231231231")) 
	.body("data.user.email", Matchers.equalTo("jatinvsharma@gmail.com")) ;
	
	;;;;;
	
	}
}

