package contacts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.customer.vtiger.genericlibrary.baseclass;
import com.customer.vtiger.genericlibrary.listenerimplimentation;

import objectrepository.contacts;
@Listeners(listenerimplimentation.class)
public class createcontacts extends baseclass{
	
	@Test
	public void createcontacts() throws InterruptedException {
		contacts c = new contacts( driver);
		c.getContacts().click();
		c.getCliconplus().click();
		c.getFirstname().sendKeys("Mahanthesh tv");
		c.getLastname().sendKeys("mahanth");
		c.getTitle().sendKeys("mnbhhjgvfdh");
		c.getDepartment().sendKeys("testing");
		c.getEmail().sendKeys("mahantheshtv43@gmail.com");
		c.getAssistant().sendKeys("hbjhgfhy");
		c.getAssistantphone().sendKeys("9741610849");
		c.getSave().click();
		Thread.sleep(5000);
	}

}
