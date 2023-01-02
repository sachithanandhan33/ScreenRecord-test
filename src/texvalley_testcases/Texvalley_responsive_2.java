package texvalley_testcases;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v108.emulation.Emulation;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Texvalley_responsive_2 
{
	
	public static WebDriver driver;
	
  @Test
  public void iphone11_responsive() throws Exception
  {
	 // Screen_recorder.startRecording("Texvalley_Live");
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  DevTools devTools = driver.getDevTools();
	  devTools.createSession();
	  // iPhone 11 Pro dimensions
	  devTools.send(Emulation.setDeviceMetricsOverride(1920,
	                                                   1080,
	                                                   50,
	                                                   true,
	                                                   Optional.empty(),
	                                                   Optional.empty(),
	                                                   Optional.empty(),
	                                                   Optional.empty(),
	                                                   Optional.empty(),
	                                                   Optional.empty(),
	                                                   Optional.empty(),
	                                                   Optional.empty(),
	                                                   Optional.empty()));
	  driver.get("https://tagexpo.in/");
	  
	  //driver.findElement(By.xpath("//button[@id='details-button']")).click();
	  //driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	 // Thread.sleep(10000);
	  
	  //driver.findElement(By.xpath("//button/i[@class='ekit-menu-icon icon icon-menu-9']")).click();
	  //Thread.sleep(2000);
      //driver.findElement(By.xpath("//div/button[@class='elementskit-menu-close elementskit-menu-toggler']")).click();
	  //Thread.sleep(2000);

	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,1000);");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,1000);");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,1000);");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-3000);");
	  Thread.sleep(4000);

	  
	  
	  driver.close();
	 
	  //Screen_recorder.stopRecording();
	  
	 
	  
	  
	  
  }
}
