package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class Facebook_Login extends Library {
	
	@FindBy(id="email")
	WebElement Username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(xpath ="//*[@id=\"loginbutton\"]")
	WebElement login;

public Facebook_Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}

	public void username(String uname) {
	Username.sendKeys(uname);
	}

	public void password(String pass) {
	password.sendKeys(pass);
	}

	public void loginbutton() {
	login.click();
	}
}



