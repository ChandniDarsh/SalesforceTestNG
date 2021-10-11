package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.AccountTabPageTC13;
import Page.AccountTabPageTC14;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class AccountTabTestTC14 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	AccountTabPageTC14 account;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		account = new AccountTabPageTC14(driver);
	
	}  
	
	@Test
	public void validateAccounttabTC14() throws Exception
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
		  BasePage.clickObj(account.accountlastactivity, "Account Last Activity");
		  BasePage.waitforElementtoclick(account.datefield);
		  BasePage.clickObj(account.datefield, "Date Field");
		  BasePage.clickObj(account.createddate, "Creat Date");
		  //BasePage.waitforElementtoclick(account.datefrom);
		  BasePage.clickObj(account.datefromicon, "DateFrom Icon");
		  BasePage.clickObj(account.datefrom, "Date From");
		  //account.datetoicon.clear();
		  //BasePage.waitforElementtoclick(account.datetoicon);
		  BasePage.clickObj(account.datetoicon, "DateTo Icon");
		  account.dateto.clear();
		  //BasePage.waitforElementtoclick(account.dateto);
		  //BasePage.clickObj(account.dateto, "Date To");
		  BasePage.enterText(account.dateto, "10/8/2021","Date To");
		  BasePage.clickObj(account.savebutton, "Savebtn");
		  BasePage.enterText(account.reportname, "My First Report","ReportName");
		  BasePage.enterText(account.reporuniquetname, "R1","Report1");
		  Thread.sleep(10000);
		  BasePage.clickObj(account.saveandrunreportbutton, "Savebtn");
		  System.out.println("Save And Run Report Button Is Clickked");
			 
		  System.out.println("TC14 s Completed");
		  
		  
		  
		
		 
	}

}
