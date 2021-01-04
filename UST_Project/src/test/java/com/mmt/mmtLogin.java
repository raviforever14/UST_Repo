package com.mmt;

import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mmtLogin {
	
	public static	WebDriver driver;
	
	
	@Test(priority=1, enabled=false)
	public void verifyMMTLogin() throws InterruptedException,Exception {
		 
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).click();
		  driver.findElement(By.id("username")).sendKeys("suraj.forever14@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
		  driver.findElement(By.id("password")).sendKeys("sAMSUNG@26");
		  WebElement eleLogin=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
		  
		  if(eleLogin.isEnabled()==true) {
			  eleLogin.click();
			  
			  Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
			  System.out.print("Enter Six Digit Otp Number- ");
			  int a= sc.nextInt();
			  String otp=String.valueOf(a);
			  driver.findElement(By.id("otp")).sendKeys(otp);
			  driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
			  driver.switchTo().defaultContent();
			  //click on Hotel Menu
			  WebElement HotelLnk=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a"));
				System.out.println("Hotel Link==>" +HotelLnk.getText());
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a")).click();
				System.out.println("Hotle Search clicked");
				WebElement ele=driver.findElement(By.id("city"));
				ele.clear();
				   Actions action=new Actions(driver);
				   action.sendKeys(ele,"Delhi").build().perform();
				   Thread.sleep(3000);
				   while(2>1) { // infinite loop
					   action.sendKeys(Keys.DOWN).build().perform();
					   //Thread.sleep(3000);
					   
					   String searchValue=ele.getAttribute("value");
					   System.out.println("search value is =="+searchValue);
					   if(searchValue.equalsIgnoreCase("Delhi")) {
						   
						   action.sendKeys(Keys.ENTER).build().perform();
						   //Thread.sleep(5000);
						   break; //to terminate from current loop
					   		}
				   		}
			  
		  }else {
			  
			  driver.switchTo().alert().sendKeys("Please enter correct password");
			  driver.switchTo().defaultContent();
		  }		  
	
	  }
	@Test(priority=2, enabled=true)
	public void verifyMMTHotelSearch() throws InterruptedException,Exception {
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).click();
		  driver.switchTo().defaultContent();
		  WebElement HotelLnk=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a"));
		  System.out.println("Hotel Link==>" +HotelLnk.getText());
		 // HotelLnk.clear();
		  Thread.sleep(2000);
		  HotelLnk.click();
			Thread.sleep(2000);
			WebElement cityEle=driver.findElement(By.xpath("//*[@id='city']"));
			Thread.sleep(2000);
			cityEle.click();
			System.out.println("City==> "+cityEle.getText());
			
						cityEle.clear();
			   Actions action=new Actions(driver);
			   action.sendKeys(cityEle,"Delhi").build().perform();
			   Thread.sleep(3000);
			   while(2>1) { // infinite loop
				   action.sendKeys(Keys.DOWN).build().perform();
				   //Thread.sleep(3000);
				   
				   String searchValue=cityEle.getAttribute("value");
				   System.out.println("search value is =="+searchValue);
				   if(searchValue.contains("Delhi, India")) {
					   
					   action.sendKeys(Keys.ENTER).build().perform();
					   //Thread.sleep(5000);
					   break; //to terminate from current loop
				   		}
			   		}
		  //new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='city']")));
		  /*WebElement cityEle=driver.findElement(By.xpath("//*[@id='city']"));
			Thread.sleep(2000);
			cityEle.click(); 
			WebElement cityInput= driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/input"));
			cityInput.sendKeys("Delhi");*/
			
	}
	 @BeforeTest
	  public void loadBrowser() {
		 System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_87\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.makemytrip.com/");
	  }
	

}
