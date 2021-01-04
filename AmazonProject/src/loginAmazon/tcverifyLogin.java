package loginAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tcverifyLogin {
	static WebDriver driver;
	static WebElement ele;
	public static WebElement clickOnAccountLink(WebDriver driver) {
		ele=driver.findElement(By.id("nav-link-accountList"));
		return ele;
	
}
	public static WebElement verifyUserName(WebDriver driver) {
		ele=driver.findElement(By.id("ap_email"));
		return ele;
	}
		public static WebElement clickOnContinue(WebDriver driver) {
		ele=driver.findElement(By.id("continue"));
		return ele;
	}
		public static WebElement verifyPwd(WebDriver driver) {
			ele=driver.findElement(By.id("ap_password"));
			return ele;
		}
		
		public static WebElement clickOnLogin(WebDriver driver) {
			ele=driver.findElement(By.id("auth-signin-button"));
			return ele;
		}
		

}
