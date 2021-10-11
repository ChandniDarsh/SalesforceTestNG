package Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	private WebDriver driver;

	public WebDriver getDriver(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
	}	
	 public static void takescreenshot(WebDriver driver) throws IOException {
			
		  TakesScreenshot scrShot = ((TakesScreenshot)driver);
		  File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		  
		  	Date currentDate = new Date();
		  	String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentDate);
		  	String fileSeperator = System.getProperty("file.separator");
		    String reportFilepath = System.getProperty("user.dir") +fileSeperator+ "Screenshot";
		    String reportFileName = "ScreenShot"+timestamp+".png";
		    String filePath =  reportFilepath +fileSeperator+ reportFileName;
		    File DestFile = new File(filePath);
		    FileUtils.copyFile(srcFile, DestFile);
		
	}
	 
	/*
	 * @AfterMethod
	 * 
	 * public void teardown() throws IOException { takescreenshot(driver);
	 * driver.close();
	 * 
	 * }
	 */
		 
		
	}

