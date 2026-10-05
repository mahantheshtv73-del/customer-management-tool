package com.customer.vtiger.genericlibrary;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listenerimplimentation extends baseclass implements ITestListener{
	ExtentReports repots;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getName();
		repots.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		test.log(Status.PASS, name+"---test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		TakesScreenshot t = (TakesScreenshot) driver;
	File src = t.getScreenshotAs(OutputType.FILE);
	javautility j = new javautility();
	 String dateandtime = j.getdataandtime("hh-mm-ss dd-MM-yyyy");
	 File dest = new File("./screenshot/"+name+" "+dateandtime+".png");
	 try {
		Files.copy(src.toPath(), dest.toPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 test.log(Status.FAIL, name+"--test failes--");
	
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		test.log(Status.SKIP, name+"---test skipped---");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		ExtentSparkReporter report = new ExtentSparkReporter("./reports/vtiger.html");
		report.config().setDocumentTitle("vtiger");
		report.config().setReportName("vtiger execute report");
		report.config().setTheme(Theme.STANDARD);
		 repots = new ExtentReports();
		 repots.attachReporter(report);
		 repots.setSystemInfo("url", "http://localhost:8888");
		  repots.setSystemInfo("browser", "chrome");
		  repots.setSystemInfo("testenginername", "Mahanthesh t v");
		  repots.setSystemInfo("Os", "window");
		 
		
	}

	@Override
	public void onFinish(ITestContext context) {
		repots.flush();
	}

	
   
	
	

}
