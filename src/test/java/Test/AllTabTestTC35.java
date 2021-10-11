package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.HomePageTC34;
import Page.AllTabPageTC35;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class AllTabTestTC35 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	AllTabPageTC35 alltab;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		alltab = new AllTabPageTC35(driver);
	
	}  
	
	@Test
	public void AllTabTc35() throws Exception
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
			
			 BasePage.clickObj(alltab.alltab, "All Tab");
			 BasePage.waitforElementtoclick(alltab.customizetab);
			 BasePage.clickObj(alltab.customizetab, "CustomizeTab");
			 BasePage.waitforElementtoclick(alltab.subscriptions);
			 BasePage.clickObj(alltab.subscriptions, "Sub");
			 BasePage.clickObj(alltab.remove, "Removebtn");
			 BasePage.clickObj(alltab.savebtn, "Savebtn");
			 BasePage.waitforElementtoclick(alltab.usermenudropdown);
			 BasePage.clickObj(alltab.usermenudropdown, "Usermanudropdown");
			 BasePage.clickObj(alltab.logout, "Logout");
		
		 
	}
	
	@Test
	public void secondAllTabTc35() throws Exception
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
			
	}

}
