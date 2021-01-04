package JavaScriptExecutor;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class JSEGuruLogin {
	WebDriver driver;
  @Test(enabled= false)
  public void LoginValidation() {
	  driver.get("http://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys("mngr34926");
	  driver.findElement(By.name("password")).sendKeys("amUpenu");
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  WebElement button=driver.findElement(By.name("btnLogin"));
	  
	  // //Perform Click on LOGIN button using JavascriptExecutor
	  js.executeScript("arguments[0].click();", button);
	  js.executeScript("alert('Wlecome to Guru Login Page');");
	  
  }
  @Test(enabled= true)
  public void getJSDetails() {
	  driver.get("http://demo.guru99.com/V4/");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	 String domainName= js.executeScript("return document.domain").toString();
	  System.out.println("domain name="+domainName);
	  String URL=js.executeScript("return document.URL").toString();
	  System.out.println("URL is="+URL);
	  System.out.println("Title is="+js.executeScript("return document.title").toString());

      //Navigate to new Page i.e to generate access page. (launch new url)	
	  js.executeScript("window.location='https://www.gmail.com'");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	  driver= new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
