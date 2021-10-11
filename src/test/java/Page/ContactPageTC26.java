package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContactPageTC26 extends BasePage{

	public ContactPageTC26(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	public WebElement createnewview;
	
	@FindBy(xpath = "//input[contains(@name,'fname')]")
	public WebElement viewname;
	
	@FindBy(xpath = "//input[contains(@name,'devname')]")
	public WebElement viewuniquename;
	
	@FindBy(xpath = "//td[contains(@class,'pbButtonb')]//input[contains(@name,'save')]")
	public WebElement savebtn;
	
	public void contactTC26()
	{
		contactstab.click();
		 waitforElementtoclick(closeprompt);
		 closeprompt.click();
		 createnewview.click();
		 waitforElementtovisible(viewname);
		 viewname.sendKeys("View Name");
		 viewuniquename.sendKeys(" ");
		 waitforElementtoclick(savebtn);
		 savebtn.click();
		 
		 
	}
}
