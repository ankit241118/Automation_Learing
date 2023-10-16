package ProductApp;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProd {
	
	public static void main(String[] args) {
		
		
		
		RestAssured.baseURI = "http://139.59.91.96:3000" ;
		RequestSpecification x =  RestAssured.given();
		

		Header h1 = new Header("Content-Type","application/json");
		Header h2 = new Header("Authorization","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0X21vZGlmaWVkIjoxNjQ5MDYxNTgyMDUyLCJleHBpcmVfYXQiOjE2NTQyNDU1ODIwNTMsInBheWxvYWQiOnsiaWQiOjIsIm5hbWUiOiJKYXRpbiBTaGFybWEiLCJlbWFpbCI6ImphdGludnNoYXJtYUBnbWFpbC5jb20iLCJyb2xlIjoiYWRtaW4iLCJtb2JpbGVfbnVtYmVyIjoiMTIzMTIzMTIzMSJ9fQ.kFO3Tr_TpGBuSRCKNnL0EwG6Ve0DRjP3yHL1Xp_iJIA");
	    Headers h = new Headers(h1,h2);
		x.headers(h) ;
	     
	     x.body(" {\r\n"
	     		+ "\"prod_name\": \"Samsung\", \r\n"
	     		+ "\"prod_desc\": \" M32\",\r\n"
	     		+ "\"prod_price\": 1111\r\n"
	     		+ "\r\n"
	     		+ "}              ");
		
	    Response  r = x.post("/api/v1/products/") ;
	    
	  System.out.println(r.asPrettyString()); }}