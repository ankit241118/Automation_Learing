package Pojo;

import com.google.gson.Gson;

public class LoginPojo implements Ibody {

	
  private 	String email ;
  private 	String password ;

  
  
  public LoginPojo(String email, String password) {
	super();
	this.email = email;
	this.password = password;
}	
	
	
		public String ToJson() {
		LoginPojo l = new LoginPojo(email,password )  ;
		Gson g = new Gson()  ;
	  String data = g.toJson(l)  ;
		return data;

		
		}}
