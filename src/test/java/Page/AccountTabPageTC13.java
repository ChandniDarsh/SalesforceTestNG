package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class AccountTabPageTC13 extends BasePage {

	public AccountTabPageTC13(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(@title,'Accounts Tab')]")
	public WebElement accounttab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[contains(text(),'Merge Accounts')]")
	public WebElement mergeaccountlink;
	
	@FindBy(xpath = "//input[contains(@title,'Find Accounts')]")
	public WebElement findaccounttextbox;
	
	@FindBy(xpath = "//input[contains(@value,'Find Accounts')][contains(@class,'btn')]")
	public WebElement findaccountbutton;
	
	@FindBy(xpath = "//input[contains(@value,'0015f000007n1ap')]")
	public WebElement selectcheckbox;
	
	@FindBy(xpath = "//input[contains(@value,'0015f000007n1oD')]")
	public WebElement selectcheckbox2;
	
	
	@FindBy(xpath = "//input[contains(@value,' Next ')]")
	public WebElement nextbutton;
	
	@FindBy(xpath = "//input[contains(@value,' Merge')]")
	public WebElement mergebutton;
	

		
			

			
	 
	
	
}
