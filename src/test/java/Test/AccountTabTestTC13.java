package Test;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.AccountPageTC12;
import Page.AccountTabPageTC13;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class AccountTabTestTC13 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	AccountTabPageTC13 account;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		account = new AccountTabPageTC13(driver);
	
	}  
	
	@Test
	public void validateAccounttabTC13() throws Exception
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
		  BasePage.clickObj(account.accounttab, "accounttab");
		  BasePage.waitforElementtoclick(account.closeprompt);
		  BasePage.clickObj(account.closeprompt, "Close Prompt");
		  BasePage.clickObj(account.mergeaccountlink, "Merge Account");
		  BasePage.waitforElementtovisible(account.findaccounttextbox);
		  BasePage.enterText(account.findaccounttextbox, "Savings Account","Account Textbox");
		  BasePage.waitforElementtoclick(account.findaccountbutton);
		  BasePage.clickObj(account.findaccountbutton, "Find Account Btn");
		  BasePage.waitforElementtovisible(account.selectcheckbox);
		  BasePage.selectCheckBox(account.selectcheckbox, "Select Checkbox");
		  BasePage.selectCheckBox(account.selectcheckbox2, "Select Checkbox2");
		  BasePage.waitforElementtoclick(account.nextbutton);
		  BasePage.clickObj(account.nextbutton, "NextBtn");
		  BasePage.clickObj(account.mergebutton, "MergeBtn");
		  BasePage.switchtoAlert(driver);
		 
			 
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		

		 
	}

}
