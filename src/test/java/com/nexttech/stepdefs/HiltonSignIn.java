package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.nexttech.pageobjectmodel.SignInHiltonPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HiltonSignIn {
	
     WebDriver driver;



@Given("^user visiting homepage$")
public void user_visiting_homepage() throws Throwable {
	
	// how to open browser?
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//"key","value"
	//"driver name","path of driver"
	driver= new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	//open URL
	//driver.get("https://www.hilton.com/en/");
	
	//driver.get("https://www.amazon.com/");
    
}
@Given("^user click on Sign in button$")
public void user_click_on_Sign_in_button() throws Throwable {
	SignInHiltonPOM POM= new SignInHiltonPOM(driver);
	POM.signin().click();
	
}

@When("^user enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_valid_and(String arg1, String arg2) throws Throwable {
	SignInHiltonPOM POM= new SignInHiltonPOM(driver);
	POM.EmailAddress().sendKeys(arg1);
	POM.password().sendKeys(arg2);
    
}

@When("^user click on sign in button$")
public void user_click_on_sign_in_button() throws Throwable {
	SignInHiltonPOM POM = new SignInHiltonPOM(driver);
	POM.Signin().click();
	
   
}

@Then("^user successfully sign in to the system$")
public void user_successfully_sign_in_to_the_system() throws Throwable {
    
 
}
}