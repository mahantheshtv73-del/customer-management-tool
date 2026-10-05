package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/user.PNG'])[1]")
	private WebElement profileelement;
	
	@FindBy(xpath ="//a[test()='Sign Out']")
	private WebElement signoutelement;
	
	@FindBy(xpath = "//a[text()='Organizations']/parent::td[@class='tabSelected']")
	private WebElement organisationelement;
	
	//
	public  homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
		
	}
	public WebElement getprofileelement() {
		return profileelement;
		
	}
	

}
