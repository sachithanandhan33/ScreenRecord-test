package texvalley_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import texvalley_Object_class.Texvalley_Registration_Label_Obj;

public class Texvalley_Register_module 
{
	public static WebDriver driver;

  @Test
  public void Texvalley_Register_module_test() throws InterruptedException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tagexpo.in/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[@id='details-button']")).click();
	  driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	  
	  Texvalley_Registration_Label_Obj reg=PageFactory.initElements(driver, Texvalley_Registration_Label_Obj.class);
	  	  
	  reg.registerclick.click();
	  Thread.sleep(2000);
	  reg.awardclick.click();
	  Thread.sleep(2000);
	  driver.navigate().to("https://tagexpo.in/");
	  reg.registerclick.click();
	  Thread.sleep(2000);
      reg.exhibitorclick.click();
	  Thread.sleep(2000);
	  driver.navigate().to("https://tagexpo.in/");
	  reg.registerclick.click();
	  Thread.sleep(2000);
      reg.visitorclick.click();
	  Thread.sleep(2000);
	  driver.navigate().to("https://tagexpo.in/");
	  reg.registerclick.click();
	  Thread.sleep(2000);
      reg.buyerclick.click();
	  Thread.sleep(2000);
	  driver.navigate().to("https://tagexpo.in/");
	  
	  reg.exploremore.click();
	  Thread.sleep(2000);
	  driver.navigate().to("https://tagexpo.in/");
	  Thread.sleep(2000);
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
      jse.executeScript("window.scrollBy(0,3000);");
	  Thread.sleep(2000);
	  reg.entermail.sendKeys("eeeeeeeeeeeeee");
	  reg.subbtn.click();
	  Thread.sleep(2000);
      reg.Screenshot_method(driver,"Texvalley_Homepage");
	  

      	  
	  
	  
	  
	  
	  
  }
}
