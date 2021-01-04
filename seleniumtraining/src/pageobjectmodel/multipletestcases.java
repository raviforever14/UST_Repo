package pageobjectmodel;

import org.openqa.selenium.WebDriver;

public class multipletestcases {
	
	
	public  static void verifysignin(WebDriver driver)
	{
		mercurysignin.username_signin(driver).sendKeys("sangamesh@talawar.com	");
		mercurysignin.password_signin(driver).sendKeys("Sanagam@123");
		mercurysignin.signin_signin(driver).click();
	}
	
	public  static void verifyreg(WebDriver driver)

	{   mercurysignin.register_signin(driver).click();
		mercuryreg.firstname_reg(driver).sendKeys("aaa");
		mercuryreg.lastname_reg(driver).sendKeys("vvvv");
		mercuryreg.phone_reg(driver).sendKeys("2222222222");
		mercuryreg.email_reg(driver).sendKeys("abc@gmail.com");
		mercuryreg.address1_reg(driver).sendKeys("flat:203");
		mercuryreg.address2_reg(driver).sendKeys("blueberry");
		mercuryreg.city_reg(driver).sendKeys("Edison");
		mercuryreg.state_reg(driver).sendKeys("New Jersey");
		mercuryreg.postalcode_reg(driver).sendKeys("432123");
		mercuryreg.country_reg(driver).selectByVisibleText("UNITED STATES");
		mercuryreg.username_reg(driver).sendKeys("dheera");
		mercuryreg.password_reg(driver).sendKeys("india123");
		mercuryreg.confirmpassword_reg(driver).sendKeys("india123");
		mercuryreg.register_reg(driver).click();
	}
}
