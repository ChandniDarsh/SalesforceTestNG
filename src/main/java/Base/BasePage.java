package Base;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.MapReduceCommand.OutputType;

public class BasePage {

	protected static WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	
		public static void waitforElementtoclick(WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		
		public void waitforElementtobeclick(WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
		

		
		
		
		
		public static void waitforElementtoselect(WebElement element) {
			
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		
		public static void waitforElementtovisible(WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		public static void switchFrame(WebElement element) {
			driver.switchTo().frame(element);
		}
		
		public static void waitforframetovisiblity(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.switchTo().frame(element);
		}
	
		public void waitforwindow(String element) {
			driver.switchTo().window(element);
		}
		
		
		
		public static void switchdefaultFrame( WebDriver driver)
		{
		driver.switchTo().defaultContent();
		System.out.println("Pass: we can switch to the "+ driver + " back to frame");
		
		}
		
		

		 public static void enterText(WebElement obj,String textval,String objName) throws Exception

		 {
		  if(obj.isDisplayed())
		  {
		   Thread.sleep(4000);
		   obj.sendKeys(textval);
		   System.out.println("pass: "+textval+"value is entered in "+objName+"field");
		  }
		  else
		  {
		   System.out.println("fail:" +objName+ "field does not exist please check application");
		  }
		 }
	
		 
		 public static void selectCheckBox(WebElement obj, String objName) {
			  
			  if(obj.isDisplayed()) {
			   
			   if(obj.isSelected()) {
			    System.out.println("Pass: "+objName+" is already selected");

			   }else{
			   obj.click();
			   System.out.println("Pass: "+objName+" is selected");
			
			      }}
			   else {
			   System.out.println("Fail:"+objName+" is not present.Please chk application"); 
			
			  } 
			 }
		 
		 
		 public static void clickObj(WebElement obj,String objName)
			{
				if(obj.isDisplayed())
				{
					obj.click();
					System.out.println("pass :" +objName + "button is clicked");

				}
				else
				{
					System.out.println("Fail:" +objName+"button is not displayed ,please check the application");

				}
			}
		 
		 
		 public static void switchtoAlert(WebDriver driver) {
			 driver.switchTo().alert().accept();
			 System.out.println("Pass: alert is present and accept");
		}
		

		 public static void selectByVisibleText(WebElement obj, String Name) {
				if(obj.isDisplayed()) {
					 Select drop = new Select(obj);
					 drop.selectByVisibleText(Name);
				 System.out.println("Pass: dropdown is selected");
				 }else {
				 System.out.println("Fail: dropdown is not available check your application");
				 }
				 }
		
		 public static void Radiobutton(WebElement obj, String objName) {
				
				if(obj.isDisplayed() ){
					obj.click();
					System.out.println("Pass: "+objName+" is clicked");
				}else {
					System.out.println("Fail:"+objName+" is not displayed .Please check your application");			
				}
			}
		 
		 
		 public static void mouseOver(WebDriver driver,WebElement obj) {
				if(obj.isDisplayed()) {
			   Actions action=new Actions(driver);
			   action.moveToElement(obj).build().perform();
				System.out.println("Pass: "+obj+" is present");

				}
			 else {
					System.out.println("Fail:"+obj+" is not present.Please chk application");

				}
			}
		 
		 
		
}
		 
		 
		 
		
	


		
	