package dropDownPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class dropDownDemo {
	public static WebDriver driver;
  @Test(enabled=false)
  public void dropDown()throws Exception {
	  driver.get("https://www.cleartrip.com");
	  Select dropDown= new Select(driver.findElement(By.id("Adults")));
	  dropDown.selectByIndex(2);
	  
	  Thread.sleep(2000);
	  dropDown.selectByValue("5");
	  Thread.sleep(2000);
	  dropDown.selectByVisibleText("9");
	  
  }
  @Test(enabled=false)
  public void webtableSample() {
	  driver.get("F:///Magnitia_hyd/tablesex.html");
	  String str= driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[1]")).getText();
	  System.out.println("table data="+str);
  }
  
  @Test(enabled=false)
  public void handleChildWindow()throws Exception
  {
	  driver.get("https://spicejet.com");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  String mainwindow=driver.getWindowHandle();
	  driver.findElement(By.xpath("//a[text()='Gift Card']")).click();
	  Set<String> multipleWindow=driver.getWindowHandles();
	  for(String childWindow:multipleWindow) {
		  if(!childWindow.equals(mainwindow)) {
			  driver.switchTo().window(childWindow);
			  System.out.println(driver.getTitle());
		  }
		  
	  }	  		
  }
  @Test(enabled=false)
  public void startWithMethod()
  {
	  driver.get("https://www.lambdatest.com/");
	 // driver.findElement(By.xpath("//a[starts-with(text(),'Register')]")).click();
	  //driver.findElement(By.xpath("//ul[@class='navbar-nav']//following::li[3]//a")).click();
	  driver.findElement(By.xpath("//li[@class='nav-item sign-up-li']//following-sibling::a")).click();
	  System.out.println(driver.getCurrentUrl());
	  //a[text()='Blog']//preceding::li[1]
	  //li[@class='nav-item']//preceding-sibling::li[1]
	  //input[@name='password']//parent::div
	//div[@class='col-sm-12 google-sign-form']/child::input[3]")).sendKeys("selenium");
	//div[@class='form-group form-check mt-2']//descendant::label



	  
  }
  
  @Test(enabled=false)
  public void readTableLink()throws Exception
  {
	  driver.get("https://www.icicidirect.com/idirectcontent/Home/Home.aspx");
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Markets")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.partialLinkText("Stats")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("hrfNW")).click();
	  Thread.sleep(3000);
	  WebElement tabledata=driver.findElement(By.xpath("//*[id='gridSource']/tbody"));
	  List <WebElement> rowData=tabledata.findElements(By.tagName("tr"));
	  for(WebElement Eachrow:rowData) {
		  
			  
		List<WebElement>colData=Eachrow.findElements(By.tagName("td"));
		for(WebElement eachCol:colData) {
			if(eachCol.getText().contains("TCS".trim())){
				List<WebElement> links=eachCol.findElements(By.tagName("a"));
				for(WebElement eachLink:links)
				{
					eachLink.click();
					break;
				}
				
				
			}
		}
		  
	  }
	  
  }
  
  
  @Test(enabled=true)
  public void dropDown2()throws Exception {
	  driver.get("https://www.spicejet.com");
	  List <WebElement> lstdn=driver.findElements(By.tagName("select"));
	  int visbleDdn=0;
	  int invisibleDdn=0;
	  int singleSelected=0;
	  int multiSelected=0;
	  System.out.println("Total size="+lstdn.size());
	  for(int i=0;i<lstdn.size();i++) {
		  if(lstdn.get(i).isDisplayed()) {
			  visbleDdn=visbleDdn+1;
		  }else {
			  invisibleDdn=invisibleDdn+1;
		  }
		  Select selectMulti=new Select(lstdn.get(i));
		  if(selectMulti.isMultiple())
		  {
			  multiSelected=multiSelected+1;
		  }else {
			  singleSelected=singleSelected+1;
		  }
			  
		
	  } 
	  System.out.println("Visisble select count="+visbleDdn);
	  System.out.println("Invisible select count="+invisibleDdn);
	  System.out.println("MultipleSelected select count="+multiSelected);
	  System.out.println("SingleSelected select count="+singleSelected);
  }
  
  @Test(enabled=false)
  public void verifyMultipleSelect()throws Exception
  {
	  driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Check drop-down
		WebElement e=driver.findElement(By.id("Adults"));    
		
		Select s=new Select(e);
		if(s.isMultiple())
		{
			System.out.println("Multi-select");
		}
		else
		{
			System.out.println("Single-select");
		}
		//Close site
		driver.close();

  }
  
 @Test(enabled=false) 
 public void imageCount() {
	 driver.get("https://spicejet.com");
	List <WebElement>li=  driver.findElements(By.xpath("(//img)|(//div[@type='image'])"));//Generic xpath for image
	 System.out.println("image length="+li.size());
	 int imgvisiblecount=0;
	 int imginvisible=0;
	 for(int i=0;i<li.size();i++) {
		 if(li.get(i).isDisplayed()) {
			 imgvisiblecount++;
		 }else {
			 imginvisible++;
		 }
		 
	 }System.out.println(
				"visible images count is "+imgvisiblecount);
		System.out.println(
				"Invisible images count is "+imginvisible);
	 
 }
 @Test(enabled=false) 
 public void countDropDownEle() {
	 driver.get("https://cleartrip.com");
	Select adultsEle= new Select(driver.findElement(By.id("Adults")));
	 List <WebElement> li=adultsEle.getOptions();

	 for(int i=0;i<li.size();i++) {
		 
		// System.out.println("DropDown Elelments are="+li.get(i).getText());
		 if(li.get(i).getText().equalsIgnoreCase("6")) {
			 System.out.println("6 ele is selected="+li.get(i).getText());
		 }
		}
	 }	
	 @Test(enabled=false)
	 public void findElewdoutSelect() {
		 driver.get("https://cleartrip.com");
		 String str=driver.findElement(By.id("Adults")).getText();
		 //char [] a= str.toCharArray();
		 
		 System.out.println("string values in dropdown="+str);
		 String s[]=str.split("\n");
		 for(int i=0;i<s.length;i++) {
			 if(s[i].equalsIgnoreCase("4")) {
				 System.out.println("get Value ="+s[i]);
			 }
		 }
	 }
		 @Test(enabled=false)
		 public void multipleSelectionDropDown()throws Exception {
			 
			 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");   
			 driver.manage().window().maximize();
				Thread.sleep(3000);
				//Switch to frame
				driver.switchTo().frame("iframeResult");
				//Automate multi-select drop-down
				WebElement e=driver.findElement(By.name("cars"));
				Select s=new Select(e);
				Actions a=new Actions(driver);
				a.keyDown(Keys.CONTROL).build().perform();
				Thread.sleep(3000);
				a.click(s.getOptions().get(0)).build().perform();
				Thread.sleep(3000);
				a.click(s.getOptions().get(3)).build().perform();
				Thread.sleep(3000);
				a.keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(3000);
				s.deselectByVisibleText("Audi");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/form/input")).click();
			
		 }
	 
		 @Test(enabled=false)
		 public void getallLinks()throws Exception {
			 
			 driver.get("https://www.ebay.com");   
			 driver.manage().window().maximize();
			 List <WebElement> pageLink=driver.findElements(By.tagName("a"));
			 System.out.println("Total Link available on Page: "+pageLink.size());
			 for(WebElement eachLink:pageLink) {
				 if(!eachLink.getText().isEmpty()) {
					 System.out.println("link name="+eachLink.getText());
					 System.out.println("page link details="+eachLink.getAttribute("href"));
				 }
				
			 }
		}
				
		 @Test(enabled=false)
		 public void getPartialLink()throws Exception {
			 
			 driver.get("https://mail.yahoo.com");   
			 driver.manage().window().maximize();
			 driver.findElement(By.partialLinkText("up")).click();// link name as Sign up
			 
		}	
		 
		 @Test(enabled=false)
		 public void getLabelsandButton()throws Exception {
			 
			 driver.get("https://www.facebook.com");   
			 driver.manage().window().maximize();
			 List <WebElement> pageLabel=driver.findElements(By.tagName("label"));
			 
			 System.out.println("Total Label available on Page: "+pageLabel.size());
			 for(WebElement eachLabel:pageLabel) {
					 System.out.println("labels name="+eachLabel.getText());
					 							
			 }
			 List<WebElement> pageButton=driver.findElements(By.tagName("button"));
			 			 
			 for(WebElement eachButton:pageButton) {

				 System.out.println("page Buttons details="+eachButton.getAttribute("id"));
				
		 }
		}	
		 

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Snapdealassignment\\chromedriver_win32_v80\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
