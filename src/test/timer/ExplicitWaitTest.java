package test.timer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://ofss-mum-5055.snbomprshared1.gbucdsint02bom.oraclevcn.com:7020/?page=login-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='login_username|input']")));
		driver.findElement(By.xpath("//input[@id='login_username|input']")).sendKeys("wthadmin");
		driver.findElement(By.xpath("//input[@id='login_password|input']")).sendKeys("LandS2022$");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'LOG IN')]")));
		driver.findElement(By.xpath("//span[contains(text(), 'LOG IN')]")).click();
		System.out.println("log in from application");
		driver.findElement(By.xpath("//span[@id='profileLauncher']")).click();
		driver.findElement(By.xpath("//*[@id=\"profileLauncherPopup\"]/div/div/div/ul/li[2]/a/span[2]")).click();
		System.out.println("log out from application");
		driver.close();

	}

}
