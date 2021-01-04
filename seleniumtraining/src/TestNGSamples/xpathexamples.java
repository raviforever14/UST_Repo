package TestNGSamples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpathexamples {
	WebDriver driver;
  @Test(enabled=true)
  public void startswithsmple() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	     driver.get("https://www.lambdatest.com");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[starts-with(text(), 'Register')]")).click();
	     driver.close();
  }
  
  @Test(enabled=true)
  public void followingsample() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	     driver.get("https://www.lambdatest.com");
	     driver.manage().window().maximize();
	     //Locate element with the link blog using following axes
	     driver.findElement(By.xpath("//ul[@class='navbar-nav']//following::li[3]//a")).click();
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
  }
  @Test(enabled=true)
  public void followingsibsample() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	     driver.get("https://www.lambdatest.com");
	     driver.manage().window().maximize();
	     //Locate element with the start free testing  using following axes
	     driver.findElement(By.xpath("//li[@class='nav-item sign-up-li']//following-sibling::a")).click();
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
  }
  @Test(enabled=true)
  public void preceedingsample() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();

	     driver.get("https://www.lambdatest.com");
	     driver.manage().window().maximize();
	     //Fnding the automation link using the blog link
	     driver.findElement(By.xpath("//a[text()='Blog']//preceding::li[1]")).click();
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
  }
  @Test(enabled=true)
  public void preceedingsibsample() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	     driver.get("https://www.lambdatest.com");
	     driver.manage().window().maximize();
	     //locating the 'login' link using xpath preceding sibling and clicking on it
	     driver.findElement(By.xpath("//li[@class='nav-item']//preceding-sibling::li[1]")).click();
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
  }
  @Test(enabled=true)
  public void parentxpathsample() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	     driver.get("https://accounts.lambdatest.com/register");
	     driver.manage().window().maximize();
	     //locating the password field in the register page
	     WebElement ele=driver.findElement(By.xpath("//input[@name='password']//parent::div"));
	     System.out.println(ele.getAttribute("class"));
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
  }
  @Test(enabled=true)
  public void childxpathsample() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	     
	     driver.get("https://accounts.lambdatest.com/register");
	     driver.manage().window().maximize();
	     //locating the password field in the register page
	     driver.findElement(By.xpath("//div[@class='col-sm-12 google-sign-form']/child::input[3]")).sendKeys("selenium");
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
  }
  @Test(enabled=true)
  public void decesendantsxpathsample() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	    
	     driver.get("https://accounts.lambdatest.com/login");
	     driver.manage().window().maximize();
	     //Finding the remember me grand children of the login form with field value as remember me
	     WebElement e=driver.findElement(By.xpath("//div[@class='form-group form-check mt-2']//descendant::label"));
	     System.out.println(e.getText());
	     System.out.println(driver.getCurrentUrl());
	     driver.close();
	   
  }
 /* public void beforeTest(){
	  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	   driver= new ChromeDriver();
	     
  }
  @AfterTest
  public void afterTest() {
	 
	 driver.quit();
	  
  }*/
}
