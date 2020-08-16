package com.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.pages.Facebook_Login;

public class Facebook_LoginTestcase extends Library{
	Facebook_Login login;
	
@BeforeClass
public void startapp(){
	launchApplication("chrome","https://www.facebook.com/");
}
@Test
public void login(){
	login=new Facebook_Login(driver);
	login.username("sangeetha.t87@gmail.com");
	login.password("sangi@1234");
	login.loginbutton();
	}
	
	@AfterClass
	public void teardown(){
		quit();
}
}
