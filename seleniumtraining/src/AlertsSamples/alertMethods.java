package AlertsSamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class alertMethods {
	WebDriver driver;
  @Test(enabled=false)
  public void simpleAlert()throws Exception {
      driver.get("http://demo.guru99.com/test/delete_customer.php");
      driver.findElement(By.name("cusid")).sendKeys("53920");
	  driver.findElement(By.name("submit")).submit();
	  
	  Alert alert=driver.switchTo().alert();
	  
	  //String alertMessage= driver.switchTo().alert().getText();		
		
      // Displaying alert message		
     // System.out.println(alertMessage);	
      Thread.sleep(5000);
      alert.accept();
  }
  @Test(enabled=true)
  public void promptAlert()throws InterruptedException{
	  driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	  driver.manage().window().maximize();
	  // This step will result in an alert on screen
	  WebElement ele=driver.findElement(By.xpath("//*[@id='content']/p[10]/button"));
	  System.out.println("element value="+ele.getText());
	  JavascriptExecutor jse=(JavascriptExecutor)driver;
	  jse.executeScript("arguments[0].click()", ele);
	  
	  Alert alert=driver.switchTo().alert();
	  Thread.sleep(2000);
	  System.out.println("Alert msg is ="+alert.getText());
	 alert.sendKeys("hi prompt Alert");
	  Thread.sleep(2000);
	  alert.accept();
	  Thread.sleep(2000);
  }
  @Test(enabled=false)
  public void confirmAlert()throws Exception{
	  driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
	  driver.manage().window().maximize();
	  // This step will result in an alert on screen
	  WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/p[7]/button"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	  
	  Alert confirmationAlert = driver.switchTo().alert();
	  Thread.sleep(3000);
	  String alertText = confirmationAlert.getText();
	  System.out.println("Alert text is " + alertText);
	  confirmationAlert.dismiss();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	  driver = new ChromeDriver();
	 
	  
  }

  @AfterTest
  public void afterTest() {
	
  }

}
