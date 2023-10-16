package Pojo;

import org.testng.annotations.Test;

import com.google.gson.Gson;

public class AddprodPOJO implements Ibody{
  
	
	
	private String prod_name   ;
	private String prod_desc   ;
	private String prod_price   ;
	
	
	
	public AddprodPOJO(String prod_name, String prod_desc, String prod_price) {
		super();
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_price = prod_price;
	}
	
	

	public String ToJson() {
		AddprodPOJO ad = new AddprodPOJO(prod_name, prod_desc, prod_price);	
		Gson gs = new Gson()  ;
		
		String addproddata  = 	gs.toJson(ad);
		return addproddata ;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
