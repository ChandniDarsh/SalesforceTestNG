package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.CreateNewOppPageTC16;
import Page.LoginPage;
import Page.OpportuinitiesPageTC17;
import Utilities.CommonUtilities;

public class OpportuinitiesTestTC17 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	OpportuinitiesPageTC17 opportunities;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		opportunities = new OpportuinitiesPageTC17(driver);
	
	}  
	
	@Test
	public void validateOpportuinitiesTC17() throws Exception
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
			 BasePage.clickObj(opportunities.opportuinitypipeline, "Opp Pipline");
			 System.out.println("TC17_TestOpportunityPipeline is completed");
		
		
		
		 
	}

}
