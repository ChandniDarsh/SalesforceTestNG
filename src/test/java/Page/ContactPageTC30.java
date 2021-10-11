package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContactPageTC30 extends BasePage{

	public ContactPageTC30(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[contains(text(),'Create New View')]")
	public WebElement createnewviewlink;
	
	@FindBy(xpath = "//input[contains(@name,'devname')]")
	public WebElement viewuniquename;
	
	@FindBy(xpath = "//td[contains(@class,'pbButtonb')]//input[contains(@class,'btn primary')]")
	public WebElement btnsave;
	
	
}
