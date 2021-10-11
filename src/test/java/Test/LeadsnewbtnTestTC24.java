package Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BasePage;
import Base.BaseTest;
import Page.LeadsnewbtnPageTC24;
import Page.LoginPage;
import Page.TodysleadPageTC23;
import Utilities.CommonUtilities;

public class LeadsnewbtnTestTC24 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	LeadsnewbtnPageTC24 leads;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		leads = new LeadsnewbtnPageTC24(driver);
	
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
			 BasePage.clickObj(leads.newbtn, "New Btn");
			 BasePage.waitforElementtovisible(leads.lastname);
			 BasePage.enterText(leads.lastname, "ABC", "LastName");
			 BasePage.waitforElementtovisible(leads.companyname);
			 BasePage.enterText(leads.companyname, "ABC", "CompanyName");
			 BasePage.clickObj(leads.savebtn, "Save Btn");
			 
		
		
	}


}
