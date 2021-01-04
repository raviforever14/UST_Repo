package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExectorClass {
	WebDriver driver;
	
	@Test
	public class doubleclicktest {
		  
		
			@Test
			public void testDoubleClick() throws Exception {
				 System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("http://api.jquery.com/dblclick/");
				driver.switchTo().defaultContent();
				driver.switchTo().frame(0);
				WebElement element = driver.findElement(By.cssSelector("html > body > div")); 
				((JavascriptExecutor) driver).executeScript(
						"arguments[0].scrollIntoView();", element);
				
				doubleClick(element);
				WebElement ele = driver.findElement(By.cssSelector("body > div"));
				if (ele.isDisplayed()) {
					System.out.println("Color Changed successfully after we double clicked");
				}

			}

			public void doubleClick(WebElement element) throws Exception{
				try {
					Actions action = new Actions(driver).doubleClick(element);
					action.build().perform();

					System.out.println("Double clicked the element");
				}catch(Exception e) {
					
				}
			}
	}}
