package Javabasics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip_search {

	public static void main(String[] ar) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_80\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad");
		driver.findElement(By.id("ToTag")).sendKeys("Delhi");
		driver.findElement(By.id("DepartDate")).sendKeys("02/11/2019");
		//Thread.sleep(3000);
		driver.findElement(By.id("ReturnDate")).sendKeys("04/11/2019");
		new Select(driver.findElement(By.id("Adults"))).selectByValue("3");
		//new Select(driver.findElement(By.name("country"))).selectByValue("236");
		driver.findElement(By.id("MoreOptionsLink")).click();
		new Select(driver.findElement(By.id("Class"))).selectByValue("First");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("APG Airlines (GP)");
		driver.findElement(By.id("SearchBtn")).click();
		

		
	}

}
