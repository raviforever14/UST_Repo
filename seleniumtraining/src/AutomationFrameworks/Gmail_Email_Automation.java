package AutomationFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail_Email_Automation {
WebDriver driver;
	

	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		 driver=new ChromeDriver();
		   driver.get("http://gmail.com");
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(
					"mindqselenium15@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(
					"mindq@123");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
	  }
	  

	public void compose() throws Exception
	{		Thread.sleep(30000);
	driver.findElement(By.xpath("//div[text()='Compose']")).click();
	driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(
			"sudheera.adusupalli@gmail.com");
	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(
			"hi");
	driver.findElement(
			By.xpath("//div[contains(@aria-label,'Message Body')]"))
			.sendKeys("welcome");
	driver.findElement(By.xpath("//div[text()='Send']")).click();

		   
	}

	 	  public void logout() throws Exception{
	 		 Thread.sleep(20000);
	 		driver.findElement(
	 				By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[3]/div/div[2]/div/a/span"))
	 				.click();
	 		Thread.sleep(2000);
	 		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
	 		
		   
	  }
		
	public static void main(String[] args)throws Exception {
		Gmail_Email_Automation obj =new Gmail_Email_Automation();
		obj.login();
		obj.compose();
		obj.logout();
	}
}
