package TestNGSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertMethod {
	WebDriver driver;
  @Test
  public void verifyAssertMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://google.com");
		 WebElement ele= driver.findElement(By.xpath("//input[@value='Google Search']"));
		 String str=ele.getAttribute("value");
		 System.out.println("google value=" +str);
		 
		 Assert.assertEquals("Google Se", str);
		 		 
     //Assert.assertEquals(20, calc(100,5));
	 // Assert.assertFalse(calc(10,5)!=30, "Result as");
	 // Assert.assertTrue(calc(10,5)==2,"Correct Answer");
	  
  }
  public int calc(int i, int j) {
	  return i/j;
  }
}
