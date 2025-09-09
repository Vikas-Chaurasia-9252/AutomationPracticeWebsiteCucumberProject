package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	public static WebDriver init_driver(String driver) {
		System.out.println("Browser value is: "+driver);
		
		if(driver.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return tldriver.get();
	}
	
	public static synchronized WebDriver getDriver() {
		
		return tldriver.get();
	}
	
}
