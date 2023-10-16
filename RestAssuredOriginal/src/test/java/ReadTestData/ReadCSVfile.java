package ReadTestData;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class ReadCSVfile   {
	
	public static void main(String[] args) throws IOException, CsvException {
		File f = new File(System.getProperty("user.dir")+"\\Test_Data\\logincred.csv") ; 
		
		
		Reader  reader = new FileReader(f) ;
		
		try (CSVReader readcsv = new CSVReader(reader)) {
			List <String []> data = readcsv.readAll()   ;
				
				for(String [] data1 : data) { for(String x : data1) { System.out.println(x);   }   }
		}
				
		
		
	}
	

}
