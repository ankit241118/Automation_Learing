package api.utitlities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestReporter {
public ExtentReports getReporterObject() {
	File file = new File(System.getProperty("user.dir") + "\\reports\\testreport.html");
	ExtentSparkReporter reporter = new ExtentSparkReporter(file);
	reporter.config().setDocumentTitle("Test Execution Report");
	reporter.config().setReportName("Pet shop API Test Report");
	ExtentReports r = new ExtentReports();
    r.attachReporter(reporter);
	r.setSystemInfo("QA engineer", "Ankit Kayasth");
	return r;
	
	
}}
