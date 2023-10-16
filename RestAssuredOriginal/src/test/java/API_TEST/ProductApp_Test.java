package API_TEST;

import static org.testng.annotations.Test.*;

import org.testng.annotations.Test;

import DataProvider.LoginDataProvider;
import Pojo.AddprodPOJO;
import Pojo.Ibody;
import Pojo.LoginPojo;
import Pojo.UpdateProdPOJO;
import ProductApp.Helper;
import ProductApp.Httpverb;
import io.restassured.http.Header;
import io.restassured.response.Response;


public class ProductApp_Test {
	Helper h = new Helper();
	String token ; 
	int id ;
	
	@Test(description = "Verify that user is able to login into application", priority = 1 )
	public void LoginTest() throws Exception {
	Ibody body = new LoginPojo("jatinvsharma@gmail.com", "123123123");
	Response rr = h.Makerequest("/user/signin", body, Httpverb.POST,new Header("Content-Type", "Application/Json"));
	 token =	rr.then().log().all(). assertThat().statusCode(200 ).extract().jsonPath().get("data.token");
	 System.out.println(token);
	}
	
	
	@Test(description = "Verify that user is able to add products", priority = 2, dataProviderClass = DataProvider.AddProdDataProvider.class, dataProvider = "AddProdData")
	public void AddproductTest(String prod_name, String prod_desc, String prod_price) throws Exception {
	Ibody body2 = new AddprodPOJO(prod_name, prod_desc, prod_price);
	Response r2 = h.Makerequest("/api/v1/products/", body2, Httpverb.POST, new Header("Content-Type","Application/Json"), new Header("Authorization",token )) ;
	id =	r2. then().log().all(). assertThat().statusCode(200).extract().jsonPath().get("data.id");
		}
	
	@Test (description = "Verify user is able to search product", priority = 3)
	public void SearchProduct() throws Exception {
	h.Makerequest("/api/v1/products/search/" + id, null, Httpverb.GET,  new Header("Content-Type","Application/Json"), new Header("Authorization",token )).then().log().all()
	.assertThat().statusCode(200);	}
		
	
	@Test (description = "Verify user is able to update the product", priority = 4 )
	public void UpdateProduct() throws Exception {
	Ibody body3 = new UpdateProdPOJO("Tata Nexon", "EV", "1400000") ;
	Response r3 = h.Makerequest("/api/v1/products/"+id, body3, Httpverb.PUT, new Header("Content-Type","Application/Json"), new Header("Authorization",token )) ;
	r3.then().log().all().assertThat().statusCode(200)
	;
	}
	
	@Test (description = "Verify user is able to search product", priority = 5)
	public void SearchProductAfter() throws Exception {
	h.Makerequest("/api/v1/products/search/" + id, null, Httpverb.GET,  new Header("Content-Type","Application/Json"), new Header("Authorization",token )).then().log().all()
	.assertThat().statusCode(200);	}
		
	
}



 