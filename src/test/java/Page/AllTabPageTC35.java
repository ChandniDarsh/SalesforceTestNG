package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class AllTabPageTC35 extends BasePage{

	public AllTabPageTC35(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//img[contains(@title,'All Tabs')]")
	public WebElement alltab;
	
//	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
//	public WebElement closeprompt;
	
	@FindBy(xpath = "//input[contains(@value,'Customize My Tabs')]")
	public WebElement customizetab;
	
	@FindBy(xpath = "//select[contains(@name,'duel_select_1')]//option[contains(text(),'Subscriptions')]")
	public WebElement subscriptions;
	
	@FindBy(xpath = "//img[contains(@alt,'Remove')]")
	public WebElement remove;
	
	
	@FindBy(xpath = "//input[contains(@value,' Save ')]")
	public WebElement savebtn;
	
	@FindBy(xpath = "//div[contains(@class,'userNav-buttonArrow mbrButtonArrow')]")
	public WebElement usermenudropdown;
	
	@FindBy(xpath = "//a[contains(@class,'menuButtonMenuLink')][contains(text(),'Logout')]")
	public WebElement logout;
	
	
	

}
