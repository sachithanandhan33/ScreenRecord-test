package texvalley_Object_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

public class Texvalley_Registration_Label_Obj 
{
public static WebDriver driver;
 
	
	@FindBy(xpath="//label[text()='Register']")
	public static WebElement registerclick;
	
	@FindBy(xpath="//a[text()=' Awards']")
	public static WebElement awardclick;
	
	@FindBy(xpath="//a[text()='Exhibitors']")
	public static WebElement exhibitorclick;
	
	@FindBy(xpath="//a[text()=' Vistor']")
	public static WebElement visitorclick;
	
	@FindBy(xpath="//a[text()=' Buyer']")
	public static WebElement buyerclick;
	
	@FindBy(xpath="//button[text()='Explore More']")
	public static WebElement exploremore;
	
	@FindBy(xpath="//input[@name='email']")
	public static WebElement entermail;
	
    @FindBy(xpath="//button[@name='submit']")
    public static WebElement subbtn;
    
   
    public void Screenshot_method(WebDriver driver,String name) throws IOException
	{
		 File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("C:\\Users\\Sachithanandhan.S\\eclipse-workspace\\Texvalley_Live_site\\test-output\\Texvalley_Live\\"+ name +".png"));
	}
    
	
}
