package objectrepository;

import java.time.temporal.WeekFields;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class oppertunity {
	@FindBy(xpath = "(//a[text()='Opportunities'])[1]")private WebElement opportubnity;
	@FindBy(xpath = "//img[@alt='Create Opportunity...']")private WebElement pluesicon;
	@FindBy(name="potentialname") private WebElement opportinityname;
	@FindBy(id = "related_to_display")private WebElement relatedto;
	@FindBy(name = "campaignname")private WebElement CampaignSource;
	@FindBy(name = "amount") private WebElement amount;
	@FindBy(name ="closingdate") private WebElement chosedate;
	@FindBy(name = "nextstep")private WebElement nextstep;
	@FindBy(name = "sales_stage")private WebElement salesdropdown;
   @FindBy(name = "description")private WebElement description;
   @FindBy(xpath = "(//input[@class='crmbutton small save'])[2]")private WebElement savebutton;
   
   
   public oppertunity(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
   public WebElement getOpportubnity() {
	return opportubnity;
   }
   public WebElement getPluesicon() {
	return pluesicon;
   }
   public WebElement getOpportinityname() {
	return opportinityname;
   }
   public WebElement getRelatedto() {
	return relatedto;
   }
   public WebElement getCampaignSource() {
	return CampaignSource;
   }
   public WebElement getAmount() {
	return amount;
   }
   public WebElement getChosedate() {
	return chosedate;
   }
   public WebElement getNextstep() {
	return nextstep;
   }
   public WebElement getSalesdropdown() {
	return salesdropdown;
   }
   public WebElement getDescription() {
	return description;
   }
   public WebElement getSavebutton() {
	return savebutton;
   }
  

}


