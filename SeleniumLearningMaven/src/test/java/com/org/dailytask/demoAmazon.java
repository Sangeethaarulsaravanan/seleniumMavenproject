package com.org.dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoAmazon {
	public static void main(String[] args) throws InterruptedException {
		
	 WebDriverManager.chromedriver().setup();
	 WebDriver  driver= new ChromeDriver();
     driver.get("https://www.Amazon.com/");
     driver.manage().window().maximize();
WebElement search= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
search.sendKeys("OnePlus Nord");
Thread.sleep(5000);
driver.findElement(By.xpath("//div[contains(@class,'nav-search-submit')]//input[@value='Go']")).click();
Thread.sleep(2000);
WebElement oneplus= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/h2/a]"));
oneplus.click();


Thread.sleep(2000); 

JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(2000);
//js.executeScript("window.scrollBy(0,10000)");
//span[@class='a-button a-button-dropdown a-button-small cm-cr-dp-filter-dropdown']

WebElement findElement=driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small cm-cr-dp-filter-dropdown']"));
js.executeScript("arguments[0].scrollIntoView(true)", findElement);

WebElement review=driver.findElement(By.xpath("//div[contains(@id,'customer_review-R3AM75JPN0YL10')]"));
System.out.println(review.getText());

//div[@id="customer_review-R3AM75JPN0YL10"]






//js.executeScript("window.scrollBy(0,1000)");
//Thread.sleep(2000);
//js.executeScript("window.scrollBy(0,-400)");
//js.executeScript("window.scrollBy(200,0)");
  ////*[@id="customer_review-RAL3XVK0VT3BO"]
////span[@id='cr-lighthouse-term-full_charge']
	}
}