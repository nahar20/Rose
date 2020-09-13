package com.nexttech.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action1 {

	WebDriver driver;
	@Test
	
	public void clickdropdown() {
 
		// Open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
    
		
	// To open URL
	driver= new ChromeDriver();
	driver.get("https://www.dell.com/en-us");
	
	// creating object of Actions class
    Actions act=new Actions(driver);
    
    //Hover on Product
   act.moveToElement(driver.findElement(By.xpath("//*[@id=\"l1\"]"))).build().perform();
   
   // hover on Laptop
   driver.findElement(By.xpath("//*[@id=\"l1\"]")).click();
			
	
		
	}
	
	
	
}
