import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC001_Get_Request {
	
	@Test
	public void getWeatherDetails() {
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city/";
		//Request Object
		RequestSpecification req=RestAssured.given();
		//Response Objects
		Response response= req.request(Method.GET,"/Hyderabad");
		
		String responseDetails=response.getBody().asString();
		System.out.println("response details are="+responseDetails);
		
		int statuscode= response.getStatusCode();
		System.out.println("status code is="+statuscode);
		Assert.assertEquals(200, statuscode);
		System.out.println("status line="+response.getStatusLine());
		Assert.assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
	}

}
