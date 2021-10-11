package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.ContactPageTC28;
import Page.ContactPageTC29;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class ContactTestTC29 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	ContactPageTC29 contact;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		contact = new ContactPageTC29(driver);
	
	}  
	
	@Test
	public void validateContactTC29() throws Exception
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
			 BasePage.clickObj(contact.contactname, "Contact Name");
			 System.out.println("TC_29_ViewcontactinthecontactPage is completed");
		
		
		
		
		
		
		
		
	}


}
