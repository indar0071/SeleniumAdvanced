package dec12;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReprotsTest {

	// WebDriver driver;
	 ExtentReports report;
	 ExtentTest test;
	 
	@BeforeTest
	public void generateReport()
	{
		report= new ExtentReports("./ExtentReport/Demo1.html");
		
	}
	@Test
	public void passTest() {
		test=report.startTest("Pass test");
		test.log(LogStatus.PASS, "test case pass log");
	}
	@Test
	public void unknownTest()
	{
		test= report.startTest("unknownTest test", "test case reprot unknown");
		test.log(LogStatus.UNKNOWN, "test case unknown status");
	}
	@AfterMethod
	public void tearDown()
	{
		report.endTest(test);
		report.flush();
	}
	
}
