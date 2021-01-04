  package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mercurysignin {
	
	public static WebDriver driver;
	public static WebElement ele;
	
	public static WebElement username_signin(WebDriver driver)
	{
		ele=driver.findElement(By.name("username"));
		return ele;
	}
	public static WebElement password_signin(WebDriver driver)
	{
		ele=driver.findElement(By.name("password"));
		return ele;
	}
	public static WebElement signin_signin(WebDriver driver)
	{
		ele=driver.findElement(By.name("Login"));
		return ele;
	}
	public static WebElement register_signin(WebDriver driver)
	{
		ele=driver.findElement(By.linkText("REGISTER"));
		return ele;
	}

}
