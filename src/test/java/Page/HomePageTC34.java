package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class HomePageTC34 extends BasePage{

	public HomePageTC34(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement hometab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[contains(text(),'Chandni Darsh')]")
	public WebElement firstandlastnm;
	
	@FindBy(xpath = "//img[contains(@alt,'Edit Profile')]")
	public WebElement editprofile;
	
	@FindBy(xpath = "//iframe[contains(@frameborder,'no')][contains(@id,'contactInfoContentId')]")
	public WebElement ifram;
	
	@FindBy(xpath = "//a[contains(text(),'About')]")
	public WebElement about;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement updateLastNameField;
	
	@FindBy(xpath = "//input[contains(@value,'Save All')]")
	public WebElement saveallbtn;
	
	
	
}
