package com.org.dailytask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFacebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.id("//input[@id='email']"));
		//driver.findElement(By.id("pass"));
		//driver.findElement(By.id("u_0_b"));
		//input[@id="u_0_m"]
		//input[@id="u_0_o"]
		//input[@id="u_0_r"]
		//input[@name="reg_passwd__"]
		WebElement firstname=driver.findElement(By.xpath("//input[@id='u_0_m']"));
		firstname.sendKeys("sangeetha");
		WebElement lastname=driver.findElement(By.xpath("//input[@id='u_0_o']"));
		lastname.sendKeys("saravanan");
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='u_0_r']"));
		mobileno.sendKeys("12345");
		WebElement newpassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpassword.sendKeys("sarvanan1234");
		
		
		
		
		
		WebElement date=driver.findElement(By.id("day"));
		Select select = new Select(date);
		select.selectByIndex(17);
	   WebElement month=driver.findElement(By.id("month"));
	    Select select1 = new Select(month);
	    select.selectByValue("5");
	    WebElement year=driver.findElement(By.id("year"));
	    Select select2 = new Select(year);
	    select2.selectByVisibleText("1992");

		WebElement Gender=driver.findElement(By.xpath("//input[@id='u_0_6']"));
		Gender.click();//radio button
}
}
