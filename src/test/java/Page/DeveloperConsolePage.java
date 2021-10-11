package Page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class DeveloperConsolePage extends BasePage{

	public DeveloperConsolePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@id='userNav-arrow']")
	public WebElement Usermenu;
	
	@FindBy(xpath = "//a[contains(@class,'debugLogLink menuButtonMenuLink')]")
	public WebElement developerconsole;
	
	public void usermenu() 
		{
		
		Usermenu.click();
		
		}
	
	public void DeveloperConsole() 
	{
	
		developerconsole.click();
		Set<String> getAllWindows=driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]).close();
		System.out.println("TestCase8 Is Completed");
	
	}

}
