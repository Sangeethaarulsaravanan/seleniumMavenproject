package com.testNG;

import org.testng.annotations.Test;

public class DependsOnGroup {
	
	
		@Test(groups = {"smoke testing","regression testing"})
		
		public void login()
		{
			System.out.println("test case 1");
		}
		@Test(groups = {"sanity testing","regression testing"})
		
		public void search()
		{
			System.out.println("test case 2");
		}
		@Test(groups = {"retest testing","functional testing"})

		public void logout()
		{
			System.out.println("test case 3");
		}
		
		
	}


