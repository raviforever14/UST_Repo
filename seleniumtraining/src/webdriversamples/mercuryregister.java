package webdriversamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mercuryregister {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		
	//After clicking on register then it will navigate to other page then need to take thead.sleep()
		Thread.sleep(4000);
		//Contact Information
		driver.findElement(By.name("firstName")).sendKeys("ravi");
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.name("phone")).sendKeys("9123723737");
		driver.findElement(By.id("userName")).sendKeys("sunravikumar");
		//Mailing Address
		driver.findElement(By.name("address1")).sendKeys("address1");
		driver.findElement(By.name("address2")).sendKeys("address2");
		driver.findElement(By.name("city")).sendKeys("new jursey city");
		driver.findElement(By.name("state")).sendKeys("state is UK");
		driver.findElement(By.name("postalCode")).sendKeys("249209");
		
		//new Select(driver.findElement(By.name("country"))).selectByVisibleText("UNITED KINGDOM ");
		//new Select(driver.findElement(By.name("country"))).selectByIndex(5);
		new Select(driver.findElement(By.name("country"))).selectByValue("236");
		
		
		//User Information
				
		driver.findElement(By.name("email")).sendKeys("sunravikumar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sunarvipassword");
		driver.findElement(By.name("confirmPassword")).sendKeys("sunarvipassword");
		driver.findElement(By.name("register")).click();
		
		driver.quit();
		
		
	}
		
		

	}

