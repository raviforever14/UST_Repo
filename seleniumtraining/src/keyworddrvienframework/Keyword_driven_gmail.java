package keyworddrvienframework;
import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Keyword_driven_gmail {

	
		static WebDriver driver = new ChromeDriver();
		 
		 public static void main(String[] args)throws Exception
		 {
		       
		         
		       driver.get("http://gmail.com");
		              // Workbook workbook;
		               try {
		            	   Workbook workbook = Workbook.getWorkbook(new File("D:\\TestData\\Yahoo_Keyworddriven.xls"));
		                      Sheet sheet = workbook.getSheet(0);
		                     
		                      
		               //code to read Test Case
		                      int rowcount=sheet.getRows();
		                      for(int i=1;i<rowcount;i++)
		                      {
		                            String TC_name=sheet.getCell(0,i).getContents().toString();
		                            //Call function ExecuteFunction to Read Mapped Function
		                            Execute(TC_name);
		                           
		                     
		                      }
		                      //Close Browser
		                      quitdriver();
		                     
		               } catch (BiffException e) {
		                      // TODO Auto-generated catch block
		                      e.printStackTrace();
		               } catch (IOException e) {
		                      // TODO Auto-generated catch block
		                      e.printStackTrace();
		               }
		              
		 }
		 public static void Execute(String Casename)throws Exception
		 {
		        String Option=Casename.trim();
		       
		  if(Option.equalsIgnoreCase("TC_Login") )
		  {
			  //Execute Login
			  Login();
		  }
		  else if(Option.equalsIgnoreCase("TC_Compose"))
		  {
		         //Execute Compose Function
			  Compose();
		  }
		  else if(Option.equalsIgnoreCase("TC_Logout"))
		  {
		        //Execute Logout
		         Logout();
		  }
		  }
		
		 public static void Login() throws Exception{
			  
		  		driver.get("http://gmail.com");
			// driver.findElement(By.linkText("Sign in")).click();
			 //se.waitForPageToLoad("1000");
		  		Thread.sleep(1000);
			  driver.findElement(By.id("Email")).sendKeys("dheeraselenium@gmail.com");
			  driver.findElement(By.id("next")).click();
			 //se.waitForPageToLoad("3000");
			  Thread.sleep(3000);
			  driver.findElement(By.id("Passwd")).sendKeys("mindq2015");
			  driver.findElement(By.id("signIn")).click();
	  }
	  

	public static void Compose() throws Exception
	{
		  	
			Thread.sleep(40000);
		  	driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();
		   	Thread.sleep(10000);
		  	driver.findElement(By.name("to")).sendKeys("suraj.forever14@gmail.com");
		  	driver.findElement(By.name("subjectbox")).sendKeys("Hi");
		  	driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("welcome to selenium class");
			 Thread.sleep(10000);
			  driver.findElement(By.xpath("//div[text()='Send']")).click();
			 
	}

	 	  public static void Logout() throws Exception{
	 		Thread.sleep(10000);
	 		   driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	 		   Thread.sleep(2000);
		   driver.findElement(By.id("gb_71")).click();
		   
	  
	}

	 	 public static void quitdriver()
		 {
		  driver.quit();
		 }
}
