package com.Test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class deleteReqVerify {

	@Test
	public void deleteReq()
	{
		//delete-->delete the existed record and status code-204
		
		RestAssured.baseURI="https://reqres.in/api/users/189"; //existed record deleting
		RestAssured.given()
		.when().delete()
		.then().statusCode(204).log().all();
	}
}
