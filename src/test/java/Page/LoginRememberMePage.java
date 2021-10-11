package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class LoginRememberMePage extends BasePage {

	public LoginRememberMePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@id='userNav-arrow']")
	public WebElement Usermenu;

	@FindBy(xpath = "//a[contains(@class,'menuButtonMenuLink')][contains(text(),'Logout')]")
	public WebElement Logout;
	
	@FindBy(xpath = "//span[@id='idcard-identity']")
	public WebElement expectedTitle1;

}
