package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.ContactPageTC29;
import Page.ContactPageTC30;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class ContactTestTC30 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	ContactPageTC30 contact;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		contact = new ContactPageTC30(driver);
	
	}  
	
	@Test
	public void validateContactTC30() throws Exception
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
			 BasePage.clickObj(contact.createnewviewlink, "Create new view");
			 BasePage.waitforElementtovisible(contact.viewuniquename);
			 BasePage.enterText(contact.viewuniquename, "EFGH", "Viewuniquename");
			 BasePage.clickObj(contact.btnsave, "BtnSave");
			 System.out.println("TC_30_ChecktheContactErrormessage is Completed");
		
		
		
		 
	}


}
