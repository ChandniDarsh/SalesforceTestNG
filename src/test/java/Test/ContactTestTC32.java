package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.ContacPageTC31;
import Page.ContactPageTC32;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class ContactTestTC32 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	ContactPageTC32 contact;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		contact = new ContactPageTC32(driver);
	
	}  
	
	@Test
	public void validateContactTC32() throws Exception
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
			
			 BasePage.clickObj(contact.contactstab, "Leads Tab");
			 BasePage.waitforElementtoclick(contact.closeprompt);
			 BasePage.clickObj(contact.closeprompt, "Close Prompt");
			 BasePage.clickObj(contact.newlink, "New Link");
			 BasePage.waitforElementtovisible(contact.lastname);
			 BasePage.enterText(contact.lastname,"India", "last name");
			 BasePage.waitforElementtovisible(contact.acountname);
			 BasePage.enterText(contact.acountname,"Global Media", "account name");
			 BasePage.clickObj(contact.savenewbtn, "savebtn");
			 System.out.println("TC_32_CheckingSaveandNewbutton is Completed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
	}

}
