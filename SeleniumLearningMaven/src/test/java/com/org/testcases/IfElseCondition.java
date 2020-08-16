package com.org.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfElseCondition {

	public static void main(String[] args) {
		//String browser= "chrome";
		String browser= "firefox";
		WebDriver driver=null;
		
		if (browser.equals("chrome")) {
			//System.out.println("chrome");
			
		    WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();

			
		} else if (browser.equals("firefox")) {
			//System.out.println("firefox");
			 WebDriverManager.firefoxdriver().setup();
			  driver= new FirefoxDriver();
		     driver.get("https://www.google.com/");
			 driver.manage().window().maximize();
			 
          }
		
	
	
	}

}
