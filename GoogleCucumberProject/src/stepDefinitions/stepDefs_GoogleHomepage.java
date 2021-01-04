package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import seleniumPage.Page_GoogleHomepage;

public class stepDefs_GoogleHomepage {
	Page_GoogleHomepage googlePage=new Page_GoogleHomepage();
	

	@Given("^I launch Chrome browser$")
	
		public void i_launch_chrome_browser()  throws Exception{
		googlePage.launchBrowser();
			System.out.println("launch Browser");
		}
	
	@When("^I open Google Homepage$")
	public void i_open_Google_homepage() throws Exception{
		googlePage.openGoogleURL();
		System.out.println("Open Google HomePage");
	}
	@Then("^I verify that the page display search test box$")
	public void i_display_search_page_text_box() throws Exception{
		googlePage.checkSearchBoxIsDisplayed();
		System.out.println("Google Display search text box");
	}
	@Then("^Google displays search button$")
	public void google_display_search_button() throws Exception{
		googlePage.checkGoogleSearchButtonIsDisplayed();
		System.out.println("Google Display search button");
	}
	@Then("^Google displays I'm feeling Lucky button$")
	public void google_displays_im_feeling_lucky_button() throws Exception{
		googlePage.checkImFeelingLuckyButtonIsDisplayed();
		System.out.println("Google Display I'm feeling Lucky button");
	}
}
