package testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotation1 {
	WebDriver webdriver;
	@BeforeTest
	public void preCondtion()throws Throwable {

		webdriver= new ChromeDriver();
		webdriver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.name("txtUsername")).sendKeys("Admin");
		webdriver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		webdriver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		Reporter.log(" pre condition ::", true);
		Thread.sleep(5000);
		
	}
	@Test(description = "timeLink test",priority = 0,enabled = true)
	public void timeLink()throws Throwable {
		webdriver.findElement(By.xpath("//b[contains(text(),'Time')]")).click();
		Reporter.log("Time link ::", true);
		Thread.sleep(5000);
	}
	@Test(description = "pimLink test",priority = 1,enabled = true)
	public void pimLink()throws Throwable {
		webdriver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		Reporter.log("PIM link ::", true);
		Thread.sleep(5000);
	}
	@Test(description = "leaveLink test",priority = 2,enabled = true)
	public void leaveLink()throws Throwable {
		webdriver.findElement(By.xpath("//b[contains(text(),'Leave')]")).click();
		Reporter.log("Leave link ::", true);
		Thread.sleep(5000);
	}
	@AfterTest(alwaysRun = true)
	public void tearDown() throws Throwable
	{
		webdriver.quit();
	Reporter.log("Post condtion ::", true);
	
	Thread.sleep(5000);
	}

}
