package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BasePage;
import Base.BaseTest;
import Page.LoginPage;
import Utilities.CommonUtilities;

	public class LoginTest extends BaseTest {
	
	WebDriver driver;
	LoginPage login;
	
	
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforeTest() throws IOException {
		driver = getDriver();
		String url = common. getApplicationproperty("url");
		driver.get(url);
		login = new LoginPage(driver);	
		
		
	}
	
	
	
	@Test
	
	  public void validateLogin() throws Exception {
		 String Username = common.getApplicationproperty("Uname");
		  login.enterintoUsrname(Username);
		  String Password = common.getApplicationproperty("pwd");
		  BasePage.enterText(login.enterIntoPassword(), Password, "Passwordtext");
		  BasePage.selectCheckBox(login.checkRememberme(), "RememberMe");
		  BasePage.clickObj(login.LogoutButton(), "Login");
		 
	 
	  
		  
	  }
	
	
	 @Test(description = "Login Error Message - 1")
	 public void LoginErrorMessage1() throws InterruptedException, IOException {

	  String Username = common.getApplicationproperty("Uname");
	  login.enterintoUsrname(Username);
	  login.enterIntoPassword(" ");
	  login.clickLoginBtn();
	  String errormessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
	  if (errormessage.equals("Please enter your password.")) {
	   System.out.println("Error message is been be displayed");
	  } else {
	   System.out.println("Error message is not been be displayed");
	  }

	 }

	 @Test(description = "Login To SalesForce -2")
	 public void LoginToSalesForce2() throws Exception {

	  String Username = common.getApplicationproperty("Uname");
	  BasePage.enterText(login.enterintoUsername(), Username, "Username");
	  String Password = common.getApplicationproperty("pwd");
	  BasePage.enterText(login.enterIntoPassword(), Password, "Passwordtext");
	  BasePage.selectCheckBox(login.checkRememberme(), "RememberMe");
	  BasePage.clickObj(login.LogoutButton(), "Login");
	  String actualTitle = driver.getTitle();
	  driver.manage().window().maximize();
	  String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
	  if (actualTitle.equalsIgnoreCase(expectedTitle))
	   System.out.println("User is on home page");
	  else
	   System.out.println("home page is not Lunched");
	 }

	 @Test(description = "Check RemeberMe - 3")
	 public void Check_RemeberMe_3() throws Exception {
	  String Username = common.getApplicationproperty("Uname");
	  BasePage.enterText(login.enterintoUsername(), Username, "Username");
	  String Password = common.getApplicationproperty("pwd");
	  BasePage.enterText(login.enterIntoPassword(), Password, "Passwordtext");
	  BasePage.selectCheckBox(login.checkRememberme(), "RememberMe");
	  BasePage.clickObj(login.LogoutButton(), "Login");
	  BasePage.clickObj(login.LogoutButton(), "Usermenu");
	  BasePage.clickObj(login.LogoutButton(), "Logout");
	  String	expectedUrl1 = driver.getCurrentUrl();
		String	actualUrl1 = "https://login.salesforce.com/";
			
		if(actualUrl1.equalsIgnoreCase(expectedUrl1)) {
				System.out.println("User is not in login page");
		}
			else {
				System.out.println("User is on login page");
			}
		driver.close();
		
	  
	 
	 }
	 
	 @Test(description = "Forgot Password- 4")
	 public void Forgot_Password_4_A() throws Exception {
	  String Username = common.getApplicationproperty("Uname");
	  BasePage.enterText(login.enterintoUsername(), Username, "Username");
	  BasePage.clickObj(login.forgotPassword(), "ForgotPassword");
	  String Fname = common.getApplicationproperty("Uname");
	  BasePage.enterText(login.fullName(), Fname, "Fullname");
	  BasePage.clickObj(login.Continue(), "Continue");
	 }

	 
	 
	 @Test(description = "Wrong User Name And Password")
	 public void Forgot_Password_4_B() throws InterruptedException, IOException {

	  //String Username = common.getApplicationproperty("Uname");
	  
	  login.enterintoUsrname("1234");
	  login.enterIntoPassword("123 ");
	  login.clickLoginBtn();
	  String errormessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
	  if (errormessage.equals("Please enter your password.")) {
	   System.out.println("Error message is been be displayed");
	  } else {
	   System.out.println("Error message is not been be displayed");
	  }

	 }
	 
	 
		 
		 

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		 * public void validateLogin2() {
		 * login.enterintoUsername("233chandni@desai.com"); login.enterintoPassword("");
		 * login.clickLoginButton(); }
		 */
	
	/*public void validateLogin3() throws InterruptedException  {
		login.enterintoUsername("123");
		login.enterintoPassword("22131");
		login.clickLoginButton();
}*/
	//public void validateLogin4() {
		//login.clickonforgerpassword();
		//login.forgetpswdUsername("233chandni@desai.com");
		//login.buttoncontinue();
		
		
	

