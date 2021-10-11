package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BasePage;
import Base.BaseTest;
import Page.LoginPage;
import Page.QSPageTC19;
import Page.StuckOpportuinitiesPageTC18;
import Utilities.CommonUtilities;

public class QSTestTC19 extends BaseTest{
	WebDriver driver;
	
	LoginPage login;
	BasePage base;
	QSPageTC19 opportunities;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		opportunities = new QSPageTC19(driver);
	
	}  
	
	@Test
	public void QsTC19() throws Exception
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
			
			 BasePage.clickObj(opportunities.opportunitietab, "Oppo Tab");
			 BasePage.waitforElementtoclick(opportunities.closeprompt);
			 BasePage.clickObj(opportunities.closeprompt, "Close Prompt");
			 BasePage.clickObj(opportunities.CurrentNextfaq, "Current nextfaq");
			 BasePage.clickObj(opportunities.openopp, "Open Opp");
			 BasePage.clickObj(opportunities.btnreport, "Report Btn");
			 System.out.println("Btnreport is clicked");
			 System.out.println("TC_19_TestQuarterlySummaryReport is completed");
		
		
	}

}
