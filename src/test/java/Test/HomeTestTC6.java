package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasePage;
import Base.BaseTest;
import Page.HomePageTC6;
import Page.LoginPage;
import Utilities.CommonUtilities;

public class HomeTestTC6 extends BaseTest{
	WebDriver driver;
	HomePageTC6 home;
	LoginPage login;
	BasePage base;
	CommonUtilities common = new CommonUtilities();
 
@BeforeMethod
public void beforeTest() throws IOException 
{
	driver = getDriver();
	String url = common. getApplicationproperty("url");
	driver.get(url);
	login = new LoginPage(driver);
	home = new HomePageTC6(driver);
	
	
}

@Test
public void validateHome() throws Exception
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
		
		//UPDATE LAST NAME
		BasePage.clickObj(home.Usermenu, "User Manu");
		BasePage.clickObj(home.myprofile, "My Profile");
		BasePage.clickObj(home.myeditprofile, "My Edit profile");
		//BasePage.waitforframetovisiblity(home.editprofileframe);
		BasePage.switchFrame(home.editprofileframe);
		BasePage.clickObj(home.aboutTab, "About");
		home.updateLastNameField.clear();
		BasePage.waitforElementtovisible(home.updateLastNameField);
		BasePage.enterText(home.updateLastNameField, "Desai","Last Name");
		BasePage.waitforElementtoclick(home.btnsaveall);
		BasePage.clickObj(home.btnsaveall, "SaveBtn"); 
		 
		
		//POST
		BasePage.waitforElementtoclick(home.post);
		BasePage.clickObj(home.post, "Post");
		BasePage.switchFrame(home.TextEditor);
		BasePage.enterText(home.EnterText, "I am ChandniDarsh","Post Content");
		BasePage.switchdefaultFrame(driver);
		BasePage.waitforElementtoclick(home.Share);
		BasePage.clickObj(home.Share, "Share Btn");
		
		
		//UPLOAD FILE
		BasePage.waitforElementtoclick(home.file);
		BasePage.clickObj(home.file, "File Upload");
		//BasePage.waitforElementtovisible(home.ComFileUpload);
		//Thread.sleep(10000);
		BasePage.clickObj(home.ComFileUpload, "Upload File From Com");
		BasePage.waitforElementtoclick(home.ChooseFilebtn);
		BasePage.clickObj(home.ChooseFilebtn, "ChooseFile Btn");
		BasePage.enterText(home.ChooseFilebtn, "D:\\11.png", "choosefile");
		BasePage.clickObj(home.Sharebtn, "Share Btn");
		
		//Upload Photo
		BasePage.mouseOver(driver, home.moderat);
		BasePage.waitforElementtoclick(home.AddPhoto);
		BasePage.clickObj(home.AddPhoto, "Add Photo");
		//BasePage.waitforframetovisiblity(home.iframe);
		//BasePage.switchFrame(home.iframe);
		BasePage.waitforElementtoclick(home.Choosefile);
		BasePage.clickObj(home.Choosefile, "Choose File");
		BasePage.enterText(home.Choosefile, "D:\\IMG_20190122_155510_739_Original.jpg", "profile photo");
		BasePage.waitforElementtoclick(home.Savebtn);
		BasePage.clickObj(home.Savebtn, "Savebtn");
		System.out.println("TC06_MyProfile completed successfully");
		
		
		
		
		
		
		//@AfterMethod
		/*public void teardown() 
		{
			driver.close();
		}*/
		
		
		
}
}
