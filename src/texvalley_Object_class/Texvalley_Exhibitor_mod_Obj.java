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

public class Texvalley_Exhibitor_mod_Obj 
{
	public static WebDriver driver;
	
	

	@FindBy(xpath="//input[@id='name']")
    public static WebElement Company_name;	
	
	@FindBy(xpath="//input[@id='brand_name']")
    public static WebElement Brand_name;	

	@FindBy(xpath="//input[@id='address']")
    public static WebElement Address;	

	@FindBy(xpath="//input[@id='managing_director']")
    public static WebElement MD_name;	

	@FindBy(xpath="//input[@id='mobile_number']")
    public static WebElement Mob_num;	

	@FindBy(xpath="//input[@id='contact_person']")
    public static WebElement Contact_person;	

	@FindBy(xpath="//input[@id='designation']")
    public static WebElement designation;	

	@FindBy(xpath="//input[@id='pan_no']")
    public static WebElement Pan_num;	

	@FindBy(xpath="//input[@id='gst_no']")
    public static WebElement gst_num;	
	
	@FindBy(xpath="//input[@id='phone_no']")
    public static WebElement Ph_num;	
	
	@FindBy(xpath="//input[@id='email_id']")
    public static WebElement emailid;	
	
	@FindBy(xpath="//input[@id='website']")
    public static WebElement website;	
	
	@FindBy(xpath="//button[text()='Proceed']")
    public static WebElement Proceedbtn;	
	
	
	@FindBy(xpath="//input[@id='category_2'][@value='Agent']")
	public static WebElement Category_click;
	
	@FindBy(xpath="//input[@id='other_category']")
	public static WebElement categorytext;
	
	@FindBy(xpath="//input[@id='products_on_display_6']")
    public static WebElement product_display;
	
	@FindBy(xpath="//input[@id='other_products_on_display']")
	public static WebElement product_display_text;
	
	@FindBy(xpath="//input[@id='acknowledge_check']")
	public static WebElement acknowledgeclick;
	
	@FindBy(xpath="//button[text()='Submit']")
	public static WebElement subbtn;
	
	

	public void Jse_command(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",Category_click);
	
	}
	public void Jse_command_2(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='ffffff';", categorytext);
	}
	public void Jse_command_3(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='ffffff';", product_display_text);
	}
	
	
	
	
	
	
	
	public void Screenshot_method(WebDriver driver,String name) throws IOException
	{
		 File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("C:\\Users\\Sachithanandhan.S\\eclipse-workspace\\Texvalley_Live_site\\test-output\\Texvalley_Live\\"+ name +".png"));
	}

}
