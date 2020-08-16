package com.org.testcases;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nakuri {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "E:/Selenium webdriver/chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://www.Naukri.com/");
    	driver.manage().window().maximize();
    	
     String Parentwindow=driver.getWindowHandle();
     
     
 // to handle all new open window
     Set<String> childwindow=driver.getWindowHandles();
     int count= childwindow.size();
     System.out.println(count);
     for (String child : childwindow) {
    	 if(!Parentwindow.equalsIgnoreCase(child)){
			   driver.switchTo().window(child);
			
     }
    	    driver.switchTo().window(Parentwindow);
  }
  }
  }
     
     

	


