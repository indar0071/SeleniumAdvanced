package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\GIB\\ARIOS\\AutomationTesting\\ADMIN\\Browsers\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.javatpoint.com/method-overriding-in-java");
		

	}

}
