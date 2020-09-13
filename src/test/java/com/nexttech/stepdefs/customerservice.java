package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.SignIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customerservice {
WebDriver driver;
	
	
	@Given("^user visit homepage$")
	public void user_visit_homepage() throws Throwable {
		
		// how to open browser?
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//"key","value"
		//"driver name","path of driver"
		driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		//open URL
		driver.get("https://demo.oscommerce.com/");
		
		//driver.get("https://www.amazon.com/");
		}

	@When("^user click on customer service$")
	public void user_click_on_customer_service() throws Throwable {
    SignIn obj=new SignIn(driver);
    obj.MyAccount().click();
	   
	}

	@When("^user click on Digital service & device support$")
	public void user_click_on_Digital_service_device_support() throws Throwable {
   
	    
	}

	@Then("^user should redirect to Digital service & device support page$")
	public void user_should_redirect_to_Digital_service_device_support_page() throws Throwable {
	  
	}


	
	

}


