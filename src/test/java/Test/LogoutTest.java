package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BasePage;
import Base.BaseTest;
import Page.DeveloperConsolePage;
import Page.LoginPage;
import Page.LogoutPage;
import Page.SettingsPage;
import Utilities.CommonUtilities;

public class LogoutTest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	LogoutPage lo;
	CommonUtilities common = new CommonUtilities();
 
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
	driver = getDriver();
	String url = common. getApplicationproperty("url");
	driver.get(url);
	login = new LoginPage(driver);
	lo = new LogoutPage(driver);
	} 
	
	@Test
	public void validateLogout() throws InterruptedException, Exception
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
			
			
			BasePage.clickObj(lo.Usermenu, "User Manu");
			BasePage.clickObj(lo.Logout, "Logout");
			String	expectedUrl1 = driver.getCurrentUrl();
			String	actualUrl1 = "https://login.salesforce.com/";
				
			if(actualUrl1.equalsIgnoreCase(expectedUrl1)) {
					System.out.println("User is not in login page");
			}
				else {
					System.out.println("User is on login page");
				}
		
		}


}
