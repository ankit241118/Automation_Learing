
package ProductApp;

import  io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class loginOrignal {

	
	public static void main(String[] args) {
		
		
		
	RestAssured.baseURI = "http://139.59.91.96:3000" ;
	RequestSpecification x =  RestAssured.given();
	

	Header h = new Header("Content-Type","application/json");
	
    x.header(h) ;
     
     x.body("     {\"email\":\"jatinvsharma@gmail.com\",\"password\":\"123123123\"}              ");
	
    Response  r = x.post("/user/signin") ;
    
    System.out.println(r.asPrettyString());
     
		
	}
}
