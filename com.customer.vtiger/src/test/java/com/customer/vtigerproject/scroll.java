package com.customer.vtigerproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.customer.vtiger.genericlibrary.seleniumutility;

public class scroll {
	@Test
	public void scroll() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com");
		seleniumutility s= new seleniumutility();
		s.scroll(driver, 0, 3000);
		
		Thread.sleep(5000);
		s.scroll(driver, 0, -3000);
		
	}

}
