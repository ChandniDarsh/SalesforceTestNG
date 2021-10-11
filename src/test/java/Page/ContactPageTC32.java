package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContactPageTC32 extends BasePage{

	public ContactPageTC32(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//input[contains(@value,' New ')]")
	public WebElement newlink;
	
	@FindBy(xpath = "//input[contains(@name,'name_lastcon2')]")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[contains(@name,'con4')][contains(@tabindex,'4')]")
	public WebElement acountname;
	
	@FindBy(xpath = "//input[contains(@value,'Save & New')]")
	public WebElement savenewbtn;
	
	public void contactTC32()
	{
		 contactstab.click();
		 waitforElementtoclick(closeprompt);
		 closeprompt.click();
		 newlink.click();
		 waitforElementtovisible(lastname);
		 lastname.sendKeys("India");
		 waitforElementtovisible(acountname);
		 acountname.sendKeys("Global Media");
		 savenewbtn.click();
	}

}
