package stepdefinitions;

import org.testng.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import applicationHooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	LoginPage obj = new LoginPage(DriverFactory.getDriver());
	String pageTitle;
	
	 @Given("user is on login page")
    public void user_is_on_login_page() {
        // Code to navigate to login page
        System.out.println("User navigates to Login Page");
    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        // Code to enter email in the login page
        System.out.println("Entered email: " + email);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        // Code to enter password
        System.out.println("Entered password: " + password);
    }

    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        // Code to click login button
        System.out.println("Login button clicked");
    }

    @Then("page contains {string} message")
    public void page_contains_message(String expectedMessage) {
        // Code to verify that page contains message
        String actualMessage = "DummyMessageFromUI"; // Replace with actual code to fetch message
        System.out.println("Verifying message: " + expectedMessage);
        
        // Example assertion
        // assertEquals(expectedMessage, actualMessage);
    }
	

}
