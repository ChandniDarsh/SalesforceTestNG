package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;

import Page.LoginPage;
import Page.TodysleadPageTC23;
import Page.UnreadLeadsPageTC22;
import Utilities.CommonUtilities;

public class TodysleadTestTC23 extends BaseTest{
	WebDriver driver;
	
	LoginPage login;
	BasePage base;
	TodysleadPageTC23 leads;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		
		leads = new TodysleadPageTC23(driver);
	
	}  
	
	@Test
	public void unreadleads() throws Exception
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
			
			 BasePage.clickObj(leads.leadstab, "Leads Tab");
			 BasePage.waitforElementtoclick(leads.closeprompt);
			 BasePage.clickObj(leads.closeprompt, "Close Prompt");
			 BasePage.clickObj(leads.todayslead, "Todays Lead");
			 System.out.println("TC_23_TodaysLeads is completed");
		
	}

}
