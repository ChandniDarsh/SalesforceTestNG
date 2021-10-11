package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class ContactPageTC28 extends BasePage{

	public ContactPageTC28(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	public WebElement contactstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//select[contains(@name,'fcf')]//option[contains(text(),'My Contacts')]")
	public WebElement mycontact;
	
	@FindBy(xpath = "//select[@id='fcf']")
	public WebElement Mycont_view;
	
	@FindBy(xpath = "//input[contains(@value,' Go! ')]")
	public WebElement GoButton;
	
	


}
