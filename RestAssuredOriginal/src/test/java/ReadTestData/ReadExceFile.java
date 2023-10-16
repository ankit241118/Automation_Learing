package ReadTestData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceFile {

	public static void main(String[] args) throws IOException {

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
		for (rowindex = 0; rowindex <= Lastrowindex; rowindex++) {
			for (columnindex = 0; columnindex < Lastcolumnnumber; columnindex++) {
				myrow = mysheet.getRow(rowindex);
				mycell1 = myrow.getCell(columnindex);
				System.out.print(mycell1.toString()+ " " );
			}
			System.out.println("");

		}

	}
}