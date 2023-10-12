package Day2_Request_Body_creation;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.response.Response;

public class Marhaba {
	
	public String country_code = "+91"; 
	public String mobile = "7697266666";
	public String Vehictype = "car";
	public String reqtype= "ride";
	public String token;
	public String dr_no = "9977453004";
	public String dr_ccode = "+91";
	public String dr_password = "12345678";
	public String CustStartlat = "21.8382672285633";
	public String CustStartlong = "73.7191800975202";
	public String startloc = "Statue of Ram";
	public String otp;
	@Test(priority = 3)
	void customerLogin() {

		CustomerLoginPojo p = new CustomerLoginPojo();
		p.setType("customer");
		p.setCountry_code(country_code);
		p.setMobile_number(mobile);
		p.setPassword("12345678");
		Response Re = given().contentType("application/json").body(p).when()
				.post("https://thernd.tech/adminTest/api/login");

		Re.then().log().all();
		Re.then().body("message", Matchers.equalTo("Login Successfully"));
		otp = Re.jsonPath().getString("otp");
		 Re.then().log().all();
		Re.then().statusCode(200);
		System.out.println("Customer login otp: "+otp);

	}

	@Test(priority = 4)
	void verifyOTP() {

		Verify_OTP_POJO p1 = new Verify_OTP_POJO();
		p1.setOtp(otp);
		p1.setCountry_code(country_code);
		p1.setMobile_number(mobile);
		p1.setType("customer");

		Response re2 = given().contentType("application/json").body(p1).when()
				.post("https://thernd.tech/adminTest/api/verify-otp");

		token = re2.jsonPath().getString("token");
		// re2.then().log().all();
		re2.then().body("message", Matchers.equalTo("Login Successfully"));
		re2.then().statusCode(200);

		System.out.println("Customer token:"+token);

	}

	String reqid;

	@Test(priority = 5)
	void rideRequest() {
		Ride_requestPOJO p = new Ride_requestPOJO();
		p.setType(Vehictype);
		p.setCustomer_start_lat(CustStartlat);
		p.setCustomer_start_lng(CustStartlong);
		p.setStart_location(startloc);
		p.setCustomer_dest_lat("23.18364796154174");
		p.setCustomer_dest_lng("75.77301791964992");
		p.setDest_location("Mahakaleshwar");
		p.setTotal_distance("500km");
		p.setTotal_payable("200");
		p.setSahal_commission("10");
		p.setSurge_time("1");
		p.setDiscount("30");
		p.setBase_fare("20");
		p.setDuration("5");

		Response re3 = given().contentType("application/json").header("Authorization", "Bearer " + token).body(p).when()
				.post("https://thernd.tech/adminTest/api/ride_request");

		reqid = re3.jsonPath().getString("req_id");
//		re3.then().log().all();
		System.out.println("Ride request id :"+reqid);
	}

	@Test(priority = 6)
	public void searchDriver() {
		Search_Driver_POJO p = new Search_Driver_POJO();
		p.setReqId(reqid);
		p.setReqType(reqtype);
		p.setVehicle(Vehictype);
		
		System.out.println("Driver Searching");

		Response re3 = given().contentType("application/json").header("Authorization", "Bearer " + token).body(p).when()
				.post("https://thernd.tech/adminTest/api/driverSearch");

		re3.then().log().all();

	}

	String drivertoken;
	String driveruserid;

	@Test(priority = 1)
	void loginDriver() {
		Driver_LoginPOJO d = new Driver_LoginPOJO();
		d.setType("driver");
		d.setMobile_number(dr_no);
		d.setPassword(dr_password);
		d.setCountry_code(dr_ccode);

		Driver_LoginPOJO p = new Driver_LoginPOJO();
		Response req = given().contentType("application/json").body(d).when()
				.post("https://thernd.tech/adminTest/api/login");
		
		req.then().log().all();
		drivertoken = req.jsonPath().getString("token");

		driveruserid = req.jsonPath().getString("user_id");
		System.out.println("Driver token : "+drivertoken);
		

	}

	@Test(priority = 2)
	void setDriverlocation() {

		SetDriverLoc_POJO p = new SetDriverLoc_POJO();
		p.setUser_id(driveruserid);
		p.setType("driver");
		p.setLat(CustStartlat);
		p.setLong1(CustStartlong);
		p.setLocation(startloc);

		Gson g = new Gson();
		String data = g.toJson(p);

		Response req = given().contentType("application/json").header("Authorization", "Bearer " + drivertoken)
				.body(data).when().post("https://thernd.tech/adminTest/api/driver-location");

		// req.then().log().all();

	}
  
	
	String rideotp;
	@Test(priority = 7)
	void driverRideAction() {

		DriverRideActionPOJO p = new DriverRideActionPOJO();

		p.setRequest_id(reqid);
		p.setRequest_type(reqtype);
		p.setAction("1");
		
		Response req = given().contentType("application/json").header("Authorization", "Bearer " + drivertoken)
				.body(p).when().post("https://thernd.tech/adminTest/api/rideActions");	
		
		req.then().log().all();
	//	rideotp= req.jsonPath().getString("otp");
		
	}
//////////////////////////////////////////////////////////////////////////////////////////	
	String Rideacceptotp;
	@Test(priority = 8)
	void getRideOTP() {
		
		GetRideOTP p = new GetRideOTP();
		
		p.setReq_id("1465");
		p.setReq_type("ride");
		
	//	Response req = given().contentType("application/json").header("Authorization", "Bearer " + drivertoken)
	//			.body(p).when().post("https://thernd.tech/adminTest/api/rideActions");	
		
		Response req = given().contentType("application/json").header("Authorization", "Bearer " +token)
				.body(p).when().post("https://thernd.tech/adminTest/api/search_accepted_req");	
		
		req.then().log().all();
     Rideacceptotp = req.jsonPath().getString("otp");
	}
	
	
	@Test(priority =9 ,enabled = true)
	void startRideByDriver() {
		DriverStartRidePOJO p = new DriverStartRidePOJO();
		p.setOtp(Rideacceptotp);
		
	Response req = given().contentType("application/json").header("Authorization", "Bearer " + drivertoken)
			.body(p).when().post("https://thernd.tech/adminTest/api/toStartRideVerifyOtp");
	   
		req.then().log().all();
		
	}
	
	
	
	
	
	

}
