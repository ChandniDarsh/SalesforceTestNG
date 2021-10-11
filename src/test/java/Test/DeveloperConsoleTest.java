package Test;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.DeveloperConsolePage;
import Page.LoginPage;
import Page.SettingsPage;
import Utilities.CommonUtilities;

public class DeveloperConsoleTest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	DeveloperConsolePage dc;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		dc = new DeveloperConsolePage(driver);
	
	}
	
	@Test
	public void validateDeveloperConsole() throws InterruptedException, Exception
	{
		String Username = common.getApplicationproperty("Uname");
			  login.enterintoUsrname(Username);
			  String Password = common.getApplicationproperty("pwd");
			  BasePage.enterText(login.enterIntoPassword(), Password, "Passwordtext");
			  BasePage.selectCheckBox(login.checkRememberme(), "RememberMe");
			  login.login.click();
			  //BasePage.clickObj(login.LogoutButton(), "Login");
			  String actualTitle = driver.getTitle();
				driver.manage().window().maximize();
				String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
				if(actualTitle.equalsIgnoreCase(expectedTitle)) {
				System.out.println("User is on home page");
				}
				else {
					System.out.println("home page is not Lunched");
				}
				
				
				BasePage.clickObj(dc.Usermenu, "User Manu");
				BasePage.clickObj(dc.developerconsole, "Developerconsole");
				Set<String> getAllWindows=driver.getWindowHandles();
				String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
				driver.switchTo().window(window[1]).close();
				System.out.println("TestCase8 Is Completed");
		
		
		

		 
	}

}
