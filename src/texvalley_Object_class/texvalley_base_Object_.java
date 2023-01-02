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

public class texvalley_base_Object_ 
{
	public static WebDriver driver;
	
	
	@FindBy(linkText="Show Info")
    public static WebElement showinfolink;	
	
	@FindBy(linkText="For Visitors")
    public static WebElement forvisitorslink;	
	
	@FindBy(linkText="For Buyers")
    public static WebElement forbuyerslink;	
	
	@FindBy(linkText="For Exhibitors")
    public static WebElement forexhibitorslink;	
	
	@FindBy(xpath="//li[@id='menu-item-8295']/a[text()=' Award Nominations']")
    public static WebElement awardnominationlink;	
	
	@FindBy(xpath="//li[@id='menu-item-18343']/a[text()='Gallery']")
    public static WebElement gallerylink;	
	
	@FindBy(xpath="//li[@id='menu-item-82945']/a[@class='ekit-menu-nav-link ekit-menu-dropdown-toggle button']")
    public static WebElement exh_brochurelink;	
	
	@FindBy(xpath="//li[@id='menu-item-829467']/a[text()='Calendar Download']")
    public static WebElement calendarlink;	
	
	/*
	 * @FindBy(linkText="For Buyers") public static WebElement forbuyerslink;
	 * 
	 * @FindBy(linkText="For Buyers") public static WebElement forbuyerslink;
	 */	
	
	
		
	
	public void Screenshot_method(WebDriver driver,String name) throws IOException
	{
		 File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(file, new File("C:\\Users\\Sachithanandhan.S\\eclipse-workspace\\texvalley_static_site\\test-output\\texvalley_screenshots\\"+ name +".png"));
	}

	public void scrolling(WebDriver driver) throws InterruptedException
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,3000);");
		 Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,-3000);");

	 }
	
	

}
