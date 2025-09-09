package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

//	https://rahulshettyacademy.com/loginpagePractise/
	
	private By username = By.id("username");
	private By password = By.id("password");
	private By checkbox = By.id("terms");
	private By signButton = By.id("signInBtn");
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void clickTerms() {
		driver.findElement(checkbox).click();
	}
	public void SignIn() {
		driver.findElement(signButton).click();
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
}
