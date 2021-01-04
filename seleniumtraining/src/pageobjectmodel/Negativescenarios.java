package pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Negativescenarios {
		
		public WebDriver driver;
		@Test
		  public void f() 
		  {
			  
			  try {
		
				  //Get Filepath
				  FileInputStream fi=new FileInputStream("F:\\Magnitia_hyd\\SeleniumLib\\Mercurybdd.xls");
				  
				  //Open Workbook
				  Workbook book=Workbook.getWorkbook(fi);
				  
				  //open Sheet in above workbook
				  Sheet sh=book.getSheet("Sheet3");
				  
				  //Create output file
				  FileOutputStream fo=new FileOutputStream("F:\\Magnitia_hyd\\SeleniumLib\\result.xls");
				  //Copy workbook data to output file
				  WritableWorkbook wwb=Workbook.createWorkbook(fo,book);
				   
				  //Get CellAddress  Syntax:--> sht.getcell(columnnumber,rownumber).getContents();
				  //Target third Sheet
				   Sheet sht3=book.getSheet("Sheet3");
				  	//Count the Number of rows available in sheet
				  int Rcount=sht3.getRows();
				   //Using for loop iterate expected number of rows time
				  for (int i = 1; i < Rcount; i++) 
				  {
					  //Get Cell Address of Username and password
					  String uid=sht3.getCell(0, i).getContents();
					  String pwd=sht3.getCell(1, i).getContents();
					//Get Username Cell data from Excel
					  
					  mercurysignin.username_signin(driver).clear();
					  mercurysignin.username_signin(driver).sendKeys(uid);
					  //Get password Cell data from Excel
					  mercurysignin.password_signin(driver).clear();
					 // mercurysignin.password_signin(driver).clear();
					  mercurysignin.password_signin(driver).sendKeys(pwd);
					  //call signin button
					  mercurysignin.signin_signin(driver).click();
					  if(driver.getTitle().contains("Sign-on: Mercury Tours"))
					  {
						   WritableSheet ws=wwb.getSheet("Sheet3");
						   ws.addCell(new Label(2, i,"Login not sucessful with "+i+"  row input"));
						  
						    }
					 				  }
				  
				  
				  wwb.write();
				  wwb.close();
				  
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			
		  }
		  
		  @BeforeTest
		  public void launchwindow()
		  {
			  
			  System.setProperty("webdriver.chrome.driver", "F:\\Magnitia_hyd\\SeleniumLib\\chromedriver_win32_76\\chromedriver.exe");
	     		 driver=new ChromeDriver();
				 driver.get("http://newtours.demoaut.com/");
			  driver.manage().window().maximize();
		  }
		  
	}

  

