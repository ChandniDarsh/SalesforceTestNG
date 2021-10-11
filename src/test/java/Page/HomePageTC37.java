package Page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class HomePageTC37 extends BasePage{

	public HomePageTC37(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	public WebElement hometab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[normalize-space()='Friday October 8, 2021']")
	public WebElement currentdate;
	
	@FindBy(xpath = "//a[contains(text(),'4:00 PM')]")
	public WebElement time;
	
	@FindBy(xpath = "//img[contains(@class,'comboboxIcon')]")
	public WebElement comboboxicon;
	
	//@FindBy(xpath = "//script[contains(text(),'document.write (getPickValue (4))')]")
	@FindBy(xpath = "//a[@href='javascript:pickValue(4);']")
	public WebElement other;
	
	@FindBy(xpath = "//input[@id='EndDateTime_time']")
	public WebElement endtime;
	
	@FindBy(xpath = "//input[contains(@name,'IsRecurrence')]")
	public WebElement recurrence;
	
	@FindBy(xpath = "//input[contains(@name,'rectype')][contains(@value,'ftw')]")
	public WebElement weeklyradiobtn;
	
	@FindBy(xpath = "//input[contains(@name,'EndDateTime')]")
	public WebElement enddate;
	
	
	@FindBy(xpath = "//input[contains(@name,'save')][contains(@tabindex,'14')]")
	public WebElement savebtn;
	
	@FindBy(xpath = "//img[contains(@class,'monthViewIcon')]")
	public WebElement monthview;
	
	
	public void HomeTC37() throws InterruptedException
	{
		 hometab.click();
		 waitforElementtoclick(closeprompt);
		 closeprompt.click();
		 waitforElementtoclick(currentdate);
		 currentdate.click();
		 waitforElementtoclick(time);
		 time.click();
		 comboboxicon.click();
		 Set<String> windowHandles = driver.getWindowHandles();
			String currentHandle = driver.getWindowHandle();
			windowHandles.remove(currentHandle);
			String newHandle = windowHandles.iterator().next();
			driver.switchTo().window(newHandle);
			//waitforElementtobeclick(other);
			//Thread.sleep(20000);
			other.click();
			//driver.switchTo().defaultContent();
			driver.switchTo().window(currentHandle);
		 //waitforElementtoclick(endtime);
		 endtime.click();
		 waitforElementtoclick(recurrence);
		 recurrence.click();
		 weeklyradiobtn.click();
		 enddate.clear();
		 enddate.sendKeys("10/21/2021");
		 savebtn.click();
		 waitforElementtoclick(monthview);
		 monthview.click();
		 
	}


}
