package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Library;

public class FaceBook_RegisterPage extends Library{
	
@FindBy(id="u_0_m")
WebElement firstname;
@FindBy(id="u_0_o")
WebElement lastname;
@FindBy(id="u_0_r")
WebElement emailaddress;
@FindBy(name="reg_passwd__")
WebElement password;



public FaceBook_RegisterPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void firstname(String fname) {
firstname.sendKeys(fname);
}

public void lastname(String lname) {
lastname.sendKeys(lname);
}

public void emailaddress(String email) {
emailaddress.sendKeys(email);
}

public void password(String pass) {
password.sendKeys(pass);
}




}
