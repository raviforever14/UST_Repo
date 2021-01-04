package parameterizations;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class gmaillogin {
	WebDriver driver;

    @BeforeTest

public void setup(){
       
  	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		 driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://gmail.com");
        driver.manage().window().maximize();

}

  @Test(dataProvider = "gmailloginProvide")
  public void dataprovidertest1( String username,String password) throws InterruptedException{
       
      WebElement e = driver.findElement(By.id("identifierId"));
      e.sendKeys(username);
      //System.out.println("Username is:"+username);
      WebElement e1 =driver.findElement(By.xpath("//span[text()='Next']"));
      e1.click();
      WebElement e2 = driver.findElement(By.name("password"));
  	e2.sendKeys(password);
  	Thread.sleep(1000);
      //System.out.println("password is:"+password);
  	WebElement e3=driver.findElement(By.xpath("//span[text()='Next']"));
  	e3.click();
      //WebElement signinbutton=driver.findElement(By.id("signIn"));
      //signinbutton.click();
      System.out.println("login successful");
      
}

  
  @DataProvider(name="gmailloginProvide")
	  
    public static Object[][] getDataFromDataprovider(){
 
        return new Object[][] {
 
                { "ravi.forever14@gmail.com","sunravik" }
                 
            };
 
  }
}
