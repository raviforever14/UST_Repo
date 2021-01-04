package RestAssuredDemo.RestAssuredDemo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Json_Requests {
	
	@Test(enabled=false)
	public void get_Request() {
		
		baseURI="http://localhost:3000/";
		given().
		param("subjectId" , 2).
		get("/users").
		then().
		statusCode(200).
		log().all();
		
	}
	
	@Test(enabled=false)
	public void post_Request()
	{
		JSONObject jsonReq= new JSONObject();
		jsonReq.put("firstName",  "Shiva");
		jsonReq.put("lastName", "Kumar");
		jsonReq.put("subjectId", 2);
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
	@Test(enabled=false)
	public void patch_Request()
	{
		JSONObject jsonReq= new JSONObject();

		jsonReq.put("lastName", "tagore");
			 
		  baseURI = "http://localhost:3000/";
		  
			given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				header("Content-Type","application/json").
				body(jsonReq.toJSONString()).
			when().
				patch("/users/4").
			then().
				statusCode(200).
				log().all();
		}

	@Test(enabled=false)
	public void put_Request()
	{
		JSONObject jsonReq= new JSONObject();

		jsonReq.put("lastName", "God");
			 
		  baseURI = "http://localhost:3000/";
		  
			given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				header("Content-Type","application/json").
				body(jsonReq.toJSONString()).
			when().
				put("/users/4").
			then().
				statusCode(200).
				log().all();
		}
	@Test(enabled=true)
	public void delete_Request()
	{
		JSONObject jsonReq= new JSONObject();

		jsonReq.put("lastName", "God");
			 
		  baseURI = "http://localhost:3000/";
		  
			/*given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				header("Content-Type","application/json").
				body(jsonReq.toJSONString()).*/
			when().
				delete("/users/4").
			then().
				statusCode(200). //or statuscode should be 204
				log().all();
		}

}
