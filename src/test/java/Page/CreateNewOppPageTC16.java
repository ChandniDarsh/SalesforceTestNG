package Page;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class CreateNewOppPageTC16 extends BasePage{

	public CreateNewOppPageTC16(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Opportunities Tab')]")
	public WebElement opportunitietab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//input[contains(@class,'btn')][contains(@title,'New')]")
	public WebElement newbtn;
	
	@FindBy(xpath = "//input[contains(@name,'opp3')][contains(@type,'text')]")
	public WebElement opportuinityname;
	
	
	@FindBy(xpath = "//img[contains(@alt,'Account Name Lookup (New Window)')]")
	public WebElement accountname;
	
	@FindBy(xpath = "//input[@id='opp4']")
	public WebElement selectsavingaccount;
	@FindBy(xpath ="//img[@title='Account Name Lookup (New Window)']")
	public WebElement LookupWindow;
	
	@FindBy(xpath ="//input[@name='go']")
	public WebElement go;
	
	
	
	@FindBy(xpath = "//input[contains(@name,'opp9')]")
	public WebElement closedate;
	
	@FindBy(xpath = "//select[contains(@name,'opp11')]//option[contains(text(),'Needs Analysis')]")
	public WebElement stage;
	
	@FindBy(xpath = "//input[contains(@name,'opp12')]")
	public WebElement probability;
	
	@FindBy(xpath = "//select[contains(@name,'opp6')]//option[contains(text(),'Other')]")
	public WebElement leadsourcedropdown;
	
	@FindBy(xpath = "//img[contains(@alt,'Primary Campaign Source Lookup (New Window)')]")
	public WebElement primarycampaign;
	
	
}
