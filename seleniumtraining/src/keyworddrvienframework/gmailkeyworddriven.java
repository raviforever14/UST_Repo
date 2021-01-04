package keyworddrvienframework;

import java.io.File;
import java.io.IOException;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmailkeyworddriven extends Helper{

	public static WebDriver driver;
	
	  public static void main(String[] args) throws Exception
	  {
		  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  driver.get("http://gmail.com");
	      // Workbook workbook;
	       try {
	    	   Workbook workbook = Workbook.getWorkbook(new File("F:\\Magnitia_hyd\\SeleniumLib\\Gmail_Keyworddriven.xls"));
	              Sheet sheet = workbook.getSheet(0);
	       	              
	       //code to read Test Case
	              int rows=sheet.getRows();
	              for(int i=1;i<rows;i++)
	              {
	                    String TC_name=sheet.getCell(0,i).getContents().toString();
	                    //Call function ExecuteFunction to Read Mapped Function
	                    Execute(TC_name);
	                   
	             
	              }
	              //Close Browser
	              quitdriver();
	             
	       } catch (BiffException e) {
	              // TODO Auto-generated catch block
	            System.out.println(e);
	       } catch (IOException e) {
	              // TODO Auto-generated catch block
	              System.out.println(e);
	       }
	      
	}
	  public  static void  Execute(String Casename)throws Exception
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
		        // Logout();
		  }
		  }
	  public static void quitdriver()
		 {
		  driver.quit();
		 }
		
	  }



