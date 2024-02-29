package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	 public static WebDriver driver;

	public static void browserInit(String browser) {
		if(browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver =  new ChromeDriver();
		}
		else 
			System.out.println("Cannot open the browser which is not chrome.");
}
}
