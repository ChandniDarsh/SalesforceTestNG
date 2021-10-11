package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContactPageTC27 extends BasePage{

	public ContactPageTC27(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//select[contains(@name,'hotlist_mode')]//option[contains(text(),'Recently Created')]")
	public WebElement recentlycreat;
	
	public void contactTC27()
	{
		
		contactstab.click();
		 waitforElementtoclick(closeprompt);
		 closeprompt.click();
		 recentlycreat.click();
	}

}
