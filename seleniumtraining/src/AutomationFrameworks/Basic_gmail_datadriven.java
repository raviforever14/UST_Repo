package AutomationFrameworks;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Basic_gmail_datadriven {
	public WebDriver driver;
	public FileInputStream fi1;
	public Workbook w1;
	public Sheet s1;
	public Sheet s2;
	  @Test
	  public void gmail_login() throws Exception{
		  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
			 driver=new ChromeDriver();
			  
		  fi1=new FileInputStream(
				  "F:\\Magnitia_hyd\\SeleniumLib\\Hybrid1_ORGmail.xls");
		  w1=Workbook.getWorkbook(fi1);
		  s1=w1.getSheet(0);
		  s2=w1.getSheet(1);
		  
		  driver.get("http://gmail.com");
	driver.findElement(By.id(s1.getCell(0, 1).getContents())).sendKeys(s2.getCell(0, 1).getContents());

	 driver.findElement(By.xpath(s1.getCell(1, 1).getContents())).click();
	 Thread.sleep(4000);
	 driver.findElement(By.name(s1.getCell(2, 1).getContents())).sendKeys(s2.getCell(1, 1).getContents());
	 //driver.findElement(By.id("PersistentCookie")).click();
	 driver.findElement(By.xpath(s1.getCell(3, 1).getContents())).click();
	 //driver.findElement(By.id(s1.getCell(3, 1).getContents())).click();
	 
	  
  
}
}
