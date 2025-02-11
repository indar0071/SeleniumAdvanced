package testng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demotestng {
	@Test
	  public void login() {
		  Reporter.log("executing login test", true);
	  }
	@Test
	  public void compose() {
		  Reporter.log("executing compose test", true);
	  }
	@Test
	  public void reply() {
		  Reporter.log("executing reply test", true);
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  Reporter.log("executing beforeMethod", true);
	  }

	  @AfterMethod
	  public void afterMethod() {
		  Reporter.log("executing afterMethod", true);
	  }

	  @BeforeClass
	  public void beforeClass() {
		  Reporter.log("executing beforeclass", true);
	  }

	  @AfterClass
	  public void afterClass() {
		  Reporter.log("executing after class", true);
	  }

	  @BeforeTest
	  public void beforeTest() {
		  Reporter.log("executing before test", true);
	  }

	  @AfterTest
	  public void afterTest() {
		  Reporter.log("executing after test", true);
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  Reporter.log("executing before suite", true);
	  }

	  @AfterSuite
	  public void afterSuite() {
		  Reporter.log("executing after suite", true);
	  }

	}
