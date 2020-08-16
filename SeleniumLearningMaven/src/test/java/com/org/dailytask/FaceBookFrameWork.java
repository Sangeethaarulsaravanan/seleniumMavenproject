package com.org.dailytask;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookFrameWork {
	WebDriver driver;
	@BeforeMethod
	public void launchApp(){
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
	@Test(description="FaceBook login",priority=1)
	public void LoginToApp (){
	WebElement name=driver.findElement(By.id("email"));
	name.sendKeys("sangeetha.t87@gmail.com");
	WebElement password =driver.findElement(By.id("pass"));
	password.sendKeys("sangi@1234");
	WebElement login= driver.findElement(By.id("u_0_b"));
	login.click();
}
	@Test(description="Register Page",priority=2)
	public void RegisterPage (){
		WebElement date=driver.findElement(By.xpath("//*[@id='day']"));
		Select select = new Select(date);
		select.selectByIndex(17);
	    WebElement month=driver.findElement(By.xpath("//select[2]"));
	    Select select1 = new Select(month);
	    select1.selectByValue("5");
	    WebElement year=driver.findElement(By.id("year"));
	    Select select2 = new Select(year);
	    select2.selectByVisibleText("1992");
}  
	@AfterMethod
	public void closeApp(){
		driver.getTitle();
		driver.close();
	}
}
