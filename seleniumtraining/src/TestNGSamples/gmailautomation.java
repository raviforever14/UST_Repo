package TestNGSamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class gmailautomation {
	WebDriver driver;
	  @Test
	  public void f() throws Exception{
		  driver.get("http://gmail.com");
		  driver.findElement(By.id("identifierId")).sendKeys("ravi.forever14@gmail.com");
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys("sunravik");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(3000);  
		  driver.findElement(By.xpath("//div[text()='Compose']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.name("to")).sendKeys("suraj.forever14@gmail.com");
		  driver.findElement(By.name("subjectbox")).sendKeys("test mail");
		  driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("hi test mail1");
		  driver.findElement(By.xpath("//div[text()='Send']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("gb_71")).click();
		  
		  
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
			 driver=new ChromeDriver();
		
	  }

	  @AfterTest
	  public void afterTest() {
		 
		 driver.quit();
		  
	  }

	}
