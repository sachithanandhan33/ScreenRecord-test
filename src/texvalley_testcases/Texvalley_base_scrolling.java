package texvalley_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import texvalley_Object_class.texvalley_base_Object_;


public class Texvalley_base_scrolling 
{ 
	public static WebDriver driver;
  @Test
  public void Basic_scrolling_test() throws InterruptedException 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tagexpo.in/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[@id='details-button']")).click();
	  driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	  
	  
	  texvalley_base_Object_ texv=PageFactory.initElements(driver, texvalley_base_Object_.class);
	  texv.scrolling(driver);
	  
	  texv.showinfolink.click();
	  texv.scrolling(driver);
	  
	  texv.forvisitorslink.click();
	  texv.scrolling(driver);
	  
	  texv.forbuyerslink.click();
	  texv.scrolling(driver);
	  
	  texv.forexhibitorslink.click();
	  texv.scrolling(driver);
	  
	  driver.findElement(By.xpath("//button[text()='Click to Exhibit']")).click();
	  driver.navigate().to("https://tagexpo.in/");
	  Thread.sleep(2000);
 
	  texv.awardnominationlink.click();
	  texv.scrolling(driver);

	  texv.gallerylink.click();
	  texv.scrolling(driver);

	  texv.exh_brochurelink.click();
	  driver.navigate().to("https://tagexpo.in/");
	  Thread.sleep(2000);

	  texv.calendarlink.click();
	  driver.navigate().to("https://tagexpo.in/");
	  Thread.sleep(2000);
	  
	  driver.quit();
	  
	  
	  
	  
	  
  }
}
