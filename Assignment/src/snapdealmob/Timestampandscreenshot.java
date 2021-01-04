

package snapdealmob;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;

public class Timestampandscreenshot {
 

	          public WebDriver driver;
	          public String dateNow=null;
	          public  void timestamp()
	          {
	                Calendar currentDate = Calendar.getInstance();
	                SimpleDateFormat formatter= new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
	                dateNow = formatter.format(currentDate.getTime());
	                System.out.println("Now the date is :=>  " + dateNow);
	          }
	          public void captureScreenshot(String str) throws Exception
	          {
	             
	            	  
	      File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(f, new File(
	              "F:\\Snapdeal\\"+str+dateNow+".png"));
	           
	      
	          }
	         
	         
	          public void f() throws Exception{
	        	 
	              timestamp();
	            captureScreenshot("Mobile and Tablet");

	        }
	           
	           
}
	       
	     
	     

  

