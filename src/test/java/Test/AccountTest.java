package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.AccountPage;
import Page.DeveloperConsolePage;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class AccountTest extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	AccountPage account;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		account = new AccountPage(driver);
	
	} 
	
	@Test
	public void validateAccount() throws Exception
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
		  BasePage.clickObj(account.newbtn, "New Button");
		   account.accountname.clear();
		  BasePage.waitforElementtovisible(account.accountname);
		  BasePage.enterText(account.accountname, "Savings Account","Accountname");
		  Select select = new Select(account.type);
		  select.selectByVisibleText("Technology Partner");
		  BasePage.waitforElementtoselect(account.accountname);
		  Select select1 = new Select(account.customerpriority);
		  select1.selectByValue("High");
		  BasePage.clickObj(account.savebutton, "save Button");
		  
		 
		 
	}

}
