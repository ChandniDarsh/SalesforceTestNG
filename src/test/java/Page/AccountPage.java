package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class AccountPage extends BasePage{
	
	
	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Accounts Tab')]")
	public WebElement accounttab;
	
	
	@FindBy(xpath = "//input[contains(@class,'btn')][contains(@title,'New')]")
	public WebElement newbtn;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//input[contains(@name,'acc2')]")
	public WebElement accountname;
	
	@FindBy(xpath = "//select[contains(@name,'acc6')]")
	public WebElement type;
	
	@FindBy(xpath = "//select[contains(@name,'00N5f000006ewYE')]")
	public WebElement customerpriority;
	
	@FindBy(xpath = "//input[contains(@value,' Save ')][contains(@title,'Save')]")
	public WebElement savebutton;
	
	
	
	
	

}
