package pageobjectmodel;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testablepageobjects {
public static	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_78\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
		
		// multipletestcases.verifysignin(driver);
		multipletestcases.verifyreg(driver);
	  
  }
}
