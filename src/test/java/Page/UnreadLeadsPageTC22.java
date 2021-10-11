package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class UnreadLeadsPageTC22 extends BasePage{

	public UnreadLeadsPageTC22(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Leads Tab')]")
	public WebElement leadstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//select[contains(@name,'fcf')]//option[contains(text(),'My Unread Leads')]")
	public WebElement myunreadleads;
	
	@FindBy(xpath = "//div[contains(@class,'userNav-buttonArrow mbrButtonArrow')]")
	public WebElement usermanu;
	
	@FindBy(xpath = "//a[contains(@title,'Logout')]")
	public WebElement logout;
	
	@FindBy(xpath = "//input[contains(@name,'go')][contains(@value,' Go! ')]")
	public WebElement gobutton;
	
	
	

}
