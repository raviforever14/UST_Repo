package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SpicejetRoundTrip {
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	   new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"))).selectByValue("HYD");
	   
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("https://www.spicejet.com");

	   
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
