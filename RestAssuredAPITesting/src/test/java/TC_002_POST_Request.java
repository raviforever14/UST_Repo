import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_002_POST_Request {

	@Test
	public void postRequest() {
		
		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		 RequestSpecification request = RestAssured.given();
		 
		 JSONObject requestParams = new JSONObject();
		 requestParams.put("FirstName", "Virender"); // Cast
		 requestParams.put("LastName", "Singh");
		 requestParams.put("UserName", "sdimpleuser2dd2011");
		 requestParams.put("Password", "passworzzd1");
		 
		 requestParams.put("Email",  "sample2ee26d9@gmail.com");
		 request.body(requestParams.toString());
		 Response response = request.post("/register");
		 
		 int statusCode = response.getStatusCode();
		 Assert.assertEquals(statusCode, "201");
		 String successCode = response.jsonPath().get("SuccessCode");
		 Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
		
		
		/*RestAssured.baseURI="http://restapi.demoqa.com/customer";
		
		//Request Object
		RequestSpecification getRequest=RestAssured.given();

		//Response Objects
		JSONObject requestParam=new JSONObject();
		requestParam.put("FirstName", "RavilllKumar");
		requestParam.put("LastName", "Sunnmm");
		requestParam.put("UserName", "RaviKumar");
		requestParam.put("Password", "May2012000");
		requestParam.put("Email", "RaviKumar1212@gmail.com");
		
		//Define Header in Json Format
		getRequest.header("Content-Type", "application/json");
		getRequest.body(requestParam.toString());
		
		//Response Object
		Response responseObj=getRequest.request(Method.POST,"/register");

		String responseDetails=responseObj.getBody().asString();
		System.out.println("response details are="+responseDetails);
		
		int statuscode= responseObj.getStatusCode();
		System.out.println("status code is="+statuscode);
		org.testng.Assert.assertEquals(statuscode, 200);
		
		//Verify the response successcode
		String successCode=responseObj.jsonPath().get("SuccessCode");
		Assert.assertEquals(successCode, "OPERATION_SUCCESS");

		*/
	}
}
