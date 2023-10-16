package ProductApp;

import static io.restassured.RestAssured.*;

import Pojo.AddprodPOJO;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class AddProdOptimised {
	
	
	public static void main(String[] args) {
		
		
		
		AddprodPOJO obj = new AddprodPOJO("Tata ", "Punch","19900") ;
		baseURI = "http://139.59.91.96:3000"  ;
		
		Header h1 = new Header("Content-Type","application/json");
		Header h2 = new Header("Authorization","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0X21vZGlmaWVkIjoxNjQ5MjI2MzExNjE4LCJleHBpcmVfYXQiOjE2NTQ0MTAzMTE2MTgsInBheWxvYWQiOnsiaWQiOjIsIm5hbWUiOiJKYXRpbiBTaGFybWEiLCJlbWFpbCI6ImphdGludnNoYXJtYUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJtb2JpbGVfbnVtYmVyIjoiMTIzMTIzMTIzMSJ9fQ.XSByxJq3xwPPGIw7VNGpMad22tvaT9s7O4yA_G_7HSw");
	    Headers h = new Headers(h1,h2);
		
		
		
		
	Response r2 = 	given().when().headers(h).and().body(obj.ToJson()).post("/api/v1/products/") ;	
	
	System.out.println(r2.asPrettyString());
		
		
	}

}
