package snapdealmob;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class producttestcase {
	public  static void verifyproduct(WebDriver driver)
	{
		WebElement mob_tab_ele=productdetails.mouse_on_mob_tab(driver);
		// MouseOver on Mobile & Tablet
				Actions action = new Actions(driver);
		        Action mouseOn_Mob_Tab = action.moveToElement(mob_tab_ele).build();
		        mouseOn_Mob_Tab.perform();
		productdetails.click_on_smartphones(driver).click();
		WebElement fromRangeEle=productdetails.select_fromRange(driver);
		fromRangeEle.clear();
		fromRangeEle.sendKeys("10000");
		WebElement toRangeEle=productdetails.select_toRange(driver);
		toRangeEle.clear();
		toRangeEle.sendKeys("20000");
	}
	
	}
