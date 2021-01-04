package searchonAmazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import loginAmazon.verifyLogin;

public class verifySearchBox {
	
	public static void verifySearch(WebDriver driver)throws Exception {
		//verifyLogin.getLogin(driver);
		WebElement ele=tcverifySearchItem.searchItem(driver);
		Actions searchAction=new Actions(driver);
		searchAction.sendKeys(ele,"jackets for men latest");
		Thread.sleep(2000);
		while(2>1) {
			searchAction.sendKeys(Keys.DOWN).build().perform();
			 String searchValue=ele.getAttribute("value");
			   System.out.println("search value is =="+searchValue);
			   if(searchValue.equalsIgnoreCase("jackets for men latest design")) {
				   searchAction.sendKeys(Keys.ENTER).build().perform();
				   Thread.sleep(2000);
				   break; //to terminate from current loop
			   		}
				}
		
			}
	
	public static void verifySelectBrand(WebDriver driver)throws Exception{
		
		System.out.println("before clicked");
		/*List<WebElement> listProduct=tcverifySearchItem.selectbrandedProduct(driver);
		
		System.out.println("list size="+Integer.toString(listProduct.size()));
		
		
		for(int i=0;i<listProduct.size(); i++) {
			listProduct.get(i).click();
			
		}
		*/
		tcverifySearchItem.selectbrandedProduct(driver).click();
		tcverifySearchItem.clickOnProcduct(driver).click();
		List<WebElement> listProduct=tcverifySearchItem.selectSize(driver);
		
		System.out.println("Selected size value="+Integer.toString(listProduct.size()));
		
		
		for(int i=0;i<listProduct.size(); i++) {
			if(listProduct.get(i).getText().equalsIgnoreCase("2XL")) {
			listProduct.get(i).click();
			
		}else {
			driver.switchTo().alert().sendKeys("size not abvailable");
			}
		
		}
		driver.switchTo().defaultContent();

		}
	}
