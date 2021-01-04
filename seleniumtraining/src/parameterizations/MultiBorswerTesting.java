package parameterizations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class MultiBorswerTesting {
	 private WebDriver driver;
	 @Parameters("browser")
	 @BeforeMethod
	 public void setup(String browser)
	 {
	  if(browser.equalsIgnoreCase("firefox"))

	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\lib\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
	   System.out.println("Firefoxbrowser testing");
	  }
	  
	  else if(browser.equalsIgnoreCase("chrome"))
	  {
	// Update the driver path with your location
		  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
			 driver = new ChromeDriver();
			  System.out.println("chromebrowser testing");
			
	  }
	  
	  else if(browser.equalsIgnoreCase("iexplore"))
		  
	  {
		  System.setProperty("webdriver.ie.driver","F:\\Magnitia_hyd\\SeleniumLib\\IEDriver\\IEDriverServer.exe");
		   driver = new InternetExplorerDriver();
		   System.out.println("IEbrowser testing");
	  }
	  driver.manage().window().maximize();
	 }

	 
	 @Test
	 public void testMultiBrowser() throws InterruptedException
	 {
		 driver.get("http://cleartrip.com");
	  
	 }
	@AfterMethod
public void tearDown()
{
driver.quit();
}
	
}
