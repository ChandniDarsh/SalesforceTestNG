package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContacPageTC31 extends BasePage{

	public ContacPageTC31(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	public WebElement createnewviewlink;
	
	@FindBy(xpath = "//input[contains(@name,'fname')]")
	public WebElement viewname;
	
	
	@FindBy(xpath = "//input[contains(@name,'devname')]")
	public WebElement viewuniquename;
	
	@FindBy(xpath = "//input[contains(@name,'cancel')][contains(@title,'Cancel')]")
	public WebElement cancelbtn;
	
	public void contactTC31()
	{
		contactstab.click();
		 waitforElementtoclick(closeprompt);
		 closeprompt.click();
		 createnewviewlink.click();
		 waitforElementtovisible(viewname);
		 viewname.sendKeys("ABC");
		 waitforElementtovisible(viewuniquename);
		 viewuniquename.sendKeys("EFGH");
		 cancelbtn.click();
	}
}
