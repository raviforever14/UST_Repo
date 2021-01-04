package RestAssuredDemo.RestAssuredDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GET_Request {

	@Test(enabled=false)
	public void getRequest_tc01()
	{
		Response res= RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Repsonse of Get request is="+res.asString());
		System.out.println("Body of Get request is="+res.getBody());
		System.out.println("Status Code of Get request is="+res.getStatusCode());
		System.out.println("StatusLine of Get request is="+res.getStatusLine());
		System.out.println("Content type of Get request is="+res.getHeader("content-type"));
		System.out.println("Time of Get request is="+res.getTime());
		int statiuscode=res.getStatusCode();
		Assert.assertEquals(statiuscode, 200);
	}
	
	@Test(enabled=false)
	public void getRequest_Tc02() {
		RestAssured.given()
					.get("https://reqres.in/api/users?page=2")
				.then()
				.statusCode(200)
				.body("data.id[0]", equalTo(7));
				
	}
	@Test(enabled=true)
	public void getRequest_tc03() {
		RestAssured.given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.body("data.id[3]", equalTo(10))
		.body("data.first_name", hasItems("Byron","George"))
		//.log().all();
		.log().body();
		
	}
}