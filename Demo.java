package com.cjc;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class Demo {

	@Test
	public void getmethod()
	{
		RestAssured.baseURI="https://reqres.in/api/users/2";
		
		Response resonse=RestAssured.request(Method.GET);
		
		resonse.contentType();
		
		String body=resonse.getBody().asString();
		
		System.out.println("Body of Response is"+body);
		
		int status=resonse.getStatusCode();
		System.out.println("Status Code"+status);
		Assert.assertEquals(status, 200);
		
		
	}
}
