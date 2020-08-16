package com.org.DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class ExcelLogin {
	public void login() throws IOException{
		FileInputStream source = new FileInputStream("C:\\Users\\Sangeetha\\Desktop\\DataDriven.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(source);
		XSSFSheet sheet = wbook.getSheet("sheet1"); 
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total Row Count : "+rowcount);
		
		for(int i=1;i<=rowcount;i++){
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.getCell(0);
			String username=cell.getStringCellValue();
			XSSFCell cell1=row.getCell(1);
			String password=cell.getStringCellValue();
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			WebElement name=driver.findElement(By.id("email"));
			name.sendKeys(username);
			WebElement passwordd =driver.findElement(By.id("pass"));
			passwordd.sendKeys(password);
			WebElement login= driver.findElement(By.id("u_0_b"));
			login.click();

}
}		
}
