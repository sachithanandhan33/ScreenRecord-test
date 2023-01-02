package texvalley_Object_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

public class Texvalley_Award_nomination_module_obj 
{
	
  public static WebDriver driver;
  
  @FindBy(xpath="//input[@id='fname']")
	public static WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement email;

	@FindBy(xpath="//input[@id='store_name']")
	public static WebElement storename;

	@FindBy(xpath="//input[@id='gravity_covered1'][@value='South']")
	public static WebElement geography1;
	
	@FindBy(xpath="//input[@id='gravity_covered2'][@value='North']")
	public static WebElement geography2;

	@FindBy(xpath="//input[@id='title']")
	public static WebElement title;

	@FindBy(xpath="//input[@id='campaignMedia1'][@value='News Paper']")
	public static WebElement media1;
	
	@FindBy(xpath="//input[@id='campaignMedia3'][@value='TV Commercial']")
	public static WebElement media2;

	@FindBy(xpath="//input[@id='campaignMedia5']")
	public static WebElement mediaothers;

	@FindBy(xpath="//textarea[@id='msg']")
	public static WebElement describetxt;
	
	@FindBy(xpath="//span[text()='Submit']")
	public static WebElement subbtn;
	
	
	public void Screenshot_method(WebDriver driver,String name) throws IOException
	{
		 File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("C:\\Users\\Sachithanandhan.S\\eclipse-workspace\\Texvalley_Live_site\\test-output\\Texvalley_Live\\"+ name +".png"));
	}
	
	

}
