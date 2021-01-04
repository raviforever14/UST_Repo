package verifyMobilePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import loginAmazon.verifyLogin;
import searchonAmazon.verifySearchBox;

public class MainAmazonPage {
	
	public static WebDriver driver;
	
	@Test(priority=0, enabled=false)
	public void login()throws Exception{
		verifyLogin.getLogin(driver);
	}
	@Test(priority=1,enabled=false)
	public void runMobileItems() throws Exception{
		
		verifyMobileSendKey.verifyMobileFunctionality(driver);
		
		}
	
	@Test(priority=1,enabled=true)
	public void runMainSearchItems() throws Exception{
		//verifyLogin.getLogin(driver);
		
		//driver.switchTo().defaultContent();
		verifySearchBox.verifySearch(driver);
		verifySearchBox.verifySelectBrand(driver);
		
	}
	@Test(priority=3,enabled=false)
	public void runselectProduct()throws Exception {
		verifySearchBox.verifySelectBrand(driver);
	}


@BeforeTest
public void beforeTestMethod() throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_87\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.amazon.in");
     driver.manage().window().maximize();
    // verifyLogin.getLogin(driver);
     Thread.sleep(3000);
     
}
/*@AfterTest
public void afterTestMethod() {
	driver.close();
}*/

}