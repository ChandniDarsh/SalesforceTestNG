package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContactsPageTC25 extends BasePage{

	public ContactsPageTC25(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//input[contains(@name,'new')]")
	public WebElement newbtn;
	
	@FindBy(xpath = "//input[contains(@name,'name_lastcon2')]")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[contains(@name,'con4')][contains(@tabindex,'4')]")
	public WebElement accountname;
	
	
	@FindBy(xpath = "//td[contains(@class,'pbButtonb')]//input[contains(@name,'save')]")
	public WebElement savebtn;
	
	public void contactTC25()
	{
		contactstab.click();
		 waitforElementtoclick(closeprompt);
		 closeprompt.click();
		 newbtn.click();
		 waitforElementtovisible(lastname);
		 lastname.sendKeys("Last Name");
		 waitforElementtovisible(accountname);
		 accountname.sendKeys("Current Account");
		 savebtn.click();
	}
}
