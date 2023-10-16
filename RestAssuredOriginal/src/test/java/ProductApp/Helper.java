package ProductApp;

import static io.restassured.RestAssured.*;

import Pojo.Ibody;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import util.TestUtil;

public class Helper {

	public Response Makerequest(String endpoint, Ibody body, Httpverb verb, Header... header) throws Exception {
		Response response= null;
		baseURI = TestUtil.ReadFile("dev.properties", "URL");

		if (verb == Httpverb.POST) {

			response = given().body(body).headers(new Headers(header) ).when().post(endpoint);
					}
		else if (verb == Httpverb.PUT) {
			response = given().body(body).headers(new Headers(header) ).when().put(endpoint);	
		}
		
		else if (verb == Httpverb.GET) {
			response = given().headers(new Headers(header) ).when().get(endpoint);	
		}
		else if (verb == Httpverb.DELETE) {
			response = given().body(body).headers(new Headers(header) ).when().delete(endpoint);	
		}
		return response ;
		
	}}