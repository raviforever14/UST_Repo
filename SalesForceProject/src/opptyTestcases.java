

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class opptyTestcases {
	

	
	public  static void verifysignin(WebDriver driver)throws Exception
	{
		loginPage.username_signin(driver).sendKeys("suraj.forever14-hvza@force.com");
		loginPage.password_signin(driver).sendKeys("sAMSUNG@26");
		loginPage.signin_signin(driver).click();
		
	}
	
	
	public  static void createOppty(WebDriver driver)throws Exception
	
	{  
		createOppty.click_oppty_link(driver).click();
		createOppty.New_oppty_click_btn(driver).click();
		createOppty.Oppty_name(driver).sendKeys("TestOppty");
		createOppty.account_name(driver).sendKeys("Test_Oppty_account");
		createOppty.close_date(driver).sendKeys("06/20/2020");
		Select seelctStage=new Select(createOppty.stage(driver));
		seelctStage.selectByValue("Proposal");
		createOppty.save_oppty(driver).submit();
	
	
	}
}
