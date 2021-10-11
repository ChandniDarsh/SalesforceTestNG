package Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class LeadsdropdownPageTC21 extends BasePage{

	public LeadsdropdownPageTC21(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(@title,'Leads Tab')]")
	public WebElement leadstab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//select[contains(@name,'fcf')]")
	public static WebElement viewdropdown;
	
	
	}

