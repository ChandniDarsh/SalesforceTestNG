package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.AccountPage;
import Page.AccountPageTC11;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class AccountTestTC11 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	AccountPageTC11 account;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		account = new AccountPageTC11(driver);
	
	} 
	
	@Test
	public void validateAccountcreatenewview() throws Exception
	{
			  String Username = common.getApplicationproperty("Uname");
			  login.enterintoUsrname(Username);
			  String Password = common.getApplicationproperty("pwd");
			  BasePage.enterText(login.enterIntoPassword(), Password, "Passwordtext");
			  BasePage.selectCheckBox(login.checkRememberme(), "RememberMe");
			  login.login.click();
			  String actualTitle = driver.getTitle();
				driver.manage().window().maximize();
				String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
				if(actualTitle.equalsIgnoreCase(expectedTitle)) {
				System.out.println("User is on home page");
				}
				else {
					System.out.println("home page is not Lunched");
				}
			  //BasePage.clickObj(login.LogoutButton(), "Login");
			  BasePage.clickObj(account.accounttab, "accounttab");
			  BasePage.waitforElementtoclick(account.closeprompt);
			  BasePage.clickObj(account.closeprompt, "Close Prompt");
			  BasePage.clickObj(account.createnewview, "Create New View");
			  BasePage.enterText(account.viewname, "ViewName","View Name");
			  BasePage.enterText(account.viewuniquename, "ViewName","View Name");
			  BasePage.clickObj(account.savebutton, "Button Save");
			  System.out.println("Clicked on Save button..");
			  System.out.println("TC11 is completed");
		
		}

}
