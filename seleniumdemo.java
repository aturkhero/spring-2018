package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class seleniumdemo {
	public static void main(String[] args) {
		
		//chrome
		System.setProperty("webdriver.chrome.driver","/Users/jackturkhero/Selenium Dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//safari
		WebDriver driver2 = new SafariDriver(); 
		
		
		driver.get("https://www.facebook.com");
		
		driver2.get("https://www.youtube.com");
		
		
		
	}

}
