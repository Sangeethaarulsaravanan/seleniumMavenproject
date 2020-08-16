package com.testNG;

import java.io.IOException;

import org.testng.annotations.Test;

public class CallWrapper {
	@Test
	
	
	public void facebooklogin() throws IOException{
	WrapperMethod wm= new WrapperMethod();
	wm.insertapp("https://www.facebook.com/");
	wm.enterbyid("email","sangeetha.t87@gmail.com");
	wm.enterbyid("pass", "sangi@1234");
	wm.clickbyxpath("//input[@id='u_0_b']");
	wm.takesnap("E:\facebook screenshot\\facebooklogin.png");
	
	//practice 
	//https://freecrm.co.in/
	
}
}
