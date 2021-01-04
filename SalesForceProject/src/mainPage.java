

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mainPage {
public static	WebDriver driver;
  	    
	  @Test(priority=1)
		public void loginPage()throws Exception{
		  opptyTestcases.verifysignin(driver);
		}
	  @Test(priority=2)
	  public void creat_Oppty() throws Exception{
	opptyTestcases.createOppty(driver);

	  }
  
  
  @BeforeTest
  public void beforeTestMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Snapdealassignment\\New Chromedriver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
	  driver.manage().window().maximize();
  }
}
