package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	 @Test
	  public void login() {
		  System.out.println("login");
	  }
	  @Test(dependsOnMethods="login")
	  public void search() {
		  System.out.println("search");
		 // Assert.assertEquals("actualresult","expectedresult");expected result xyz,but found abc
		  Assert.assertEquals("abc", "xyz");
	  }
	  @Test(dependsOnMethods="search",alwaysRun=true)
	  public void logout() {
		  System.out.println("logout");
	  }

}
