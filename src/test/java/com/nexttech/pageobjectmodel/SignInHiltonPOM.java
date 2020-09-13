package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInHiltonPOM {
	
	WebDriver driver;
	
	public  SignInHiltonPOM(WebDriver driver) {
	this.driver=driver;
	
	}
	
	
	@ FindBy(xpath="//*[@id=\"NavMenu\"]/div/div/div/a[2]")
	WebElement Click_signin;
	public WebElement signin() {
		return Click_signin;
		
	}
	@FindBy(name="username")
	WebElement Type_EmailAddress;
	public WebElement EmailAddress() {
		return Type_EmailAddress;
		
	}
	
	@FindBy(id="password")
	WebElement Type_password;
	public WebElement password() {
		return Type_password;
		
		
	}
	
	
	@FindBy(xpath="//*[@id=\"__next\"]/section/form/section[3]/button")
	WebElement click_Signin;
	public WebElement Signin() {
		return click_Signin;
		
		
		
	}
 

   }
