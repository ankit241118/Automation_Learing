package DataProvider;

import java.util.Iterator;

import org.testng.annotations.DataProvider;

import util.TestUtil;

public class LoginDataProvider {

	@DataProvider(name = "logindataprov")
	public static Iterator<String[]> logindataprov() {

		return TestUtil.readCfile("logincred.csv");

	}
}
