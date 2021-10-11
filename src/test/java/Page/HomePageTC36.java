package Page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class HomePageTC36 extends BasePage{

	public HomePageTC36(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement hometab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[normalize-space()='Friday October 8, 2021']")
	public WebElement currentdate;
	
	@FindBy(xpath = "//a[contains(text(),'8:00 PM')]")
	public WebElement time;
	
	@FindBy(xpath = "//img[contains(@class,'comboboxIcon')]")
	public WebElement comboboxicon;
	
	//@FindBy(xpath = "//script[contains(text(),'document.write (getPickValue (4))')]")
	@FindBy(xpath = "//a[@href='javascript:pickValue(4);']")
	public WebElement other;
	
	@FindBy(xpath = "//input[contains(@name,'EndDateTime_time')][contains(@value,'9:00 PM')]")
	public WebElement endtime;
	
	@FindBy(xpath = "//input[contains(@name,'save')][contains(@tabindex,'14')]")
	public WebElement savebtn;
	


}
