package Pojo;

import com.google.gson.Gson;

public class UpdateProdPOJO implements Ibody{

	private String  prod_name  ;
	
	private String prod_desc  ;
	
	private String  prod_price   ;

	public UpdateProdPOJO(String prod_name, String prod_desc, String prod_price) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_price = prod_price;
	}

	public String ToJson() {
	UpdateProdPOJO x = new UpdateProdPOJO(prod_name, prod_desc, prod_price)   ;
	Gson g = new Gson()   ;
	String update =	g.toJson(x)   ;
	return update   ;
	}
	
	
}
