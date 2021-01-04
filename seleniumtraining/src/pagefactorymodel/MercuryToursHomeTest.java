package pagefactorymodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;




public class MercuryToursHomeTest {
	WebDriver driver;

@Test
public void home() throws Exception{
	   MercuryToursHomePage mtp = PageFactory.initElements(driver, MercuryToursHomePage.class);
	  //mtp.registerme();
	  mtp.openMercuryTours();
	 // mtp.login();
	  
	   RegistrationPage reg = PageFactory.initElements(driver, RegistrationPage.class);
	  mtp.registerme();
	  reg.user_registration();
	  reg.signoff();
	  mtp.login();
	  
	  
	  
	 
}


@BeforeTest
public void beforeTest() throws InterruptedException {
	  driver = Drivers.getDriver("chrome");
}

@AfterTest
public void afterTest() {
	//driver.quit();
}


}
