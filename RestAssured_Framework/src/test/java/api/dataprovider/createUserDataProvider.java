package api.dataprovider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import api.utitlities.readExcelFile;


public class createUserDataProvider {
	@DataProvider()
	String[][] getDataforcreateUser() throws InvalidFormatException, IOException {
		return readExcelFile.getData();

	}
}
