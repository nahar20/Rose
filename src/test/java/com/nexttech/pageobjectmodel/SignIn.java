package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	WebDriver driver;
	
public SignIn(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	/* constructor is not method but a special type of method
	 * constructor name and class name will be same
	 * there is no return type
	  */
	}
	
@FindBy(xpath="//*[@id=\"tdb3\"]/span[2]")
WebElement Click_MyAccount;
public WebElement MyAccount() {
	return Click_MyAccount;
	
}

@FindBy(name="email_address")
WebElement Type_EmailAddress;


public WebElement EmailAddress() {
	return Type_EmailAddress;
	
}

@FindBy(name="password")
WebElement Type_Password;
public WebElement Password() {
	return Type_Password;
	
}

@FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
WebElement Click_signin;
public WebElement signin() {
	return Click_signin;
	
}

@FindBy(xpath="")
WebElement Click_logout;
public WebElement logout() {
	return Click_logout;
	
}


}
