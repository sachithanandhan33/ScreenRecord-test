package texvalley_testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import texvalley_Object_class.Texvalley_Buyer_Objects;


public class Texvalley_Buyer_module 
{
	
	public static WebDriver driver;
	
  @SuppressWarnings({ "static-access", "deprecation" })
@Test
  public void Texvalley_Buyer_module_test() throws InterruptedException, IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://tagexpo.in/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//button[@id='details-button']")).click();
	  driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	  
	  Texvalley_Buyer_Objects buyerobj=PageFactory.initElements(driver, Texvalley_Buyer_Objects.class);
	  buyerobj.forbuyerslink.click();
	  
	  buyerobj.company_name.sendKeys("xxxxxxxxxxxxx");
	  Thread.sleep(2000);
	  buyerobj.brand_name.sendKeys("yyyyyyyyyyyyyyyyyy");
	  Thread.sleep(2000);
	  buyerobj.address.sendKeys("cccccccccccccccccccccc");
	  Thread.sleep(2000);
	  buyerobj.mang_director.sendKeys("qqqqqqqqqqq");
	  Thread.sleep(2000);
	  buyerobj.refermobnum.sendKeys("6666666666");
	  Thread.sleep(2000);
	  buyerobj.contact_person.sendKeys("eeeeeee");
	  Thread.sleep(2000);
	  buyerobj.designation.sendKeys("bbbbbbbbbbbbb");
	  Thread.sleep(2000);
	  buyerobj.gst.sendKeys("11111111111");
	  Thread.sleep(2000);
	  buyerobj.email.sendKeys("wwwwwwwwwwwwww");
	  Thread.sleep(2000);
	  buyerobj.mobile.sendKeys("00000000000");
	  Thread.sleep(2000);
	  buyerobj.website.sendKeys("wwwwwwwwwww");
	  Thread.sleep(2000);
	  buyerobj.association.sendKeys("vvvvvvvvvvv");
	  Thread.sleep(2000);
	  buyerobj.businesstype.click();
	  Thread.sleep(2000);
	  buyerobj.businesstype1.click();
	  Thread.sleep(2000);
	  buyerobj.othersclick.click();
	  Thread.sleep(2000);
	  buyerobj.newbusiness.sendKeys("ghajkkjsj");
	  Thread.sleep(2000);
	  buyerobj.product.click();
	  Thread.sleep(2000);
	  buyerobj.product2.click();
	  Thread.sleep(2000);
      buyerobj.othersclick2.click();	  
	  Thread.sleep(2000);
	  buyerobj.product_others.sendKeys("hdbdjdhkjsik");
	  Thread.sleep(2000);
	  buyerobj.b2bmeet.click();
	  Thread.sleep(2000);
	  buyerobj.date.click();
	  buyerobj.fashionvisit.click();
	  Thread.sleep(2000);
	  buyerobj.otherreq.sendKeys("kkkkkk");
	  Thread.sleep(2000);
	  buyerobj.acknowledgement.click();
	  Thread.sleep(2000);
	  buyerobj.register.click();
	  Thread.sleep(3000);
      buyerobj.Screenshot_method(driver, "Texvalley_Buyer_registration");
	    
  }
}
