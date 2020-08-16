package com.org.testcases;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		
		 WebDriverManager.iedriver().setup();
	     driver= new ChromeDriver();
	     driver.get("https://www.google.com/");
		 
	/* WebDriverManager.chromedriver().setup();
	 System.setProperty("webdriver.chrome.driver", "E:/Selenium webdriver/chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.quit();*/
		
		
//Select the code -right click-source-togglecomment
//	  WebDriverManager.firefoxdriver().setup();
//	  driver= new FirefoxDriver();
//	  driver.get("https://www.google.com/");
//	  driver.manage().window().maximize();
//	  Thread.sleep(3000);
//		//driver.quit();
}
}
