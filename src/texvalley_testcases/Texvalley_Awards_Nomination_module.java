package texvalley_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import texvalley_Object_class.Texvalley_Award_nomination_module_obj;
import texvalley_Object_class.texvalley_base_Object_;

public class Texvalley_Awards_Nomination_module 
{
	public static WebDriver driver;
	
  @Test
  public void Texvalley_Awards_Nomination_module_test() throws IOException, InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tagexpo.in/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[@id='details-button']")).click();
	  driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	  
	  texvalley_base_Object_ texv=PageFactory.initElements(driver, texvalley_base_Object_.class);
	  Texvalley_Award_nomination_module_obj nominate=PageFactory.initElements(driver, Texvalley_Award_nomination_module_obj.class);
	  
      texv.awardnominationlink.click();
	  
      nominate.name.sendKeys("dddddd22222");
	  nominate.email.sendKeys("rrrrrr333::::");
	  nominate.storename.sendKeys("roooo7777");
	  Thread.sleep(2000);
	  nominate.geography1.click();
	  nominate.geography2.click();
	  Thread.sleep(2000);
	  nominate.title.sendKeys("rrrrr55555333");
	  nominate.media1.click();
	  nominate.media2.click();
	  Thread.sleep(2000);
	  nominate.mediaothers.sendKeys("mmmmmm");
	  nominate.describetxt.sendKeys("avabsgvd");
	  nominate.subbtn.click();
	  Thread.sleep(3000);
      nominate.Screenshot_method(driver, "Texvalley_Award_Nomination_module");
	  
  }
}
