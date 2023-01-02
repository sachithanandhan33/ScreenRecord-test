package texvalley_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import texvalley_Object_class.Texvalley_visitor_module_obj;
import texvalley_Object_class.texvalley_base_Object_;

public class Texvalley_visitor_module
{
	public static WebDriver driver;
	
  @Test
  public void Texvalley_visitor_module_test() throws InterruptedException, IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tagexpo.in/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[@id='details-button']")).click();
	  driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	  
	  Texvalley_visitor_module_obj visitor=PageFactory.initElements(driver, Texvalley_visitor_module_obj.class);
	  
	  texvalley_base_Object_ texv=PageFactory.initElements(driver, texvalley_base_Object_.class);
      texv.forvisitorslink.click();
	  
      visitor.name.sendKeys("Texvalley");
      visitor.mail.sendKeys("rrrrrrrrrrrrrrrrrrrrrrrrr");
      visitor.phno.sendKeys("e444444ttt");
      visitor.company.sendKeys("Infinityhub");
      visitor.message.sendKeys("haiiiiiiiii.....!");
      visitor.subbtn.click();
      Thread.sleep(3000);
      visitor.Screenshot_method(driver, "Texvalley_Visitor_module");
	  
  }
}
