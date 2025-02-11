package testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupDependsTest {

	WebDriver driver;
@BeforeTest	
	public void setUp() throws Throwable {
	driver= new ChromeDriver();
	driver.get("https://www.javatpoint.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
		
	}
@Test(groups ="javalearning")
public void javaFun()throws Throwable {
	
	driver.findElement(By.xpath("//body/div[@id='link']/div[1]/ul[1]/li[3]/a[1]")).click();
	Thread.sleep(5000);
}
@Test(dependsOnMethods ="javaFun")
public void javaScriptFun()throws Throwable {
	
	driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
	Thread.sleep(5000);
}
@Test(dependsOnMethods ="javaScriptFun")
public void SQLFun()throws Throwable {
	
	driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]")).click();
	Thread.sleep(5000);
}
@AfterTest
public void tearDown() {
	driver.close();
}
}
