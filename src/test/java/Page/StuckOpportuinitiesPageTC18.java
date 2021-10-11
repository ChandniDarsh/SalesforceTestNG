package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class StuckOpportuinitiesPageTC18 extends BasePage{

	public StuckOpportuinitiesPageTC18(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[contains(@title,'Opportunities Tab')]")
	public WebElement opportunitietab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//a[contains(text(),'Stuck Opportunities')]")
	public WebElement stuckopp;
	
	
	
	

}
