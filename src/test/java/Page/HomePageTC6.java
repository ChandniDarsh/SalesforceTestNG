package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;

public class HomePageTC6 extends BasePage {
	static WebDriver driver;
	static WebDriverWait wait;
	static Actions action;
	
	public HomePageTC6(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id='userNavButton']")
	public WebElement Usermenu;

	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	public WebElement myprofile;
	
	@FindBy(xpath = "//a[contains(@class,'contactInfoLaunch editLink')]//img[contains(@title,'Edit Profile')]")
	public WebElement myeditprofile;
	
	@FindBy(xpath = ("(//iframe[@id='contactInfoContentId'])[1]"))
	public WebElement editprofileframe;
	
	@FindBy(xpath = "//a[normalize-space()='About']")
	public WebElement aboutTab;
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement updateLastNameField;
	
	@FindBy(xpath = "//input[@value='Save All']")
	public WebElement btnsaveall;
	
	//POST
	@FindBy(xpath = "//span[normalize-space()='Post']")
	public WebElement post;

	@FindBy(xpath = "//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	public WebElement TextEditor;
	
	@FindBy(xpath = "//html//body[contains(text(),'Share an update,')]")
	public WebElement EnterText;

	@FindBy(xpath = "//input[@id='publishersharebutton']")
	public WebElement Share;
	
	//FILE
	@FindBy(xpath ="//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")
	public WebElement file;
	
	@FindBy(xpath = "//a[contains(@id,'chatterUploadFileAction')]")
	public WebElement ComFileUpload;
	
	@FindBy(xpath = "//input[contains(@name,'chatterFile')]")
	public WebElement ChooseFilebtn;
	
	@FindBy(xpath = "//input[contains(@name,'publishersharebutton')]")
	public WebElement Sharebtn;
	
	//Upload Photo
	@FindBy(xpath = "//span[contains(@class,'moderatorBadge')]")
	public WebElement moderat;
	
	@FindBy(xpath = "//a[contains(@id,'uploadLink')]")
	public WebElement AddPhoto;
	
	//@FindBy(xpath = "//iframe[@id='uploadPhotoContentId']")
	//public WebElement iframe;
	
	@FindBy(xpath = "//input[contains(@id,'j_id0:uploadFileForm:uploadInputFile')]")
	public WebElement Choosefile;
	
	@FindBy(xpath = "//input[contains(@id,'j_id0:uploadFileForm:save')]")
	public WebElement Savebtn;
	
	
	
	
	
	
	
	
	
	
}
