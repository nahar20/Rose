package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.ArticlesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Articles {
	WebDriver driver;
	

@Given("^user wants to visit mrbool homepage$")
public void user_wants_to_visit_mrbool_homepage() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	//"key","value"
	//"driver name","path of driver"
	driver= new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	//open URL
	//driver.get("https://demo.oscommerce.com/");
	
	//driver.get("https://www.amazon.com/");
	driver.get("http://mrbool.com/");
		
   
}


@When("^user move the cursor on the content menu and click on Articles$")
public void user_move_the_cursor_on_the_content_menu_and_click_on_Articles() throws Throwable {
	
	ArticlesPOM POM= new ArticlesPOM(driver);
	Actions act= new Actions(driver);
	act.moveToElement(POM.content()).build().perform();
	POM.Articles().click();
	
	
	
 }

@Then("^user successfully redirect to the Articles page$")
public void user_successfully_redirect_to_the_Articles_page() throws Throwable {
	ArticlesPOM POM =new ArticlesPOM(driver);
	POM.articlessuccessfully().click();
	
  
}


	

}
