package Frames;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FrameSamples {
	 WebDriver driver;
  @Test
  public void f() throws Exception{
	  
	  //Case 1: If Frame is available, Note: web component can't be access directly from the Frame.
	 /* driver.switchTo().frame("login_page");
	  driver.findElement(By.name("fldLoginUserId")).sendKeys("hdfc@user");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
	  */
	  
	  //Case 2: If Frame name is not available:
	  /*driver.get("https://jqueryui.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Autocomplete")).click();
	  Thread.sleep(2000);
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  Thread.sleep(3000);
	  driver.findElement(By.id("tags")).sendKeys("This is My Tag");
	  Thread.sleep(2000);
	  //Switch to back frame default content and switch to another frame is used as below
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Accordion")).click();
	   Thread.sleep(2500); 	  */
	  
	  // Case 3: if right click is not working to see the html code:first get page soruce and then locate the web component
	  	  /*driver.get("https://retail.onlinesbi.com/retail/login.htm");
	  	  //String str=driver.getPageSource();//get pagesource and copy into notepad
	  	  //System.out.println(str);
	  	  //Thread.sleep(2000);
	  	  driver.findElement(By.className("login_button")).click();
	  	  driver.findElement(By.id("username")).sendKeys("ravikumar");
	  	  driver.findElement(By.name("password")).sendKeys("ravikumar");
	  	  */ 
	  
	  //Case 4: If multiple frame are there in a form
/*	  driver.get("http://only-testing-blog.blogspot.in/2015/01/iframe1.html");
	  driver.manage().window().maximize();
	  driver.switchTo().frame("frame1");
	  driver.findElement(By.xpath("//*[@id=\"post-body-3107268830657760720\"]/div[1]/table/tbody/tr[1]/td[1]/input")).click();
	  driver.switchTo().defaultContent();
	  driver.switchTo().frame("frame2");
	  driver.findElement(By.xpath("//*[@id=\"text2\"]")).sendKeys("Sunravikumar");; // Some issue is there need to verify
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/
   
	  //Case 5: If frame is inactive. Note: How we know Frame is inactive
	  driver.get("http://the-internet.herokuapp.com/tinymce");
	  driver.manage().window().maximize();
	  WebElement frame1= driver.findElement(By.id("mce_0_ifr"));
	  driver.switchTo().frame(frame1);
	  WebElement editable=driver.switchTo().activeElement();
	  editable.clear();
	  editable.sendKeys("wlecome to Frame");
	  
	   /*Case 6: If id , name are not available ,How to switch from one frame to another 
	  
	  WebElement frm1= driver.findElement(By.xpath("iframe[@tabindex='1']"));
	  driver.switchTo().frame(frm1);
	  WebElement ele1=driver.switchTo().activeElement();
	  driver.switchTo().defaultContent();
	  */
	  
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	   //driver.get("https://netbanking.hdfcbank.com/netbanking/");
	   
  }

  @AfterTest
  public void afterTest() {
	//  driver.close();
  }

}
