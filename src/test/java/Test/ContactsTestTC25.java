package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.ContactsPageTC25;
import Page.LoginPage;
import Page.StuckOpportuinitiesPageTC18;
import Utilities.CommonUtilities;

public class ContactsTestTC25 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	ContactsPageTC25 contact;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		contact = new ContactsPageTC25(driver);
	
	}  
	
	@Test
	public void validateStuckoppTC18() throws Exception
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
			 BasePage.clickObj(contact.newbtn, "New Btn");
			 BasePage.waitforElementtovisible(contact.lastname);
			 BasePage.enterText(contact.lastname, "Last Name", "LastName");
			 BasePage.waitforElementtovisible(contact.accountname);
			 BasePage.enterText(contact.accountname, "Current Account", "CurrenAccount");
			 BasePage.clickObj(contact.savebtn, "Savebtn");
			 System.out.println(" TC_25_Createnewcontact is completed");
	}

}
