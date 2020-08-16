package com.org.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWaits {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     driver.get("https://opensource-demo.orangehrmlive.com/");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			 //driver.findElement(By.className("button")).click();
			 
			 WebDriverWait wait=new WebDriverWait(driver,25);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("button")));
			 driver.findElement(By.className("button")).click();
				
			 
		   
	}

}
