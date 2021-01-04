package snapdealmob;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mob_tab_product {
	public static void main(String[] ar) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Snapdeal\\chromedriver_win32_v80\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		Drivers.takeScreenshot(driver, "F:\\Snapdeal\\screenshots\\", "screenshot2");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mob_tab_ele= driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		
		// MouseOver on Mobile & Tablet
		Actions action = new Actions(driver);
        Action mouseOn_Mob_Tab = action.moveToElement(mob_tab_ele).build();
        mouseOn_Mob_Tab.perform();
        driver.findElement(By.xpath("//span[text()='Smartphones']")).click();
        WebElement fromValEle=driver.findElement(By.name("fromVal"));
        WebElement toValEle=driver.findElement(By.name("toVal"));
        
        	System.out.println("start code");
        	fromValEle.clear();
        	fromValEle.sendKeys("10000");
        	toValEle.clear();
        	toValEle.sendKeys("20000");
           System.out.println("end code");
          
           driver.findElement(By.xpath("//div[contains(@class, 'price-go-arrow btn btn-line btn-theme-secondary')]")).click();
          

   		/*WebElement product1Name = driver.findElement(By.xpath("//img[contains(@src,'https://n1.sdlcdn.com/imgs/i/8/b/230X258_sharpened/Oppo-A9-2020-128GB-4-SDL430076901-1-38732.jpeg')]"));
   		WebElement product2Name= driver.findElement(By.xpath("//img[contains(@src,'https://n3.sdlcdn.com/imgs/i/5/p/230X258_sharpened/Redmi-NOTE-8-PRO-128GB-SDL028052362-1-dcbfa.jpeg')]"));
   		WebElement product3Name= driver.findElement(By.xpath("//img[contains(@src,'https://n3.sdlcdn.com/imgs/h/h/n/230X258_sharpened/Lenovo-Black-Silver-Vibe-P1-SDL222930717-1-f35a2.jpeg')]"));
   		*/
          
          /* driver.switchTo().defaultContent();
           JavascriptExecutor js = (JavascriptExecutor)driver;
           js.executeScript("window.scrollBy(0,600)");*/
           //driver.findElement(By.tagName("body")).sendKeys("Keys.ESCAPE");
          // js.executeScript("return window.stop");
          
     	  
           /*List<WebElement> els = driver.findElements(By.xpath("//div[@class='filter-inner']"));
           System.out.println(Integer.toString(els.size()));

           for ( WebElement el : els ) {
               el.click(); 
           }*/
           
           

		
	}

}
