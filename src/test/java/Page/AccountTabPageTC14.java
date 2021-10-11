package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class AccountTabPageTC14 extends BasePage{

	public AccountTabPageTC14(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(@title,'Accounts Tab')]")
	public WebElement accounttab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[contains(text(),'Accounts with last activity > 30 days')]")
	public WebElement accountlastactivity;
	
	@FindBy(xpath = "//img[contains(@class,'x-form-trigger x-form-arrow-trigger')][contains(@id,'ext-gen148')]")
	public WebElement datefield;
	
	@FindBy(xpath = "//div[contains(text(),'Created Date')]")
	public WebElement createddate;
	
	@FindBy(xpath = "//img[contains(@class,'x-form-trigger x-form-date-trigger')]")
	public WebElement datefromicon;
	
	@FindBy(xpath = "//button[contains(text(),'Today')]")
	public WebElement datefrom;
	
	
	@FindBy(xpath = "//img[contains(@class,'x-form-trigger x-form-date-trigger')][contains(@id,'ext-gen154')]")
	public WebElement datetoicon;
	
	@FindBy(xpath ="//input[contains(@name,'endDate')]")
	public WebElement dateto;
	
	@FindBy(xpath = "//button[contains(@id,'ext-gen49')][contains(@class,' x-btn-text')]")
	public WebElement savebutton;
	
	@FindBy(xpath = "//input[contains(@id,'saveReportDlg_reportNameField')]")
	public WebElement reportname;
	
	@FindBy(xpath = "//input[contains(@id,'saveReportDlg_DeveloperName')]")
	public WebElement reporuniquetname;
	
	@FindBy(xpath = "//button[contains(text(),'Save and Run Report')]")
	public WebElement saveandrunreportbutton;
	
	
	
	
}
