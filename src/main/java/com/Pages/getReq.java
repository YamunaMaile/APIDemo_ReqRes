package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.*;
import io.restassured.RestAssured;

public class getReq {

	public WebDriver driver;
	
	@Test
	public void getReq()
	{
		
		//Get request having 200 success code
		
		//System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"src\\test\\resources\\chromedriver\\chromedriver.exe");
		//driver=new ChromeDriver();
		Response resp=RestAssured.get("https://reqres.in/api/user?pages=2");
	System.out.println("status code : "+resp.getStatusCode());
	System.out.println("Header- Content-Type : "+resp.getHeader("Content-Type")); //response header key-value pair-->header having key, content type, date, connection etc.
	System.out.println("Time : "+resp.getTime());
	System.out.println("Response body : "+resp.getBody().asString());
	
	int statuscodeExp=resp.getStatusCode();
	Assert.assertEquals(statuscodeExp, resp.getStatusCode(),"wroong status code");
	}
	
}
