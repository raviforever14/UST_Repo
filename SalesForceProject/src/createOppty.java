

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createOppty {
	public static WebDriver driver;
	public static WebElement ele;
	
	
	public static WebElement click_oppty_link(WebDriver driver)
	{
		ele=driver.findElement(By.xpath("//a[text()='Opportunities']"));
		return ele;
	}
	public static WebElement New_oppty_click_btn(WebDriver driver)
	{
		ele=driver.findElement(By.name("new"));
		return ele;
	}
	public static WebElement Oppty_name(WebDriver driver)
	{
		ele=driver.findElement(By.id("opp3"));
		return ele;
	}
	public static WebElement account_name(WebDriver driver)
	{
		ele=driver.findElement(By.id("opp4"));
		return ele;
	}public static WebElement close_date(WebDriver driver)
	{
		ele=driver.findElement(By.id("opp9"));
		return ele;
	}public static WebElement stage(WebDriver driver)
	{
		ele=driver.findElement(By.id("opp11"));
		return ele;
	}
	public static WebElement save_oppty(WebDriver driver)
	{
		ele=driver.findElement(By.name("save"));
		return ele;
	}
	
	
}
