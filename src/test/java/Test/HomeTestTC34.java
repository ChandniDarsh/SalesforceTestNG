package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.HomePageTC33;
import Page.HomePageTC34;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class HomeTestTC34 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	HomePageTC34 homep;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		homep = new HomePageTC34(driver);
	
	}  
	
	@Test
	public void validateHomeTC34() throws Exception
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
			
			 BasePage.clickObj(homep.hometab, "Home Tab");
			 BasePage.waitforElementtoclick(homep.closeprompt);
			 BasePage.clickObj(homep.closeprompt, "Close Prompt");
			 BasePage.clickObj(homep.firstandlastnm, "firstlastname");
			 BasePage.clickObj(homep.editprofile, "EditProfile");
			 BasePage.waitforElementtovisible(homep.ifram);
			 BasePage.switchFrame(homep.ifram);
			 BasePage.waitforElementtoclick(homep.about);
			 BasePage.clickObj(homep.about, "About");
			 homep.updateLastNameField.clear();
			 BasePage.enterText(homep.updateLastNameField, "ABCD ", "Updatelastname");
			 BasePage.waitforElementtoclick(homep.saveallbtn);
			 BasePage.clickObj(homep.saveallbtn, "Savebtn");
			 System.out.println("TC34_EditedLastName Executed sucessfully");
	}

}
