package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class TestUtil {
	
	

	public static String ReadFile  (String filename, String URLname) throws Exception {
		
	File f = new File( System.getProperty("user.dir")+"\\Config\\"+filename);
	
	FileReader reader = new FileReader(f) ;
	
	Properties p = new Properties();
	
	p.load(reader);
	
	String   s=  p.getProperty(URLname) ;
	
	return s ;
	
}
	
	public static Iterator<String[]> readCfile (String filename) {
    
		
		File f = new File(System.getProperty("user.dir")+"\\Test_Data\\" + filename) ; 
	    Reader reader = null;
	    CSVReader readcsv = null ;
	    List <String []> data = null ;
	    
		try {
			reader = new FileReader(f);
			readcsv = new CSVReader(reader) ;
			data = readcsv.readAll()   ;
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
			
		 catch (IOException | CsvException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       	Iterator <String []> data2 =   data.iterator() ;
       	data2.next() ;
	    return data2 ;
		
	}
	

public static String[][] readexcel1() {
	
	XSSFWorkbook mybook = new XSSFWorkbook(
			System.getProperty("user.dir") + "\\\\Test_Data\\\\New Microsoft Excel Worksheet.xlsx");

	XSSFSheet mysheet = mybook.getSheet("Sheet1");

	XSSFRow myrow = mysheet.getRow(1);

	XSSFCell mycell = myrow.getCell(0);

//System.out.println(mycell);	

	int Lastrowindex = mysheet.getLastRowNum(); // gives the index, starts from zero

	XSSFRow RowHeader = mysheet.getRow(0);

	int Lastcolumnnumber = RowHeader.getLastCellNum(); // index of last column will be lastcolumnnumber-1
	XSSFCell mycell1;
	int columnindex;
	int rowindex;
	
String [][] mydata = new String [Lastrowindex] [Lastcolumnnumber]  ;	
	for (rowindex = 0; rowindex <= Lastrowindex; rowindex++) {
		for (columnindex = 0; columnindex < Lastcolumnnumber; columnindex++) {
			myrow = mysheet.getRow(rowindex);
			mycell1 = myrow.getCell(columnindex);
			
			
  	mydata [rowindex][columnindex] = mycell.toString() ;
		}
		
		return mydata ;
		

	}

}
	
}	
	
	
	
	
	
	
}
