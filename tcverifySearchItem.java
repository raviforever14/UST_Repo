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
		WebElement product=driver.findElement(By.xpath("//*[@id=\"p_89/Qube By Fort Collins\"]"));
		//List<WebElement> productList=driver.findElements(By.xpath("//*[@id=\"p_89/Qube By Fort Collins\"]"));
		//*[@id="p_89/Qube By Fort Collins"]
				
		
	 return product;
	}
	public static WebElement clickOnProcduct(WebDriver driver) {
		WebElement clickItem=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div/span/a/div/img"));
		//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div/span/a/div/img"));
		return clickItem;
	}
	public static List selectSize(WebDriver driver) {
		List<WebElement> productSize=driver.findElements(By.xpath("//*[@id='native_dropdown_selected_size_name']"));
		return productSize;
	}
	
	}