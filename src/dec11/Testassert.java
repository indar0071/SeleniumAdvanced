package dec11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testassert {
	WebDriver driver;
	@Test
	public void verifyTest()
	{
		driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		//String expected="Google";
		String expected="gmail";
		String actual=driver.getTitle();
		//Assert.assertEquals(actual, expected, "title not matched"); // when titile is match
		//when title is not matched
	
		try {
			//Assert.assertEquals(actual, expected, "title not matched");
			//Assert.assertFalse(expected.equals(actual), "title is matched"); //when condition is true
			Assert.assertTrue(expected.equals(actual), "title is not matched"); //when condition is false
		}catch(Throwable e) {
			System.out.println(e.getMessage());
		}
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
