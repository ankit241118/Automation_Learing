package ProductApp;

import static io.restassured.RestAssured.*;

import Pojo.UpdateProdPOJO;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import util.TestUtil;

public class UpdateProduct {
	
	
	
	public static void main(String[] args) throws Exception {
		
		baseURI =   TestUtil.ReadFile("dev.properties", "URL") ;
		
		Header h1 = new Header("Content-Type","application/json");
		Header h2 = new Header("Authorization","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0X21vZGlmaWVkIjoxNjQ5MjI2MzExNjE4LCJleHBpcmVfYXQiOjE2NTQ0MTAzMTE2MTgsInBheWxvYWQiOnsiaWQiOjIsIm5hbWUiOiJKYXRpbiBTaGFybWEiLCJlbWFpbCI6ImphdGludnNoYXJtYUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJtb2JpbGVfbnVtYmVyIjoiMTIzMTIzMTIzMSJ9fQ.XSByxJq3xwPPGIw7VNGpMad22tvaT9s7O4yA_G_7HSw");
	    Headers h = new Headers(h1,h2);
		
		
	 Response updatedprod =   given().when().headers(h).and().body(new UpdateProdPOJO("LG2", "1234","10000")).put("/api/v1/products/23546980")    ;
		
		System.out.println(updatedprod.asPrettyString());
	
}
}
