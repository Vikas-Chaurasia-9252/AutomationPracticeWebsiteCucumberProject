package stepdefinitions;

import org.openqa.selenium.WebDriver;


import com.factory.DriverFactory;
import com.pages.LoginPage;

import applicationHooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import org.junit.Assert;

public class LoginPageSteps {
	private WebDriver driver;
    private LoginPage obj;

	
	 @Given("user is on login page")
    public void user_is_on_login_page() {
        // Code to navigate to login page
		 driver = DriverFactory.getDriver();  
        obj = new LoginPage(driver);
        System.out.println("User navigates to Login Page");
		driver.get("https://automationexercise.com/login");
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        // Code to enter email in the login page
        System.out.println("Entered email: " + email);
		obj.enterEmail(email);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        // Code to enter password
        System.out.println("Entered password: " + password);
		obj.enterPassword(password);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        // Code to click login button
        System.out.println("Login button clicked");
		obj.LogIn();
    }

    @Then("page contains {string} message")
    public void page_contains_message(String expectedMessage) {
        // Code to verify that page contains message
       String actualMessage;
		if (expectedMessage.equals("Your email or password is incorrect!")) {
        actualMessage = obj.getErrorMessage();
    } else if (expectedMessage.contains("Logged in as Vikas")) {
        actualMessage = obj.getWelcomeText();
		actualMessage = actualMessage.trim();
    } else {
        actualMessage="";
		System.out.println("Message did not match");

    }

    System.out.println("Verifying message: " + expectedMessage);
    Assert.assertEquals(expectedMessage, actualMessage);
    }
	

}
