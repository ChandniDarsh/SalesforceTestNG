package Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;

import Page.LoginPage;
import Page.SettingsPage;
import Utilities.CommonUtilities;

public class SettingsTest extends BaseTest{
		WebDriver driver;
		
		LoginPage login;
		BasePage base;
		SettingsPage settings;
		CommonUtilities common = new CommonUtilities();
	 
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		settings = new SettingsPage(driver);
	
	}
	
	@Test
	public void validateMySetting() throws InterruptedException, Exception
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
			
			
			BasePage.clickObj(settings.Usermenu, "User Manu");
			BasePage.waitforElementtoclick(settings.mysettings);
			BasePage.clickObj(settings.mysettings, "My Settings");
			BasePage.waitforElementtoclick(settings.personal);
			BasePage.clickObj(settings.personal, "Personal");
			BasePage.waitforElementtoclick(settings.loginhistory);
			BasePage.clickObj(settings.loginhistory, "Login History");
			BasePage.waitforElementtoclick(settings.downloadhistory);
			BasePage.clickObj(settings.downloadhistory, "Download History");
			BasePage.waitforElementtoclick(settings.DisplayandLayout);
			BasePage.clickObj(settings.DisplayandLayout, "Display Layout");
			BasePage.waitforElementtoclick(settings.customizetab);
			BasePage.clickObj(settings.customizetab, "Customize Tab");
			BasePage.waitforElementtoclick(settings.dropdown);
			BasePage.clickObj(settings.dropdown, "Dropdown");
			BasePage.clickObj(settings.availabletab, "Available");
			
			Select dropdownOptions = new Select(settings.dropdownbox); 
			
			//dropdownOptions.selectByVisibleText("Salesforce Chatter");
			//dropdownOptions = new Select(settings.availabletab); 
			//dropdownOptions.selectByValue("report");
			BasePage.clickObj(settings.addarrow, "Addarrow");
			BasePage.clickObj(settings.saveall, "Saveallbtn");
			dropdownOptions = new Select(settings.dropdownbox); 
			List<WebElement> elements = dropdownOptions.getOptions();
			for(int i=0; i<elements.size(); i++) {
				if(elements.get(i).getText().equals("report")) {
					System.out.println("Reports Tab is added");	
				}
				else {
					System.out.println("Reports Tab is  not added");
				}
			}
		}
			
		 
	@Test	
		 public void validateMySetting1() throws Exception
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
			
			
			BasePage.clickObj(settings.Usermenu, "User Manu");
			BasePage.clickObj(settings.mysettings, "My Settings");
			BasePage.waitforElementtoclick(settings.email);
			BasePage.clickObj(settings.email, "email");
			BasePage.waitforElementtoclick(settings.myemailsettings);
			BasePage.clickObj(settings.myemailsettings, "My EmailSettings");
			BasePage.waitforElementtoclick(settings.emailname);
			settings.emailname.clear();
			BasePage.enterText(settings.emailname, "Chandni Darsh","Email Name");
			BasePage.waitforElementtoclick(settings.emailaddress);
			settings.emailaddress.clear();
			BasePage.enterText(settings.emailaddress, "233chandni@desai.com","Email Address");
			BasePage.waitforElementtoclick(settings.automaticbcc);
			BasePage.clickObj(settings.automaticbcc, "Auto Bcc Radiobtn");
			BasePage.clickObj(settings.savebutton, "Save Btn");
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ESCAPE).build().perform();
		
		}
	
	@Test	
	 public void validateMySetting2() throws InterruptedException, Exception
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
			
			
			BasePage.clickObj(settings.Usermenu, "User Manu");
			BasePage.clickObj(settings.mysettings, "My Settings");
			BasePage.waitforElementtoclick(settings.calanderandreminder);
			BasePage.clickObj(settings.calanderandreminder, "CalenderReminder");
			BasePage.clickObj(settings.activityreminder, "ActivityReminder");
			BasePage.clickObj(settings.opentestreminder, "OpenStremreminder");
			System.out.println("TestCase7 Is Complete");	
	
	}
	
	
		 
		
	}
	
	

