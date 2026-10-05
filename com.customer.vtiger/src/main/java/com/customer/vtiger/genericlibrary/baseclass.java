package com.customer.vtiger.genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.helpers.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import objectrepository.loginpage;

public class baseclass {
	public static WebDriver driver;
	
	projectmethods p = new projectmethods();
	seleniumutility s = new seleniumutility();
	@BeforeSuite
	public void dabaseconnection() {
		org.testng.
		Reporter.log("database connected successfully",true);
	}
	
	@Parameters("browser")
	
	@BeforeTest
	public void lunchbrowser(@Optional("chrome") String Browser) throws IOException {
		
		if (Browser.equals("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if (Browser.equals("edge")) {
			driver = new EdgeDriver();
			
		}
		else {
			driver = new ChromeDriver();
		}
		 
		s.maxi_brow(driver);
		s.add_wait_con(driver);
		FileInputStream f = new FileInputStream("./src/test/resources/testdata/commdata.properties");
		Properties p =new Properties();
		p.load(f);
		String URL = p.getProperty("URL");
		
		
		
		driver.get(URL);
	}
	
	@BeforeMethod
	public void loginapplication() throws IOException {
	String un	= p.m("username");
	String psw = p.m("password");
	loginpage l = new loginpage(driver);
	l.getUsernametbx().sendKeys(un);
	l.getPasswordtxb().sendKeys(psw);
	l.getIdbtn().click();
	org.testng.Reporter.log("login successfully",true);
	
		
	}

	
	@AfterMethod
	
	public void logoutapplication() {
		WebElement ele = driver.findElement(By.xpath("//img{@src='themes/softed/images/user.PNG']"));
		s.mouse_ouver(driver, ele);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		org.testng.Reporter.log("LOGIN OUTIN THE CMT SUCCESFULLY",true);
	}
	
	@AfterTest
	public void closebrowseR() {
		driver.quit();
	}
	
	@AfterSuite
	public void disconnectwithdatabase() {
		org.testng.Reporter.log("disconnect with database",true);
	}
}


