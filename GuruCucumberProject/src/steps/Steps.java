package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				
 
	WebDriver driver;
        
    @Given("^Open the Chrome and launch the application Data$")				
    public void open_Chrome_application() throws Throwable							
    {		
    	 System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
  	   driver= new ChromeDriver();
  	   driver.manage().window().maximize();
  	   driver.get("https://www.guru99.com/using-cucumber-selenium.html");
        System.out.println("This Step open the Chrome and launch the application.");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }		

}