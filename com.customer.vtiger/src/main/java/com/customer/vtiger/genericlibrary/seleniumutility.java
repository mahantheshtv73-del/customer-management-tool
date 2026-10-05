package com.customer.vtiger.genericlibrary;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * this class is a generic class which is having generic methods for selenium
 */
public class seleniumutility {
	/**
	 * @author Mahanthesh T V
	 * 
	 * this method is a genric method used to maximize the browser
	 * @param d
	 */
	public void maxi_brow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * 
	 *@author Mahanthesh T V
	 *this method is used to wait for a element until it is visible
	 * @param w
	 */
	public void add_wait_con(WebDriver w) {
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * 
	 * @author Mahanthesh T V
	 * this method is used to navigate to particular application
	 * @param n
	 * @param u
	 */
	public void navigate_url(WebDriver n,String u) {
		n.get(u);
	}
	
	/**
	 * this method  is used to mouse over 
	 * @param m
	 * @param ele
	 */
	public void mouse_ouver(WebDriver m,WebElement ele) {
		Actions a=new Actions(m);
		a.moveToElement(ele).perform();
		
	
	}
	public void doubleclick(WebDriver m,WebElement ele) {
		Actions a=new Actions(m);
		a.doubleClick(ele).perform();
		
	
	}
	public void rightclick(WebDriver m,WebElement ele) {
		Actions a=new Actions(m);
		a.contextClick(ele).perform();
		
	
	}
	public void dragandgrop(WebDriver m,WebElement ele,WebElement target) {
		Actions a=new Actions(m);
		a.dragAndDrop(ele,target).perform();
		
	
	}
	
	public void scroll(WebDriver driver,int xaxis,int yaxis) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	public void selectoptionbycontains(WebElement address,String text) {
		Select s = new Select(address);
		s.selectByContainsVisibleText(text);
	}
	
	public void handlealertpopuponok(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public void handlealertpopuponcancle(WebDriver driver) {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
}
