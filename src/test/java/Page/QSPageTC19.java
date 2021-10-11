package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.BasePage;

public class QSPageTC19 extends BasePage{

	public QSPageTC19(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(@title,'Opportunities Tab')]")
	public WebElement opportunitietab;
	
	@FindBy(xpath = "//a[contains(@id,'tryLexDialogX')]")
	public WebElement closeprompt;
	
	@FindBy(xpath = "//select[contains(@name,'quarter_q')]//option[contains(@value,'next1')]")
	public WebElement CurrentNextfaq;
	
	@FindBy(xpath = "//select[contains(@name,'open')]//option[contains(text(),'Open Opportunities')]")
	public WebElement openopp;
	
	@FindBy(xpath = "//input[contains(@class,'btn')][contains(@value,'Run Report')]")
	public WebElement btnreport;
	
	public void QSTC19()
	{
		opportunitietab.click();
		 waitforElementtoclick(closeprompt);
		 closeprompt.click();
		 CurrentNextfaq.click();
		 openopp.click();
		 btnreport.click();
		 System.out.println("Btnreport is clicked");
	}
}
