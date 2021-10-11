package Page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import Base.BasePage;

public class SettingsPage  extends BasePage {
	static WebDriver driver;
	static WebDriverWait wait;
	static Actions action;
	
	public SettingsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div[@id='userNav-arrow']")
	public WebElement Usermenu;
	
	@FindBy(xpath = "//a[@title='My Settings']")
	public WebElement mysettings;
	
	@FindBy(xpath = "//span[contains(@id,'PersonalInfo_font')]")
	public WebElement personal;
	
	@FindBy(xpath = "//span[@id='LoginHistory_font']")
	public WebElement loginhistory;
	
	@FindBy(xpath = "//a[contains(text(),'Download login history for last six months, including logins from outside the website, such as API logins ')]")
	public WebElement downloadhistory;
	
	@FindBy(xpath = "//span[contains(@id,'DisplayAndLayout_font')]")
	public WebElement DisplayandLayout;
	
	@FindBy(xpath = "//span[contains(@id,'CustomizeTabs_font')]")
	public WebElement customizetab;
	
	@FindBy(xpath = "//select[contains(@id,'p4')]//option[contains(text(),'Salesforce Chatter')]")
	public WebElement dropdown;
	
	@FindBy(xpath = "//select[contains(@name,'duel_select_0')]//option[contains(text(),'Reports')]")
	public WebElement availabletab;

	@FindBy(xpath = "//img[contains(@class,'rightArrowIcon')]")
	public WebElement addarrow;

	@FindBy(xpath = "//input[contains(@class,'btn primary')]")
	public WebElement saveall;
	
	@FindBy(xpath = "//select[contains(@id,'duel_select_0')]")
	public WebElement dropdownbox;
	
	@FindBy(xpath = "//span[contains(@id,'EmailSetup_font')]")
	public WebElement email;
	
	@FindBy(xpath = "//span[contains(@class,'leafText')][contains(text(),'My Email Settings')]")
	public WebElement myemailsettings;
	
	@FindBy(xpath ="//input[contains(@id,'sender_name')]")
	public WebElement emailname;
	
	@FindBy(xpath ="//input[contains(@id,'sender_email')]")
	public WebElement emailaddress;
	
	@FindBy(xpath ="//input[contains(@id,'auto_bcc1')]")
	public WebElement automaticbcc;
	
	@FindBy(xpath ="//input[contains(@type,'submit')]")
	public WebElement savebutton;
	
	@FindBy(xpath ="//span[contains(@id,'CalendarAndReminders_font')]")
	public WebElement calanderandreminder;
	
	@FindBy(xpath ="//span[contains(@id,'Reminders_font')][contains(text(),'Activity Reminders')]")
	public WebElement activityreminder;
	
	@FindBy(xpath ="//input[contains(@value,'Open a Test Reminder')]")
	public WebElement opentestreminder;
	

}
