package Page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class LoginPage extends BasePage {


	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	 @FindBy(xpath = "//input[@id='username']")
	 WebElement Uname;
	 
	 @FindBy(xpath = "//input[@id='password']")
	 WebElement pwd;
	 
		
	@FindBy(xpath = "//div[@id='error']") WebElement errormessage;
		 
	 @FindBy(xpath = "//input[contains(@name,'Login')]")
	public WebElement login;
	 
	 @FindBy(xpath = "//input[@id='rememberUn']")
	 WebElement remember;
	 
	 @FindBy(xpath = "//div[@id='userNav-arrow']")
		public WebElement Usermenu;

		@FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
		public WebElement Logout;
	 
	 @FindBy(xpath ="//a[normalize-space()='Forgot Your Password?']")
	 WebElement Fpwd;
	 
	 @FindBy(xpath = "//input[@id='un']")
	 WebElement Fname;
	 
	
	 @FindBy(xpath = "//input[@id='continue']") 
	 WebElement Conti;
	
	 
	 
	 public void enterintoUsrname(String strusername) {
		  Uname.sendKeys(strusername);
		 }

		 public void enterIntoPassword(String strpassword) {
		  pwd.sendKeys(strpassword);
		 }

		 public void clickLoginBtn() {
		//waitforElementtoclick(login);
		  login.click();
		 }
		 
		 

		 public WebElement enterintoUsername() {
		  return Uname;
		 }

		 public WebElement enterIntoPassword() {
		  return pwd;
		 }

		 public WebElement checkRememberme() {
		  return remember;
		 }

		 public WebElement UserMenu() {
			 waitforElementtovisible(Usermenu);
		  return Usermenu;
		 }
		 
		 public WebElement LogoutButton() {
			// waitforElementtoclick(Logout);
			  return Logout;
			 }
		 
		 public WebElement forgotPassword() {
		  return Fpwd;
		 }
		 public WebElement fullName() {
		  return Fname;
		 }
		public WebElement Continue() {
			return Conti;
		}

		 public void logintapplication(String strusername, String strpassword) {
		  Uname.sendKeys(strusername);
		  pwd.sendKeys(strpassword);
		  login.click();
		 }

		

		}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		 * @FindBy(xpath="//input[@id='username']") WebElement username; public void
		 * enterintoUsername(String strusername) { username.sendKeys(strusername); }
		 * 
		 * @FindBy(xpath="//input[@id='password']") WebElement password; public void
		 * enterintoPassword(String strpassword) { password.sendKeys(strpassword); }
		 * 
		 * 
		 * @FindBy(xpath="//input[@id='rememberUn']") WebElement remembercheckbox;
		 * public void checkBox() throws InterruptedException { Thread.sleep(10000);
		 * remembercheckbox.click(); }
		 * 
		 * @FindBy(xpath="//input[@id='Login']") WebElement btnLogin; public void
		 * clickLoginButton() { btnLogin.click(); }
		 * 
		 * 
		 * @FindBy(xpath="//a[normalize-space()='Logout']") WebElement Logout; public
		 * void logoutbtn() { Logout.click(); }
		 * 
		 * 
		 * @FindBy(xpath="//a[normalize-space()='Forgot Your Password?']") WebElement
		 * forgetpswdlink; public void clickonforgerpassword() { forgetpswdlink.click();
		 * }
		 * 
		 * @FindBy(xpath="//input[@id='un']") WebElement usernameforget; public void
		 * forgetpswdUsername(String strforgetusername) {
		 * usernameforget.sendKeys(strforgetusername); }
		 * 
		 * 
		 * @FindBy(xpath="//input[@id='continue']") WebElement btncontinye; public void
		 * buttoncontinue() { btncontinye.click();; }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */
	
	
	
	
	



