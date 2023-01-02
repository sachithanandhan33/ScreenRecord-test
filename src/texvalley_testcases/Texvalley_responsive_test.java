package texvalley_testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import texvalley_Object_class.texvalley_base_Object_;

public class Texvalley_responsive_test 
{
	
	public static WebDriver driver;
 	 
	  @DataProvider
	  public Object[][] mobileEmulation()
	  {
		return new Object[][]
				{
			       
			{"Galaxy Note 3"},
			{"iPhone SE"}, 
			{"iPad Mini"},
			{"Galaxy S5"},
			{"iPad Pro"},
			{"Samsung Galaxy S20 Ultra"},
			
		};
		  
	  }


		    @SuppressWarnings("deprecation")
			@Test(dataProvider="mobileEmulation")
		    
		    public void beforeTestMethod(String emulator) throws InterruptedException
		    {

		  	 System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
             Map<String,String> emulator1=new HashMap<>();
             emulator1.put("deviceName", emulator);
             ChromeOptions chromeopt=new ChromeOptions();
             chromeopt.setExperimentalOption("mobileEmulation", emulator1);
             
                WebDriver driver = new ChromeDriver(chromeopt);
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.get("https://tagexpo.in/");
		        //Thread.sleep(10000);
		        Shutterbug.shootPage(driver,Capture.FULL,true).save("C:\\Users\\Sachithanandhan.S\\eclipse-workspace\\Texvalley_Live_site\\test-output\\Texvalley_Live\\Fullscreen.png"+"deviceName");

				/*
				 * texvalley_base_Object_ texv=PageFactory.initElements(driver,
				 * texvalley_base_Object_.class); texv.scrolling(driver);
				 * 
				 * driver.findElement(By.
				 * xpath("//button[@class='elementskit-menu-hamburger elementskit-menu-toggler']"
				 * )).click(); Thread.sleep(2000); driver.findElement(By.
				 * xpath("//button[@class='elementskit-menu-close elementskit-menu-toggler']")).
				 * click(); Thread.sleep(2000);
				 * 
				 * driver.findElement(By.
				 * xpath("//button[@class='elementskit-menu-hamburger elementskit-menu-toggler']"
				 * )).click(); driver.findElement(By.linkText("Show Info")).click();
				 * Thread.sleep(2000);
				 * 
				 * JavascriptExecutor js=(JavascriptExecutor)driver;
				 * js.executeScript("window.scrollBy(0,1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,-1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,-1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,-1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,-1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,-1000);"); Thread.sleep(2000);
				 * js.executeScript("window.scrollBy(0,-1000);"); Thread.sleep(2000);
				 * 
				 * 
				 * 
				 * driver.quit();
				 */
		    }
  }
  
