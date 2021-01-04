package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefs_GoogleHomepage {
	
	WebDriver driver;
    String baseURL="https://www.spicejet.com/";
    
	@Given("^launch Spicejet on chrome browser$")
	public void the_user_Search() {
		driver.get(baseURL);
	}
	
	
	@Before
		public void launch_Spicejet_on_chrome_browser()throws Exception{
			System.out.println("launch Browser");
			System.setProperty("webdriver.chrome.driver", "F:\\Snapdealassignment\\New Chromedriver\\chromedriver.exe");
			 driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
	@When("^I open Google Homepage$")
	public void i_open_Google_homepage() throws Exception{
		
		Select fromCity=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")));
		
		fromCity.selectByIndex(6);
				
       Select toCity=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")));
		
		toCity.selectByIndex(7);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).sendKeys("25-11-2020");
		Select Adult=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		Adult.selectByIndex(2);
		Select currencyList=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currencyList.selectByValue("INR");
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).submit();
			
		
		
		
	}
	@Then("^User is able to see relevant list of Flights$")
	
	public void User_is_able_to_see_relevant_list_of_Flights() throws Exception{
		driver.navigate().to("https://book.spicejet.com/Select.aspx");
		
	}
	/*@Then("^the page displays Google Search button$")
	public void google_display_search_button() throws Exception{
		System.out.println("Google Display search button");
	}
	@Then("^the page displays Im Feeling Lucky button$")
	public void google_displays_im_feeling_lucky_button() throws Exception{
		System.out.println("Google Display I'm feeling Lucky button");
	}*/
	

	/*@After
	public void close() {
		driver.close();
	}*/
	
}
