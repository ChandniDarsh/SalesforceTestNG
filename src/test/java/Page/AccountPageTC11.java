package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class AccountPageTC11 extends BasePage{

	public AccountPageTC11(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Accounts Tab')]")
	public WebElement accounttab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	public WebElement createnewview;
	
	@FindBy(xpath = "//input[contains(@name,'fname')]")
	public WebElement viewname;
	
	@FindBy(xpath = "//input[contains(@id,'devname')]")
	public WebElement viewuniquename;
	
	@FindBy(xpath = "//input[contains(@value,' Save ')]")
	public WebElement savebutton;
	
	
	
	
	

}
