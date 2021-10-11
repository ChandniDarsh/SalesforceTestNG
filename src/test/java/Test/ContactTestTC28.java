package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.ContactPageTC27;
import Page.ContactPageTC28;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class ContactTestTC28 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	ContactPageTC28 contact;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		contact = new ContactPageTC28(driver);
	
	}  
	
	@Test
	public void ContactTC28() throws Exception
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
			 BasePage.clickObj(contact.mycontact, "My ontact");
			 //Select dropdown = new Select(Mycont_view);
			// BasePage.selectByVisibleText(contact.GoButton, "My Contacts View");
			 BasePage.clickObj(contact.GoButton, "Go Btn");
			 System.out.println("TC28_MyContacts is Completed");
				
			 
		
		 
	}

}
