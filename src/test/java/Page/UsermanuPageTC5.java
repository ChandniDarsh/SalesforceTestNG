package Page;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base.BasePage;

public class UsermanuPageTC5 extends BasePage{

	public UsermanuPageTC5(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//span[contains(@class,'menuButtonLabel')]")
	public WebElement Usermenu;
	
	@FindBy(xpath = "//div[@id='userNav-menuItems']")
	public static WebElement allusermenuoption;
	
	public void UserManuDropdown() throws AWTException, InterruptedException {
		Usermenu.click();
		allusermenuoption.click();
		
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		//Assert.assertEquals(expectedTitle, actualTitle);
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("User is on home page");
		else
			System.out.println("home page is not Lunched");
			System.out.println(allusermenuoption);
	   
	    System.out.println("TC5 UserManu is completed");
	}
	
}
