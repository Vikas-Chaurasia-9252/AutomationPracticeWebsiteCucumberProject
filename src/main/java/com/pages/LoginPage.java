package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Utility;

public class LoginPage {

//	https://rahulshettyacademy.com/loginpagePractise/
	private Utility utilityobj;
	private By email = By.name("email");
	private By password = By.name("password");
	private By checkbox = By.id("terms");
	private By signButton = By.xpath("//button[@data-qa='login-button']");
	private By welCOmeText = By.xpath("//a[contains(text(),' Logged in as ')]");
	private By ErrorMessage = By.xpath("//p[text()='Your email or password is incorrect!']");
	private By loginLink = By.xpath("//a[text()=' Signup / Login']");
	private By loginForm = By.xpath("//h2[.='Login to your account']");
	private WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void clickLoginBtn(){
		utilityobj = new Utility(driver);
		driver.findElement(loginLink).click();
		utilityobj.waitForElementTobeVisible(loginForm);


	}
	public void enterEmail(String email1) {
		driver.findElement(email).sendKeys(email1);
	}
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void LogIn() {
		driver.findElement(signButton).click();
	}
	public String getWelcomeText() {
		return driver.findElement(welCOmeText).getText();
	}
	public String getErrorMessage() {
		return driver.findElement(ErrorMessage).getText();
	}
	
}
