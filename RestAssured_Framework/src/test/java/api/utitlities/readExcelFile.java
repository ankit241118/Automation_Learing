package api.utitlities;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelFile {

	public static String[][] getData() throws InvalidFormatException, IOException {
		File file = new File(System.getProperty("user.dir") + "\\InputData\\test.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet mysheet = book.getSheet("sheet1");
		int lastrowindex = mysheet.getLastRowNum();
		int lastcolumnnumber = mysheet.getRow(0).getLastCellNum();
        DataFormatter f = new DataFormatter();
		String[][] data = new String[lastrowindex][lastcolumnnumber];
		System.out.println(lastrowindex);
		System.out.println(lastcolumnnumber);
		
		XSSFRow row;
		String cell;
		for (int x = 1; x <= lastrowindex; x++) {
			row = mysheet.getRow(x);
			for (int y = 0; y < lastcolumnnumber; y++) {
			String d = f.formatCellValue(row.getCell(y));
				data[x-1][y]= d.toString();
			}

		}
		return data;

	}

}
