package RestAssuredDemo.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class POST_Request {
	
	@Test(enabled=false)
	public void Tc001_Post_req() {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "ravi");
		map.put("job", "software");
		
		System.out.println("MAP Data is="+map);
		JSONObject req=new JSONObject();
		req.putAll(map);
		System.out.println("json format="+req.toJSONString());
		
		RestAssured.given().
		header("Content-Type","application/json").accept(ContentType.JSON).
//		contentType(ContentType.JSON).accept(ContentType.JSON).
		 body(req.toJSONString()).
		 when().
		 post("https://reqres.in/api/users").
		 then().
		 statusCode(201);
		
				
	} 

	@Test(enabled=false)
	public void Tc002_PUT_req() {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "ravi");
		map.put("job", "software");
		
		System.out.println("MAP Data is="+map);
		JSONObject req=new JSONObject();
		req.putAll(map);
		System.out.println("json format="+req.toJSONString());
		
		RestAssured.given().
		header("Content-Type","application/json").accept(ContentType.JSON).
//		contentType(ContentType.JSON).accept(ContentType.JSON).
		 body(req.toJSONString()).
		 when().
		 put("https://reqres.in/api/users/2").
		 then().
		 statusCode(200).log().all();
		
				
	} 
	
	@Test(enabled=true)
	public void Tc003_Patch_req() {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "ravi");
		map.put("job", "software");
		
		System.out.println("MAP Data is="+map);
		JSONObject req=new JSONObject();
		req.putAll(map);
		System.out.println("json format="+req.toJSONString());
		
		RestAssured.given().
		header("Content-Type","application/json").accept(ContentType.JSON).
//		contentType(ContentType.JSON).accept(ContentType.JSON).
		 body(req.toJSONString()).
		 when().
		patch("https://reqres.in/api/users/2").
		 then().
		 statusCode(200).log().all();
		
				
	}
	@Test(enabled=true)
	public void Tc004_Delete_req() {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "ravi");
		map.put("job", "software");
		
		System.out.println("MAP Data is="+map);
		JSONObject req=new JSONObject();
		req.putAll(map);
		System.out.println("json format="+req.toJSONString());
		
		RestAssured.given().
		header("Content-Type","application/json").accept(ContentType.JSON).
//		contentType(ContentType.JSON).accept(ContentType.JSON).
		 body(req.toJSONString()).
		 when().
		delete("https://reqres.in/api/users/2"). 
		 then().
		 statusCode(204).log().all(); //status code should be 204 as expected
		
				
	} 
}
