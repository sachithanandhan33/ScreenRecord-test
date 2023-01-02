package texvalley_Object_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

public class Texvalley_Buyer_Objects 
{
	public static WebDriver driver;

	@FindBy(linkText="For Buyers")
    public static WebElement forbuyerslink;	
	
	@FindBy(xpath="//input[@name='company_name']")
	public static WebElement company_name;
	
	@FindBy(xpath="//input[@name='brand_name']")
	public static WebElement brand_name;

	@FindBy(xpath="//input[@name='address']")
	public static WebElement address;
	
	@FindBy(xpath="//input[@name='managing_director']")
    public static WebElement mang_director;
	
	@FindBy(xpath="//input[@name='referal_mobile_no']")
	public static WebElement refermobnum;
	
	@FindBy(xpath="//input[@name='contact_person']")
     public static WebElement contact_person;
	
	@FindBy(xpath="//input[@name='designation']")
	public static WebElement designation;
	
	@FindBy(xpath="//input[@name='gst_no']")
    public static WebElement gst;
	
	@FindBy(xpath="//input[@name='email_id']")
    public static WebElement email;
	
	@FindBy(xpath="//input[@name='mobile_no']")
    public static WebElement mobile;
	
	@FindBy(xpath="//input[@name='website']")
	public static WebElement website;
	
	@FindBy(xpath="//input[@name='association_details']")
	public static WebElement association;
	
	@FindBy(xpath="//input[@value='Online Brand']")
    public static WebElement businesstype;
	
	@FindBy(xpath="//input[@value='Chain Store'][@type='checkbox']")
	public static WebElement businesstype1;
	
	@FindBy(xpath="//input[@value='others']")
	public static WebElement othersclick;
	
	@FindBy(xpath="//input[@id='new_business']")
	public static WebElement newbusiness;
	
	@FindBy(xpath="//input[@value='Home Textiles']")
	public static WebElement product;
	
	@FindBy(xpath="//input[@value='Wedding']")
	public static WebElement product2;
		
	@FindBy(xpath="//input[@name='other_product']")
	public static WebElement othersclick2;
	
	@FindBy(xpath="//input[@id='new_product']")
	public static WebElement product_others;
	
	@FindBy(xpath="//input[@value='no'][@name='interest_b2b_meet']")
	public static WebElement b2bmeet;
	
	@FindBy(xpath="//input[@value='28 Jan 2023']")
    public static WebElement date;
	
	@FindBy(xpath="//input[@name='fashion_show_visit'][@value='yes']")
	public static WebElement fashionvisit;
	
	@FindBy(xpath="//input[@name='other_requirement']")
    public static WebElement otherreq;
	
	@FindBy(xpath="//input[@id='acknowledge_check']")
	public static WebElement acknowledgement;
	
	@FindBy(xpath="//button[@value='register']")
    public static WebElement register;
	
	
	
	public void Screenshot_method(WebDriver driver,String name) throws IOException
	{
		 File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("C:\\Users\\Sachithanandhan.S\\eclipse-workspace\\Texvalley_Live_site\\test-output\\Texvalley_Live\\"+ name +".png"));
	}
	
	
	

}
