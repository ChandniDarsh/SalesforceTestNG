package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.AccountPage;
import Page.LoginPage;
import Page.UsermanuPageTC5;
import Utilities.CommonUtilities;

public class UsermanuTestTC5 extends BaseTest{
	WebDriver driver;
	
	LoginPage login;
	BasePage base;
	UsermanuPageTC5 usermanu;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		
		usermanu = new UsermanuPageTC5(driver);
	
	} 
	
	@Test
	public void UsermanuTC5() throws Exception
	{
		 login.enterintoUsrname("233chandni@desai.com");
		 login.enterIntoPassword("chandni0311"); 
		 login.checkRememberme();
		 login.clickLoginBtn();
		 usermanu.UserManuDropdown();
		 
		 
	}

}
