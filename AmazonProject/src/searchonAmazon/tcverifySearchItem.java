package searchonAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;

public class tcverifySearchItem {

	static WebDriver drver;
	static WebElement ele;
	static List list;
	public static WebElement searchItem(WebDriver driver) {
		//ele= driver.findElement(By.id("twotabsearchtextbox"));
		ele= driver.findElement(By.id("twotabsearchtextbox"));
		
	 return ele;
	}
	public static WebElement selectbrandedProduct(WebDriver driver) {
		WebElement product=driver.findElement(By.xpath("//span[contains(@class,'a-size-base a-color-base') and text()='OnePlus']"));
		
				
		
	 return product;
	}
	public static WebElement clickOnProcduct(WebDriver driver) {
			//WebElement clickItem= driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			//WebElement clickItem= driver.findElement(By.xpath("//a[contains(text(),'OnePlus 8 Pro (Glacial Green 12GB RAM+256GB Storage)')])"));
			//WebElement clickItem= driver.findElement(By.xpath("//a[text()='OnePlus 8 Pro (Glacial Green 12GB RAM+256GB Storage)']"));
			WebElement clickItem= driver.findElement(By.xpath("//span[contains(@class, 'a-size-medium a-color-base a-text-normal') and text()='OnePlus 8 Pro (Glacial Green 12GB RAM+256GB Storage)']"));
		return clickItem;
	}
	public static List selectSize(WebDriver driver) {
		List<WebElement> productSize=driver.findElements(By.xpath("//*[@id='native_dropdown_selected_size_name']"));
		return productSize;
	}
	public static WebElement clickOnAddCart(WebDriver driver) {
		WebElement addCartBtn=driver.findElement(By.id("add-to-cart-button"));
		return addCartBtn;
	}
	public static WebElement processCheckoutBtn(WebDriver driver) {
		WebElement processBtn=driver.findElement(By.xpath("//input[@class='a-button-input' and @aria-labelledby='attach-sidesheet-checkout-button-announce']"));
		return processBtn;
	}
	public static WebElement buyNowBtn(WebDriver driver) {
		WebElement processBtn=driver.findElement(By.xpath("//input[@id='buy-now-button' and @name='submit.buy-now']"));
		return processBtn;
	}	
	}