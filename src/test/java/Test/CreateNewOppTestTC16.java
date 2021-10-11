package Test;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.CreateNewOppPageTC16;

import Page.LoginPage;
import Page.OpportunitiesPageTC15;
import Utilities.CommonUtilities;

public class CreateNewOppTestTC16  extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	CreateNewOppPageTC16 opportunities;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		opportunities = new CreateNewOppPageTC16(driver);
	
	}  
	
	@Test
	public void validatecreatenewopp() throws Exception
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
			
			 BasePage.clickObj(opportunities.opportunitietab, "Oppo Tab");
			 BasePage.waitforElementtoclick(opportunities.closeprompt);
			 BasePage.clickObj(opportunities.closeprompt, "Close Prompt");
			 BasePage.clickObj(opportunities.newbtn, "New Btn");
			 BasePage.enterText(opportunities.opportuinityname, "My Opportuinities","Opp Name");
			 
			 BasePage.clickObj(opportunities.accountname, "Account name");
			 
			 BasePage.enterText(opportunities.selectsavingaccount, "Savings Account","Acc Name");
			 BasePage.clickObj(opportunities.LookupWindow, "Lookup Window");
			 String oldWindow = driver.getWindowHandle();
				//Switching driver control to new window.
				Set<String> getAllWindows = driver.getWindowHandles();
				String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
				driver.switchTo().window(getWindow[1]);
				
				driver.switchTo().frame("searchFrame");
				BasePage.clickObj(opportunities.go, "Go Btn");
				
				//Switching to Lookup Window
				driver.switchTo().defaultContent();
			 BasePage.waitforElementtovisible(opportunities.closedate);
			 BasePage.enterText(opportunities.closedate, "10/21/2021","Probability");	
			//BasePage.clickObj(opportunities.closedate, "Close Date");
			 BasePage.clickObj(opportunities.stage, "Stage");
			 BasePage.enterText(opportunities.probability, "20","Probability");
			 BasePage.clickObj(opportunities.leadsourcedropdown, "LeadSourceDeopdown");
			 BasePage.clickObj(opportunities.primarycampaign, "Primary Campaign");
			 
			 
		
	}

}
