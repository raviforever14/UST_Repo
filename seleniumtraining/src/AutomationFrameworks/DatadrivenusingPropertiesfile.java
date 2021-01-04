package AutomationFrameworks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenusingPropertiesfile {
	WebDriver driver;
  @Test
  public void f() {
	  try 
	  {
		//Create property class
		  Properties prop=new Properties();
		 
		  //load properties available in input file
		  
		  prop.load(new FileInputStream("F:\\Magnitia_hyd\\SeleniumLib\\IP.properties"));
		  
		  
		  //Get property using unique key
		 
		  driver.findElement(By.id(prop.getProperty("username"))).sendKeys(prop.getProperty("uidinput"));
		  driver.findElement(By.xpath(prop.getProperty("nextbutton"))).click();
		  Thread.sleep(4000);
		  driver.findElement(By.name(prop.getProperty("password"))).sendKeys(prop.getProperty("pwdinput"));
		  driver.findElement(By.xpath(prop.getProperty("signin"))).click();
		  //Set Property to file
		  prop.setProperty("Result", driver.getTitle());
		  
		  //Load Property file
		  prop.store(new FileOutputStream("F:\\Magnitia_hyd\\SeleniumLib\\Op.properties"), null);
		  
		  		  
	  } catch (Exception e) {
		
		  System.out.println(e.getMessage());
	  }
	  
	  }
  
  
  @BeforeTest
	public void launchApplication()
	{
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		 driver=new ChromeDriver();
		  
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	}  
  	  
 
  @AfterTest
	  public void CloseBrowser() throws Exception
	  {
		  Thread.sleep(4000);
		//  driver.quit();
	  }



  }

