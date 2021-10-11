package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class LeadsTabPageTC20 extends BasePage{

	public LeadsTabPageTC20(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Leads Tab')]")
	public WebElement leadstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//div[contains(@class,'userNav-buttonArrow mbrButtonArrow')]")
	public WebElement usermanu;
	
	@FindBy(xpath = "//a[contains(@title,'Logout')]")
	public WebElement logout;
	
	
	
	

}
