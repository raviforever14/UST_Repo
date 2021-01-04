package Actionclassessamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionClasses {
	WebDriver driver;
  @Test(enabled=false)
  public void rightClick()throws Exception{
	  
	/* 
 // Right Click action
	driver.get("https://amazon.in");
	Actions action= new Actions(driver);
	WebElement ele= driver.findElement(By.id("twotabsearchtextbox"));//By.xpath("//input[@id='twotabsearchtextbox']")
	action.contextClick(ele).build().perform();
	*/
  }
	    
@Test(enabled=false)	  
public void dragNdrop()throws Exception{
	//Automate drag-drop elements
	driver.get("http://jqueryui.com/droppable");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	WebElement source= driver.findElement(By.id("draggable"));
	WebElement destination=driver.findElement(By.id("droppable"));
	Actions action=new Actions(driver);
	action.dragAndDrop(source, destination).build().perform();
	//OR action.clickAndHold(source).moveToElement(destination).release(source).perform();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	}
		
@Test(enabled=false)
	   //Automate search keyword in search box and pick 5th element in the result by using keyboard
public void searchBox1()throws Exception {
	driver.get("http://google.com");  
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement keywordEle= driver.findElement(By.name("q"));
	Actions action=new Actions(driver);
	action.sendKeys(keywordEle,"Selenium").build().perform();
	Thread.sleep(2000);
	//Automate Recommendations list for 5th one
	for(int i=1;i<=5;i++) {
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
	}
	action.sendKeys(Keys.ENTER).build().perform();
	}
@Test(enabled=true)
public void searchKeywords()throws Exception {
	 //  Search Randomly key and by using Keyboard
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  // Thread.sleep(3000);
	   WebElement ele=driver.findElement(By.name("q"));
	   Actions a=new Actions(driver);
	   a.sendKeys(ele,"Selenium").build().perform();
	   Thread.sleep(3000);
	   while(2>1) { // infinite loop
		   a.sendKeys(Keys.DOWN).build().perform();
		   Thread.sleep(3000);
		   System.out.println("ravi");
		   String searchValue=ele.getAttribute("value");
		   System.out.println("search value is =="+searchValue);
		   if(searchValue.equalsIgnoreCase("Selenium Grid")) {
			   
			   a.sendKeys(Keys.ENTER).build().perform();
			   Thread.sleep(5000);
			   break; //to terminate from current loop
		   		}
	   		}
         }
public void doubleClickMethod() {
	
}
@Test(enabled=false)
public void mouseHoverMethod() {
		   driver.get("https://www.spicejet.com/");
		   WebElement element=driver.findElement(By.id("ctl00_HyperLinkLogin"));// xpath("a[@id='ctl00_HyperLinkLogin']"
		   Actions a=new Actions(driver);
		   a.moveToElement(element).build().perform();
		   
	   }
	   
	

  
  @BeforeTest
  public void beforeTest(){
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_87\\chromedriver.exe");
	   driver= new ChromeDriver();
	     
  }


  @AfterTest
  public void afterTest() {
  }

}
