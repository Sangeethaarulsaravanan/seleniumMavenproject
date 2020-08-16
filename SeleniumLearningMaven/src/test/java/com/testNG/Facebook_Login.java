package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Login {
	WebDriver driver;
	 @BeforeMethod
	  public void launchapp() {
		 WebDriverManager.chromedriver().setup();
		//.setProperty("webdriver.chrome.driver", "E:/Selenium webdriver/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		  }
	  @Test
	  public void login() {
		  driver.findElement(By.id("email")).sendKeys("sangeetha.t@gmail.com");
		  driver.findElement(By.id("pass")).sendKeys("sangi@1234");
		  driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	  }
	  @AfterMethod
	  public void closeapp() {
		  driver.close();
	  }

	

}
