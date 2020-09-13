package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.Laptops;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellLaptop {
	
	WebDriver driver;
	
	@Given("^user visiting Dell homepage$")
	public void user_visiting_Dell_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//"key","value"
		//"driver name","path of driver"
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Open URL
		driver.get("https://www.dell.com/en-us");
		
	}

	@When("^user move the cursor on produts then Laptops and user redirect to the page$")
	public void user_move_the_cursor_on_produts_then_Laptops_and_user_redirect_to_the_page() throws Throwable {
		
	Laptops POM= new Laptops(driver);
	Actions Act=new Actions(driver);
	Act.moveToElement(POM.products()).build().perform();
	
	POM.Laptop().click();
	    
	}

	@Then("^user should be able to see laptops of Dell$")
	public void user_should_be_able_to_see_laptops_of_Dell() throws Throwable {
	   
	}

}
