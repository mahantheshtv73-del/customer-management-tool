package opportunity;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.customer.vtiger.genericlibrary.baseclass;
import com.customer.vtiger.genericlibrary.listenerimplimentation;

import objectrepository.oppertunity;
@Listeners(listenerimplimentation.class)
public class createopportinity  extends baseclass{

	@Test
	public void createopportunity() throws InterruptedException {
		oppertunity p = new oppertunity(driver );
		p.getOpportubnity().click();
		p.getPluesicon().click();
		p.getOpportinityname().sendKeys("automation engineer");
		p.getRelatedto().sendKeys("organization");
		p.getCampaignSource().sendKeys("nbshgvg");
		p.getAmount().sendKeys("2000");
		p.getChosedate().sendKeys("2026-20-20");
		p.getNextstep().sendKeys("ok");
		WebElement add = p.getSalesdropdown();
		Select s = new Select(add);
		s.selectByIndex(1);
		p.getDescription().sendKeys("I am automation engineer");
		p.getSavebutton().click();
		Thread.sleep(2000);
	Alert a = driver.switchTo().alert();
	a.accept();
		Thread.sleep(9000);
		
	}

}


