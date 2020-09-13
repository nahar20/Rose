package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Laptops {

	
	WebDriver driver;
	
	public Laptops(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
//Hover on Products
@FindBy(xpath="//*[@id=\"l1\"]")	
WebElement hover_products;
public WebElement products() {
	return hover_products;
	
	
}
	
@FindBy(xpath="//*[@id=\"l1_1\"]/span")
WebElement hover_Laptop;
public WebElement Laptop() {
	return hover_Laptop;
	
}

	
	
}
