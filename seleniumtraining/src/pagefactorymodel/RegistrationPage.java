package pagefactorymodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage {
WebDriver driver;
	
	//Object Repository
	
	@FindBy(id="email") WebElement RUserName;
	@FindBy(name="password") WebElement RPassword;
	@FindBy(name="confirmPassword") WebElement RConfPassword;
	@FindBy(name="register") WebElement RSubmit;
	@FindBy(linkText="SIGN-OFF") WebElement SignOff;
	
	public RegistrationPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void user_registration(){
		
		RUserName.sendKeys("mq7000");
		RPassword.sendKeys("mq7000");
		RConfPassword.sendKeys("mq7000");
		RSubmit.click();
	}
	
	public void signoff(){
		SignOff.click();
	}
}

  

