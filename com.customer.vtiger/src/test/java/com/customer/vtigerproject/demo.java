package com.customer.vtigerproject;

import org.testng.annotations.Test;

import com.customer.vtiger.genericlibrary.baseclass;

import objectrepository.homepage;

public class demo extends baseclass {
	
	@Test
	public void login() {
		homepage h = new homepage(driver);
		h.getprofileelement().click();
	}
	
	

}
