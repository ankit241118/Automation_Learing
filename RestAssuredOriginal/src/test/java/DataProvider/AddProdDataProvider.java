package DataProvider;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

import util.TestUtil;

public class AddProdDataProvider {
	
	
	@DataProvider (name = "AddProdData")
	public static String [][] AddProdData() {
		
	return 	TestUtil.readexcel1() ;
		
	}
	


}
