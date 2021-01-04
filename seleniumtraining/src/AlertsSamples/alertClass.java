package AlertsSamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class alertClass {
	public static WebDriver driver ;
  @Test(enabled=false)
  public void alertOk()throws Exception {
	  driver.get("http://jsbin.com/usidix/1");
	  
	  driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	  Alert a1=driver.switchTo().alert();
	  Thread.sleep(2000);
	  String str=a1.getText();
	  System.out.println("value="+str);
	  a1.accept();
	  
  }
  @Test(enabled=false)
  public void promptAlert()throws Exception {
	  driver.get("file:F:///Magnitia_hyd/Mindq.htm");
	  driver.findElement(By.xpath("/html/body/fieldset/button")).click();// input
	  String str=driver.switchTo().alert().getText();
	  Thread.sleep(2000);
	  System.out.println("string value="+str);
	  driver.switchTo().alert().accept();
	  
  }
  @Test(enabled=true)
  public void confirmAlert()throws Exception {
	  driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	  driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();// input
	  System.out.println(driver.switchTo().alert().getText());
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
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
