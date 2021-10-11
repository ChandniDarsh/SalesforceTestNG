package Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;

import Page.AccountPageTC12;
import Page.LeadsdropdownPageTC21;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class AccountTestTC12  extends BaseTest{
		WebDriver driver;
		LoginPage login;
		BasePage base;
		AccountPageTC12 account;
		
		CommonUtilities common = new CommonUtilities();
		
		@BeforeMethod
		public void beforeTest() throws IOException 
		{
			driver = getDriver();
			String url = common. getApplicationproperty("url");
			driver.get(url);
			login = new LoginPage(driver);
			account = new AccountPageTC12(driver);
		
		} 
		
		@Test
		public void validateAccounttabeditlink() throws Exception
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
			  Select dropdown = new Select(AccountPageTC12.viewdropdown);
			  BasePage.clickObj(account.editlink, "edit link");
			  BasePage. waitforElementtovisible(account.viewname);
			  account.viewname.clear();
			  BasePage.enterText(account.viewname, "NewViewName","viewname");
			  Select dropdown1 = new Select(AccountPageTC12.fielddropdown);
			  Select dropdown2 = new Select(AccountPageTC12.operatordropdown);
			  BasePage.enterText(account.valuetextbox, "A","value TextBox");
			  BasePage.clickObj(account.savebutton, "button save");
			
			}

		
}
