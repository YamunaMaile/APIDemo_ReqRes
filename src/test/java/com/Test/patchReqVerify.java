package com.Test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class patchReqVerify {

	@Test
	public void patchReq()
	{
		//patch--> to update partially data and status code- 200
		JSONObject obj=new JSONObject();
		obj.put("name", "patchTest22"); //updating only name not job
		obj.put("job", "patchJob");
		
		RestAssured.baseURI="https://reqres.in/api/users/189"; //existed 189 id - updating name only not job
		RestAssured.given().header("Content-Type","application/json").contentType(ContentType.JSON)
		.when().patch()
		.then().statusCode(200).log().all();
	}
	
}
