package dec12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Advancereports {
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void generateReport() {
		report = new ExtentReports("./ExtentReport/Deomo.html");
		
	}
	@Test
	public void passTest()
	{
		test=report.startTest("Test pass", "test demo pass");
		test.log(LogStatus.PASS, "test case is pass");
	}
	@Test
	public void FailedTest()
	{
		test=report.startTest("Test failed", "test demo failed");
		test.log(LogStatus.FAIL, "test case is failed");
	}
	@Test
	public void SkipTest()
	{
		test=report.startTest("Test skip", "test demo skip");
		test.log(LogStatus.SKIP, "test case is skip");
	}
	@AfterMethod
	public void tearDown() {
		report.endTest(test);
		report.flush();
	}
}
