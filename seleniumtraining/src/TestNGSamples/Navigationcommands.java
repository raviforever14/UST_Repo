package TestNGSamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Navigationcommands {
	WebDriver driver;
  @Test
  public void f() throws Exception{
	  driver.get("http://google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("btnK")).submit();//bcoz type is submit
	  Thread.sleep(4000);
	  driver.navigate().back();
	  Thread.sleep(4000);
	  driver.navigate().forward();
	  Thread.sleep(4000);
	  driver.navigate().refresh();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		 driver=new ChromeDriver();
	
  }

  @AfterTest
  public void afterTest() {
	  String title= driver.getTitle();
	  System.out.println(title);
	 /* String currentURL=driver.getCurrentUrl();
	  System.out.println(currentURL);
	  String pagesource=driver.getPageSource();
	  System.out.println(pagesource);*/
	  driver.quit();
	  
  }

}
