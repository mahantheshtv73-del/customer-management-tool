package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	@FindBy(name ="user_name")
	private WebElement usernametbx;
	@FindBy(name ="user_password")
	private WebElement passwordtxb;
	@FindBy(id="submitButton")
	private WebElement idbtn;
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsernametbx() {
		return usernametbx;
	}
	public void setUsernametbx(WebElement usernametbx) {
		this.usernametbx = usernametbx;
	}
	public WebElement getPasswordtxb() {
		return passwordtxb;
	}
	public void setPasswordtxb(WebElement passwordtxb) {
		this.passwordtxb = passwordtxb;
	}
	public WebElement getIdbtn() {
		return idbtn;
	}
	public void setIdbtn(WebElement idbtn) {
		this.idbtn = idbtn;
	}
	

}
