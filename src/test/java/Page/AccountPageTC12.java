package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class AccountPageTC12 extends BasePage{

	public AccountPageTC12(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Accounts Tab')]")
	public WebElement accounttab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	
	@FindBy(xpath = "//select[contains(@name,'fcf')]")
	public static WebElement viewdropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	public WebElement editlink;
	
	@FindBy(xpath = "//input[@id='fname']")
	public WebElement viewname;
	
	
	@FindBy(xpath = "//select[contains(@name,'fcol1')]")
	public static WebElement fielddropdown;
	
	@FindBy(xpath = "//select[contains(@name,'fop1')]")
	public static WebElement operatordropdown;
	
	@FindBy(xpath = "//input[contains(@id,'fval1')]")
	public WebElement valuetextbox;
	
	@FindBy(xpath = "//input[contains(@value,' Save ')][contains(@class,'btn primary')]")
	public WebElement savebutton;
	
	 
	
	

	

	
}
