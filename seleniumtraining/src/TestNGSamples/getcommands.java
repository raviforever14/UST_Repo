package TestNGSamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class getcommands {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	  driver.get("http://google.com");
	  String title= driver.getTitle();
	  System.out.println(title);
	  String currentURL=driver.getCurrentUrl();
	  System.out.println(currentURL);
	  String pagesource=driver.getPageSource();
	  System.out.println(pagesource);
	  
	  
  }
}
