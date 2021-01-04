package AutomationFrameworks;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BDDexample {
	public WebDriver driver;
  @Test
  public void f() 
  {
	  
	  try {
		
		  //Read File
		  FileInputStream fi=new FileInputStream("F:\\Magnitia_hyd\\SeleniumLib\\Mercurybdd.xls");
		  
		  //Get Workbook from above path
		  Workbook wb=Workbook.getWorkbook(fi);
		  
		  //Get sheet from above path
		  Sheet sht=wb.getSheet("Sheet1");
		  		  		  
		  //Get Number of rows available in sheet
		  int rcount=sht.getRows();
		  
		  for (int i = 1; i <rcount; i++) 
		  {
			    //Target object type
			  String objtype=sht.getCell(2, i).getContents();
			  System.out.println("Object type="+objtype);
			    //Target propid from first column in same row
			  String propid=sht.getCell(1, i).getContents();
			  System.out.println("propid="+propid);
			  //Target input from input column
			  String input=sht.getCell(3, i).getContents();
			  System.out.println("input are="+input);
			   switch (objtype) 
			     {
			  
			case "Link":
				driver.findElement(By.linkText(propid)).click();
				break;
				
			case "text":
				driver.findElement(By.name(propid)).sendKeys(input);
				break;

			case "Dropdown":
				new Select(driver.findElement(By.name(propid))).selectByVisibleText(input);
				break;
			
			case "Button":
				driver.findElement(By.name(propid)).click();
				break;

			case "Radio":
				driver.findElement(By.id(propid)).click();
				break;

			case "Checkbox":
				driver.findElement(By.id(propid)).click();

			default:
				break;
			}
			  
				
		  }
		  
		  
	} catch (Exception e) {
		System.out.println(e);
	}
	  
  }
  
  @BeforeTest
  public void launch()
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		 driver=new ChromeDriver();
		  
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
  }
}
