package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class LeadsnewbtnPageTC24 extends BasePage{

	public LeadsnewbtnPageTC24(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Leads Tab')]")
	public WebElement leadstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//input[contains(@name,'new')]")
	public WebElement newbtn;
	
	@FindBy(xpath = "//input[contains(@name,'name_lastlea2')]")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[contains(@name,'lea3')]")
	public WebElement companyname;
	
	@FindBy(xpath = "//td[contains(@class,'pbButtonb')]//input[contains(@name,'save')]")
	public WebElement savebtn;
	
	
	

}
