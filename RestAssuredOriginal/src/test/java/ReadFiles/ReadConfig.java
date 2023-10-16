package ReadFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	public static void main(String[] args) throws Exception {
		
	File f = new File(System.getProperty("user.dir")+ "dev.properties");
	
	FileReader reader = new FileReader(f) ;
	
	Properties p = new Properties();
	
	p.load(reader);
	
	String   s=  p.getProperty("URL") ;
	
	
	System.out.println(s);
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
