package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticlesPOM {
WebDriver driver;

public ArticlesPOM(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

//Content

@FindBy(xpath="//*[@id=\"headermenudesktop\"]/ul/li/a")
WebElement hover_content;
public WebElement content() {
	return hover_content;

	}

//Articles
@FindBy(xpath="//*[@id=\"headermenudesktop\"]/ul/li/ul/li[1]/a")
WebElement Click_Articles;
public WebElement Articles() {
	return Click_Articles;
	
}

// Articles Validations

@FindBy(xpath="//div[@class='span8']")
WebElement click_articlessuccessfully;
public WebElement articlessuccessfully() {
	return click_articlessuccessfully;
	
}
	
	
}
