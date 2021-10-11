package Test;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.HomePageTC36;
import Page.HomePageTC37;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class HomeTestTC37 extends BaseTest{
	WebDriver driver;
	LoginPage login;
	BasePage base;
	HomePageTC37 homep;
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException 
	{
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);
		homep = new HomePageTC37(driver);
	
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
			 BasePage.waitforElementtoclick(homep.currentdate);
			 BasePage.clickObj(homep.currentdate, "CurrentDate");
			 BasePage.waitforElementtoclick(homep.time);
			 BasePage.clickObj(homep.time, "Time");
			 BasePage.clickObj(homep.comboboxicon, "Comobox");
			 Set<String> windowHandles = driver.getWindowHandles();
				String currentHandle = driver.getWindowHandle();
				windowHandles.remove(currentHandle);
				String newHandle = windowHandles.iterator().next();
				driver.switchTo().window(newHandle);
				//waitforElementtobeclick(other);
				//Thread.sleep(20000);
				// BasePage.clickObj(homep.other, "Others");
				 BasePage.clickObj(homep.endtime, "EndTime");
				 BasePage.waitforElementtoclick(homep.recurrence);
				 BasePage.clickObj(homep.recurrence, "Recurrence");
				 BasePage.Radiobutton(homep.weeklyradiobtn,"Weekly Radiobtn");
				 homep.enddate.clear();
				 BasePage.enterText(homep.enddate, "10/21/2021", "Enddate");
				 BasePage.clickObj(homep.savebtn, "Savebtn");
				 BasePage.waitforElementtoclick(homep.monthview);
				 BasePage.clickObj(homep.monthview, "MonthView");
			 
	}


}
