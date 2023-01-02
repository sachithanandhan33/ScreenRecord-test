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

public class Texvalley_visitor_module_obj 
{
	public static WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='fname']")
    public static WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
    public static WebElement mail;
	
	@FindBy(xpath="//input[@id='number']")
    public static WebElement phno;
	
	@FindBy(xpath="//input[@id='company']")
    public static WebElement company;
	
	@FindBy(xpath="//textarea[@id='msg']")
    public static WebElement message;
	
	@FindBy(xpath="//button[@class='btn-submit']")
    public static WebElement subbtn;
	
	
	
	
	public void Screenshot_method(WebDriver driver,String name) throws IOException
	{
		 File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("C:\\Users\\Sachithanandhan.S\\eclipse-workspace\\Texvalley_Live_site\\test-output\\Texvalley_Live\\"+ name +".png"));
	}

	public void scrolling(WebDriver driver) throws InterruptedException
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,3000);");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,-3000);");

	 }
	
	
	
	

}
