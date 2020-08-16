package com.testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.Library;
import com.pages.FaceBook_RegisterPage;
import com.pages.Facebook_Login;

public class faceBook_RegisterTestcase extends Library{
	FaceBook_RegisterPage login;
	
	@BeforeClass
	public void startapp(){
		launchApplication("chrome","https://www.facebook.com/");
	}
	@Test
	public void login(){
		login=new FaceBook_RegisterPage(driver);
		login.firstname("sangee");
		login.lastname("saravanan");
		login.emailaddress("sangi@1234");
		login.password("pass");
	}
		
		@AfterClass
		public void teardown(){
			quit();
	}


}
