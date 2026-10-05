package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contacts {
	@FindBy(xpath = "(//a[text()='Contacts'] )[1]")private WebElement Contacts;
	@FindBy(xpath = "//img[@title='Create Contact...'] ")private WebElement cliconplus;
	@FindBy(name = "firstname")private WebElement firstname;
	@FindBy(name = "lastname")private WebElement lastname;
	@FindBy(id = "title")private WebElement title;
	@FindBy(name = "department")private WebElement department;
	@FindBy(name = "email")private WebElement email;
	@FindBy(name = "assistant")private WebElement assistant;
	@FindBy(name = "assistantphone")private WebElement assistantphone;
	@FindBy(name = "emailoptout")private WebElement emailoptout;
	@FindBy(name = "reference")private WebElement reference;
	@FindBy(name = "notify_owner")private WebElement notify_owner;
	@FindBy(name = "mailingstreet")private WebElement mailingstreet;
	@FindBy(name = "mailingpobox")private WebElement mailingpobox;
	@FindBy(name = "mailingzip")private WebElement mailingzip;
	@FindBy(name = "mailingcountry")private WebElement mailingcountry;
	@FindBy(name = "description")private WebElement description;
	@FindBy(name = "phone")private WebElement phone;
	@FindBy(name = "mobile")private WebElement mobile;
	@FindBy(name = "homephone")private WebElement homephone;
	@FindBy(name = "otherphone")private WebElement otherphone;
	@FindBy(name = "fax")private WebElement fax;
	@FindBy(name = "birthday")private WebElement birthday;
	@FindBy(name = "contact_name")private WebElement contact_name;
	@FindBy(name = "secondaryemail")private WebElement secondaryemail;
	@FindBy(name = "donotcall")private WebElement donotcall;
	@FindBy(name = "button")private WebElement save;


	

	public contacts(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getCliconplus() {
		return cliconplus;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAssistant() {
		return assistant;
	}

	public WebElement getAssistantphone() {
		return assistantphone;
	}

	public WebElement getEmailoptout() {
		return emailoptout;
	}

	public WebElement getReference() {
		return reference;
	}

	public WebElement getNotify_owner() {
		return notify_owner;
	}

	public WebElement getMailingstreet() {
		return mailingstreet;
	}

	public WebElement getMailingpobox() {
		return mailingpobox;
	}

	public WebElement getMailingzip() {
		return mailingzip;
	}

	public WebElement getMailingcountry() {
		return mailingcountry;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getHomephone() {
		return homephone;
	}

	public WebElement getOtherphone() {
		return otherphone;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getBirthday() {
		return birthday;
	}

	public WebElement getContact_name() {
		return contact_name;
	}

	public WebElement getSecondaryemail() {
		return secondaryemail;
	}

	public WebElement getDonotcall() {
		return donotcall;
	}
	
	public WebElement getSave() {
		return save;
	}

	
	
	
	
	
	
	
	
}
