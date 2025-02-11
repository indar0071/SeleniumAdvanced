package test.timer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplecitWaitTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://ofss-mum-5055.snbomprshared1.gbucdsint02bom.oraclevcn.com:7020/?page=login-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='login_username|input']")).sendKeys("wthadmin");
		driver.findElement(By.xpath("//input[@id='login_password|input']")).sendKeys("LandS2022$");
		driver.findElement(By.xpath("//span[contains(text(), 'LOG IN')]")).click();

	}

}
