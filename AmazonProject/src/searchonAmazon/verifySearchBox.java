package searchonAmazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import loginAmazon.verifyLogin;

public class verifySearchBox {
	
	public static void verifySearch(WebDriver driver)throws Exception {

		WebElement ele=tcverifySearchItem.searchItem(driver);
		Actions searchAction=new Actions(driver);
		searchAction.sendKeys(ele,"oneplus 8 pro");
		Thread.sleep(2000);
		while(2>1) {
			searchAction.sendKeys(Keys.DOWN).build().perform();
			 String searchValue=ele.getAttribute("value");
			   System.out.println("search value is =="+searchValue);
			  // if(searchValue.equalsIgnoreCase("jackets for men latest design")) {
			   if(searchValue.equalsIgnoreCase("oneplus 8 pro")) {
				   searchAction.sendKeys(Keys.ENTER).build().perform();
				   Thread.sleep(2000);
				   break; //to terminate from current loop
			   		}
				}
		
			}
	
	public static void verifySelectBrand(WebDriver driver)throws Exception{
		
		tcverifySearchItem.selectbrandedProduct(driver).click();
		Thread.sleep(2000);
		tcverifySearchItem.clickOnProcduct(driver).click();
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		String parentWindow=driver.getWindowHandle();
		Set<String>tabs=driver.getWindowHandles();
		System.out.println("no. of window==>"+tabs.size());
		tabs.remove(parentWindow);
		Iterator<String> ite = tabs.iterator();
		  //So now Set contains only new tab window only,so switch to it
		  driver.switchTo().window((String) ite.next());
		 // tcverifySearchItem.clickOnAddCart(driver).click();
		  tcverifySearchItem.buyNowBtn(driver).click();
		  Thread.sleep(3000);
				  
		 // tcverifySearchItem.processCheckoutBtn(driver).click();
		  System.out.println("After cart clicking");
			/*System.out.println("window name="+tabs.get(0));
			driver.switchTo().defaultContent();*/
		

		}
	}
