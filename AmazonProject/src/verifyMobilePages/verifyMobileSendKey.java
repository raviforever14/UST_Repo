package verifyMobilePages;

import org.openqa.selenium.WebDriver;

public class verifyMobileSendKey {
	
	public static void verifyMobileFunctionality(WebDriver driver) throws Exception {
		tcverifyMobile.clickOnMobileLink(driver).click();
		Thread.sleep(2000);
		tcverifyMobile.selectMobileType(driver).click();
		Thread.sleep(2000);
		tcverifyMobile.clickOnAddtoWishClickon(driver).submit();
		Thread.sleep(2000);
	}
	

}
