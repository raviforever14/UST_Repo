package JavaScriptExecutor;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class JavaScriptsExecutorDemo {
	  public static WebDriver driver;
 
	@Test(enabled=false)

	  public void disabletextbox()throws Exception
		{
			//Run browser driver to get browser
	
			 //JavaScriptsExecutor:
			//Launch site
			driver.get("http://www.google.co.in");         
			WebDriverWait w=new WebDriverWait(driver,100); // waitDriverWait is used to load the element ,as element is found it's closed 
			//w.until(ExpectedConditions.visibilityOfElementLocated(locator))
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
			driver.manage().window().maximize();
			//Disable text-box
			WebElement e=driver.findElement(By.name("q"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('disabled','true');",e);
			Thread.sleep(5000);
			js.executeScript("arguments[0].removeAttribute('disabled');",e);
		}
	  
			@Test(enabled=false)
		public void bordertextbox()throws Exception
				{	 
			//Launching website
			driver.get("http://www.gmail.com");         
			driver.manage().window().maximize();
			Thread.sleep(5000);
			//Click an element
			JavascriptExecutor js=(JavascriptExecutor) driver;
			//Locate element and  operate using Javascript
			WebElement e=driver.findElement(By.name("identifier"));
			js.executeScript("arguments[0].style.border='2px dashed Red';",e);
			
			js.executeScript("arguments[0].value='ravi.forever14';",e);
			Thread.sleep(3000);
			//Locate and operate element using javascript
			js.executeScript("document.getElementById('identifierNext').click();");

	
				}
  
  @Test(enabled=false) // Example of ScrollBar
  public void scrollDownSample() {
  
	  driver.get("http://amazon.in");

	  JavascriptExecutor js = (JavascriptExecutor)driver;

	  js.executeScript("scroll(0, 550)");

  }
  @Test(enabled=false) // Example of ScrollBar from top to end
  public void scrollDownWithInterval() throws Exception{
	 	  
	  driver.get("http://amazon.in");
  JavascriptExecutor js = (JavascriptExecutor)driver;
 
  for(int sl=0;;sl++)
    {
        if(sl>=10)
        {
            break;
        }
        js.executeScript("window.scrollBy(0,200)","");//200 is scroll position
        Thread.sleep(1000);
    }
}
 @Test(enabled=false)
  public void doubleClick1(WebElement element) throws Exception{
 	driver.manage().window().maximize();

	driver.get("http://api.jquery.com/dblclick/");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement elemnt = driver.findElement(By.cssSelector("html>body>div"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elemnt);
	
	doubleClickMethod(element);
	WebElement ele = driver.findElement(By.cssSelector(".dbl"));
	if (ele.isDisplayed()) {
		System.out.println("Color Changed successfully after we double clicked");
	}

}

public void doubleClickMethod(WebElement element) throws Exception{
	try {
		Actions action = new Actions(driver).doubleClick(element);
		action.build().perform();

		System.out.println("Double clicked the element");
	
}
	catch(Exception e)
	{
		System.out.println(e);
	}
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
