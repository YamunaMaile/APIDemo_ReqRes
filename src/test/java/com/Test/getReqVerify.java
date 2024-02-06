package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getReqVerify {

	
public WebDriver driver;
	
/*
 * @Test public void getReq() { //Get request-> access record and 200 success
 * code
 * 
 * //System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")
 * +"src\\test\\resources\\chromedriver\\chromedriver.exe"); //driver=new
 * ChromeDriver(); Response
 * resp=RestAssured.get("https://reqres.in/api/user?pages=2");
 * System.out.println("status code : "+resp.getStatusCode());
 * System.out.println("Header- Content-Type : "+resp.getHeader("Content-Type"));
 * //response header key-value pair-->header having key, content type, date,
 * connection etc. System.out.println("Time : "+resp.getTime());
 * System.out.println("Response body : "+resp.getBody().asString());
 * 
 * int statuscodeExp=resp.getStatusCode(); Assert.assertEquals(statuscodeExp,
 * resp.getStatusCode(),"wroong status code");
 * 
 * }
 */
	
	@Test
	public void getReq2()
	{
		//given -->what we have now- URL and query parameter
		//when--> action or what we need to do. HTTP request will mention here
		//then--> Outcome/ response and validate the response
		
		
		//Multiple records
		//RestAssured.baseURI="https://reqres.in/api/users";
		//RestAssured.given().queryParam("pages", "9")
		
		//Single record
		RestAssured.baseURI="https://reqres.in/api/users/9";
		RestAssured.given()
		.when().get()
		.then().statusCode(200).log().all();
	}
	
}
