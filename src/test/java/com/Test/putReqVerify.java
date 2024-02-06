package com.Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class putReqVerify {

	
	@Test
	public void putReq()
	{
		
		//put--> update existed entry with new entry and status code-200
		
		JSONObject obj=new JSONObject();
		obj.put("name", "PutTest");
		obj.put("job", "PutJob");
		
		RestAssured.baseURI="https://reqres.in/api/users/189"; //existed 189 id name to update it
		RestAssured.given().header("Content-Type","application/json").contentType(ContentType.JSON)
		.body(obj.toJSONString())
		.when().put()
		.then().statusCode(200).log().all();
	}
}
