package organization;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.customer.vtiger.genericlibrary.baseclass;
import com.customer.vtiger.genericlibrary.fileutilityclass;
import com.customer.vtiger.genericlibrary.javautility;
import com.customer.vtiger.genericlibrary.listenerimplimentation;
import com.customer.vtiger.genericlibrary.seleniumutility;

import objectrepository.homepage;
import objectrepository.organizationpage;
@Listeners(listenerimplimentation.class)
public class createorganization extends baseclass {
	seleniumutility s = new seleniumutility();
	javautility j = new javautility();
	@Test
	public void createorg() throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		organizationpage h = new organizationpage(driver);
		h.getOrganization().click();
		h.getPlueicon().click();
		fileutilityclass f = new fileutilityclass();
		javautility j = new javautility();
		int random = j.generaterandomnumber(100);
		String orgname = f.readdatafromexcelforstring("orgdata", 1, 1);
		
	
		h.getOrganizationname().sendKeys(orgname+random);
		String email = f.readdatafromexcelforstring("orgdata", 1, 2);
		h.getEmail().sendKeys(email);
	WebElement add = h.getIndustry();
	
	s.selectoptionbycontains(add, "Communications");
	WebElement add1 = h.getAccounttype();
	Select s1 = new Select(add1);
	s1.selectByContainsVisibleText("Competitor");
	String billingaddress = f.readdatafromexcelforstring("orgdata", 1,3 );
	String billingassre = f.readdatafromexcelforstring("orgdata", 1,4);
	String billcity = f.readdatafromexcelforstring("orgdata", 1,5 );
	String shipcity = f.readdatafromexcelforstring("orgdata", 1,6 );
	h.getBill_state().sendKeys(billingaddress);
	h.getBill_country().sendKeys(billingassre);  //a[text()='modfin53']/parent::td/parent::td/preceding-sibling::td/child::input
	h.getBill_city().sendKeys(billcity);
	h.getShip_state().sendKeys(shipcity);
	h.getSave().click();
	Thread.sleep(9000);           
	}
	
	@Test
	public void deleteorganization() throws InterruptedException {
		organizationpage h = new organizationpage(driver);
		h.getOrganization().click();

		h.getSelectdeleteicon().click();
		h.getDelete().click();
		s.handlealertpopuponok(driver);
		Thread.sleep(6000);
	}
	

}
