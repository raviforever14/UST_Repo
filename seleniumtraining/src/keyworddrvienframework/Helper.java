package keyworddrvienframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Helper {
	public static WebDriver driver;
	 public static void Login() throws Exception{
		  driver=new ChromeDriver();
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


public static void Compose() throws Exception
{
	  	
	Thread.sleep(30000);
    
    driver.findElement(By.xpath("//span[text()='Compose']")).click();
    driver.findElement(By.id("to-field")).sendKeys("madhavi_rao88@yahoo.co.in");
    driver.findElement(By.id("subject-field")).sendKeys("hi");
  
	  driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("welcome to selenium class");
	  driver.findElement(By.xpath("//a[text()='Send']")).click();
		 
}

	 
	   



	/*public static void main(String[] args) throws Exception{
		Helper obj=new Helper();
		obj.Login();
		obj.Compose();
		

	}*/

}
