import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropDownSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "F:\\Snapdealassignment\\chromedriver_win32_v80\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://seleniumpractise.blogspot.com/");
		 List <WebElement>toolsList;
		 Select dropitems=new Select(driver.findElement(By.id("tools")));
	//	 System.out.println("list size="+dropitems.size());
		 toolsList=dropitems.getOptions();
		 List actualList= new ArrayList();
		 for(WebElement ele: toolsList) {
			 String toolEle=ele.getText();
			 actualList.add(toolEle);
			 
		}
		 
		 List allItem= new ArrayList();
		 allItem.addAll(actualList);
		 System.out.println("second list="+allItem.size());
		 //Assending Order
		 Collections.sort(allItem);
		 org.testng.Assert.assertEquals(actualList, allItem);
		 	 
		 
		 
	}
	

}
