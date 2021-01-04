package RestAssuredDemo.RestAssuredDemo;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import java.util.Iterator;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.parse.ANTLRParser.exceptionGroup_return;
import io.restassured.http.ContentType;

public class DataDrivenExample1 extends DataforTest{

	/*@DataProvider(name="dataValues")
	public Object[][] dataForPost(){
		Object[][] data= new Object[2][3];
		
		data[0][0]="Edison";
		data[0][1]="Thomas";
		data[0][2]=1;
		
		data[1][0]="David";
		data[1][1]="Calis";
		data[1][2]=2;
		
		return data;
		//Second method
		return new Object[][] {
			{"Vilium","kule",2},
			{"Hanry","bery",1}
		};
	}*/
	
	@Test(enabled=false, dataProvider="dataValues")
	public void post_Request(String firstName,String lastName,int subjectId)
	{
		JSONObject jsonReq= new JSONObject();
		jsonReq.put("firstName",  firstName);
		jsonReq.put("lastName", lastName);
		jsonReq.put("subjectId", subjectId);
		  //jsonObj.put("id", 4);
		  baseURI = "http://localhost:3000/";
		  
			given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				header("Content-Type","application/json").
				body(jsonReq.toJSONString()).
			when().
				post("/users").
			then().
				statusCode(201).
				log().all();
		}
	
	//@DataProvider(name="deleteTestData")
	public Object[] deleteData(){
		return new Object[] {8,9};
		}


@Parameters({"userId"})
	//@Test(enabled=false,dataProvider="deleteTestData")
	@Test
public void delete_Request(int userId)
{
	System.out.println("user id value to be deleted="+userId);
	JSONObject jsonReq= new JSONObject();

		  baseURI = "http://localhost:3000/";
	  		
		when().
		
			delete("/users/"+userId).
		then().
			statusCode(200). //or statuscode should be 204
			log().all();
	}
	
	
}
