package com.Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class postReqVerify {

	
	@Test
	public void postReq()
	{ 
		//post-> add new entry and status code-201
		
		//json object creating to add json entry 
		JSONObject obj=new JSONObject();
		obj.put("name","TestingPost3");  //id=536
		obj.put("job", "QAEngineer3");
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("Content-Type","application/json").contentType(ContentType.JSON)
		.body(obj.toJSONString())
		.when().post()
		.then().statusCode(201).log().all();
		
		
	}
}
