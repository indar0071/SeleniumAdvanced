package testng.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGInvocationC {
	WebDriver webdriver;
	@Test(invocationCount = 2)
	public void verifyLoginLogout()  throws Throwable{
		webdriver= new ChromeDriver();
		webdriver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		webdriver.manage().window().maximize();
		webdriver.findElement(By.name("txtUsername")).sendKeys("Admin");
		webdriver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		webdriver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		//Reporter.log(" pre condition ::", true);
		Thread.sleep(5000);
		webdriver.close();
	}

}
