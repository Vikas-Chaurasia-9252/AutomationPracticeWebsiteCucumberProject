package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	public static WebDriver init_driver(String driver) {
		System.out.println("Browser value is: "+driver);
		
		if(driver.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless=new"); // ✅ run in background (new headless mode in Chrome 109+)
            options.addArguments("--disable-gpu");
            options.addArguments("--window-size=1920,1080");
			tldriver.set(new ChromeDriver(options));
		}
		
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return tldriver.get();
	}
	
	public static synchronized WebDriver getDriver() {
		
		return tldriver.get();
	}
	
}
