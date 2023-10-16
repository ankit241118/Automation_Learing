package ProductApp;

import Pojo.AddprodPOJO;
import Pojo.Ibody;
import Pojo.LoginPojo;
import Pojo.UpdateProdPOJO;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Runner {

	public static void main(String[] args) throws Exception {
		String token;

		Helper h = new Helper();

		Ibody body = new LoginPojo("jatinvsharma@gmail.com", "123123123");
		Response rr = h.Makerequest("/user/signin", body, Httpverb.POST,
				new Header("Content-Type", "Application/Json"));

		token = rr.then().extract().jsonPath().getString("data.token");
		System.out.println(rr.asPrettyString());

		Ibody body2 = new AddprodPOJO("Samsung", "Mobile00", "1000");

		Response r2 = h.Makerequest("/api/v1/products/", body2, Httpverb.POST,
				new Header("Content-Type", "Application/Json"), new Header("Authorization", token));
		System.out.println(r2.asPrettyString());
		int id = r2.then().extract().jsonPath().get("data.id");

		Ibody body3 = new UpdateProdPOJO("nokia", "qwee", "10025565");

		Response r3 = h.Makerequest("/api/v1/products/" + id, body3, Httpverb.PUT,
				new Header("Content-Type", "Application/Json"), new Header("Authorization", token));

		System.out.println(r3.asPrettyString());

		Response r4 = h.Makerequest("/api/v1/products/search/" + id, null, Httpverb.GET,
				new Header("Content-Type", "Application/Json"), new Header("Authorization", token));

		System.out.println(r4.asPrettyString());

	}
}
