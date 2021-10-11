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
import Page.LeadsTabPageTC20;
import Page.LeadsdropdownPageTC21;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class LeadsDropDownTestTC21 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	LeadsdropdownPageTC21 leads;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		leads = new LeadsdropdownPageTC21(driver);
	
	}  
	
	@Test
	public void leadsdropdown() throws Exception
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
			
			 BasePage.clickObj(leads.leadstab, "Leads Tab");
			 BasePage.waitforElementtoclick(leads.closeprompt);
			 BasePage.clickObj(leads.closeprompt, "Close Prompt");
			
			  Select dropdown = new Select(LeadsdropdownPageTC21.viewdropdown);
				List<WebElement> dd = dropdown.getOptions();
				System.out.println(dd.size());
				// Loop to print one by one
			    for (int j = 0; j < dd.size(); j++) 
			    {
			        System.out.println(dd.get(j).getText());

			    }
			   // driver.close();
			    System.out.println("TC_21_opportunitiesdropdown is completed");
		
		
	}

}
