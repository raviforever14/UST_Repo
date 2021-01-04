package snapdealmob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productdetails {
	public static WebDriver driver;
	public static WebElement ele;
	
	public static WebElement mouse_on_mob_tab(WebDriver driver)
	{
		ele= driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		return ele;
	}
	public static WebElement click_on_smartphones(WebDriver driver)
	{
		ele= driver.findElement(By.xpath("//span[text()='Smartphones']"));
		return ele;
	}
	public static WebElement select_fromRange(WebDriver driver)
	{
		ele=driver.findElement(By.name("fromVal"));
		return ele;
	}
	public static WebElement select_toRange(WebDriver driver)
	{
		ele=driver.findElement(By.name("toVal"));
		return ele;
	}

}
