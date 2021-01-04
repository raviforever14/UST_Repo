package verifyMobilePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tcverifyMobile {
	static WebDriver driver;
	static WebElement ele;
	public static WebElement clickOnMobileLink(WebDriver driver) {
		ele=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		return ele;
	
}
	public static WebElement selectMobileType(WebDriver driver) {
		ele=driver.findElement(By.linkText("Vivo U20"));
		return ele;
	}
		public static WebElement clickOnAddtoWishClickon(WebDriver driver) {
		ele=driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
		return ele;
	}
	
	

}
