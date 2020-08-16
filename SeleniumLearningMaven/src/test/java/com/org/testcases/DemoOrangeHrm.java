package com.org.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOrangeHrm {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=null;
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    
    
		     driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			// driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("sangeetha");
			 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			 driver.findElement(By.className("button")).click();
			// driver.findElement(By.xpath("//input[@id='btnLogin']"));
			 
			 
			 
			 
			//driver.findElement(By.linkText("Forgot your password?")).click();
			// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sangee1234");
			 //driver.findElement(By.id("securityAuthentication_userName")).sendKeys("sangeetha");
			 //Thread.sleep(1000);
			// driver.findElement(By.xpath("//input[@id='btnSearchValues']")).click();
			 //driver.findElement(By.className("searchValues")).click();
			  // Thread.sleep(1000);
			 //driver.findElement(By.id("btnCancel")).click();
}
}
