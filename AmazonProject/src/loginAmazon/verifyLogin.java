package loginAmazon;

import org.openqa.selenium.WebDriver;

public class verifyLogin {

	public static void getLogin(WebDriver driver)throws Exception{
		
		tcverifyLogin.clickOnAccountLink(driver).click();	
		tcverifyLogin.verifyUserName(driver).sendKeys("suraj.forever14@gmail.com");
		tcverifyLogin.clickOnContinue(driver).click();
		tcverifyLogin.verifyPwd(driver).sendKeys("sunravikumar");
		tcverifyLogin.clickOnLogin(driver).click();
	}
	
	
}

