package texvalley_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import texvalley_Object_class.Texvalley_Exhibitor_mod_Obj;
import texvalley_Object_class.texvalley_base_Object_;

public class Texvalley_Exhibitor_module 
{
	
	public static WebDriver driver;
	
	
  @SuppressWarnings({ "static-access", "deprecation" })
@Test
  public void Texvalley_Exhibitor_module_test() throws InterruptedException, IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tagexpo.in/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[@id='details-button']")).click();
	  driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	  	  
	  texvalley_base_Object_ texv=PageFactory.initElements(driver, texvalley_base_Object_.class);
	  Texvalley_Exhibitor_mod_Obj exhibitor=PageFactory.initElements(driver, Texvalley_Exhibitor_mod_Obj.class);
	    
	  texv.forexhibitorslink.click();
	  driver.findElement(By.xpath("//button[text()='Click to Exhibit']")).click();
      Thread.sleep(2000);
      
	  exhibitor.Company_name.sendKeys("infinity");
	  exhibitor.Brand_name.sendKeys("lllllllll");
	  exhibitor.Address.sendKeys("rrrrrrrrr");
	  exhibitor.MD_name.sendKeys("AAAAAA");
	  exhibitor.Mob_num.sendKeys("3333hhhhh");
	  exhibitor.Contact_person.sendKeys("eeeeeeeeeee");
	  exhibitor.designation.sendKeys("wwwwwww");
	  exhibitor.Pan_num.sendKeys("wwwccooppp");
	  exhibitor.gst_num.sendKeys("nnnnnnn");
	  exhibitor.Ph_num.sendKeys("11111111111111111111");
	  exhibitor.emailid.sendKeys("44444444");
	  exhibitor.website.sendKeys(".com");
	  exhibitor.Proceedbtn.click();
	  Thread.sleep(6000);

	  exhibitor.Jse_command(driver);
	  exhibitor.Jse_command_2(driver);
	  Thread.sleep(3000);

	  exhibitor.product_display.click();
      exhibitor.Jse_command_3(driver);
	  exhibitor.acknowledgeclick.click();
	  exhibitor.subbtn.click();
	  Thread.sleep(3000);
	  
	  exhibitor.Screenshot_method(driver, "Texvalley_Exhibitor_module");
	  
	  
	  
	  
  }
}
