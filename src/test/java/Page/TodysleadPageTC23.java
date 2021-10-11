package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class TodysleadPageTC23 extends BasePage{

	public TodysleadPageTC23(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Leads Tab')]")
	public WebElement leadstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//select[contains(@name,'fcf')]//option[contains(@value,'00B5f000004KoUQ')]")
	public WebElement todayslead;
	
	

}
