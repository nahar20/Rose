package com.nexttech.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action {
	
	WebDriver driver;
	@Test
	public void dropdown() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//"key","value"
		//"driver name","path of driver"
		driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://mrbool.com/");
		Actions act=new Actions(driver);// creating object
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/a"))).build().perform();
		//driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[1]/a")).click();
		
		//Dell
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"l1\\\"]"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"l1_1\"]/span")).click();
		
		Thread.sleep(40000);
		
		
	}
	
	

	
	
	
	
	
	
}
