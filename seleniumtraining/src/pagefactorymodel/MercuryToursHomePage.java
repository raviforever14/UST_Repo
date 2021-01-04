package pagefactorymodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MercuryToursHomePage {
	WebDriver driver;
	//Object Repository
	
		@FindBy(css="input[name='userName']") WebElement UserName;
	@FindBy(css="input[name='password']") WebElement Password;
	@FindBy(css="input[name='login']") WebElement Login;
	@FindBy(linkText="REGISTER") WebElement Register;
	
	
	
	public MercuryToursHomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void openMercuryTours(){
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	public void login(){
		
		
		UserName.sendKeys("mq7000");
		Password.sendKeys("mq7000");
		Login.click();
		System.out.println(driver.getTitle());
		
	}
	
	
	public void registerme(){
		Register.click();
	}

  
}
